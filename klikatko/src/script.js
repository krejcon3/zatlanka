function run() {
	var canvas = document.getElementById("canvas");
	var context = canvas.getContext("2d");

	context.font = "30px Arial";
	context.fillText("Klikni a hraj!", 325, 200);

	var iteration = 5;
	var circle = null;
	var start = null;
	canvas.addEventListener("click", function(e) {
		if (circle == null) {
			circle = {x: 0, y: 0, r: 0};
			context.clearRect(0, 0, canvas.width, canvas.height);
			circle.r = iteration-- * 10;
			circle.x = Math.floor((Math.random() * (800 - 2 * circle.r)) + circle.r);
			circle.y = Math.floor((Math.random() * (400 - 2 * circle.r)) + circle.r);
			drawCircle(context, circle);
			start = new Date();
		} else {
			if (checkClicked(circle, getMousePos(canvas, e))) {
				handleTime(iteration, start);
				context.clearRect(0, 0, canvas.width, canvas.height);
				if (iteration > 0) {
					circle.r = iteration * 10;
					circle.x = Math.floor((Math.random() * (800 - 2 * circle.r)) + circle.r);
					circle.y = Math.floor((Math.random() * (400 - 2 * circle.r)) + circle.r);
					drawCircle(context, circle);
					start = new Date();
				} else {
					document.getElementById("form").submit();
				}
				iteration--;
			}
		}
		console.log(iteration);
	});
}

function handleTime(iteration, date) {
	if (date) {
		document.getElementById("time_" + (5 - iteration)).value = new Date().getTime() - date.getTime();
	}
}

function checkClicked(circle, coords) {
	return Math.pow(coords.x - circle.x, 2) + Math.pow(coords.y - circle.y, 2) <= Math.pow(circle.r, 2);
}

function getMousePos(canvas, evt) {
	var rect = canvas.getBoundingClientRect();
	return {
		x: evt.clientX - rect.left,
		y: evt.clientY - rect.top
	};
}

function drawCircle(context, circle) {
	context.beginPath();
	context.arc(circle.x, circle.y, circle.r, 0, 2 * Math.PI);
	context.stroke();
	context.fill();
}

$(document).ready(function() {
	run();
});

