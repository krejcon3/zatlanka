function run() {
	var canvas = document.getElementById("canvas");
	var context = canvas.getContext("2d");

	var playground = createTwoDimensionalArray(4 /* size of array 4x4 */ );
	var player = 0;
	drawPlayground(context, playground);

	canvas.addEventListener("click", function(e) {
		var coords = getMousePos(canvas, e);
		coords.x = Math.floor(coords.x / (context.canvas.width / playground.length)); // calc sectors
		coords.y = Math.floor(coords.y / (context.canvas.height / playground.length)); // calc sectors
		console.log(coords);
		playground[coords.x][coords.y] = player; // add mark of player
		player = (player + 1) % 2; // change player
		drawPlayground(context, playground);
	});
}

function drawPlayground(context, playground) {
	context.clearRect(0, 0, context.canvas.width, context.canvas.height);
	var widthStep = (context.canvas.width / playground.length);
	var heightStep = (context.canvas.height / playground.length);
	for (var k = 1; k < playground.length; k++) {
		context.beginPath();
		context.moveTo(0, heightStep * k);
		context.lineTo(context.canvas.width, heightStep * k);
		context.closePath();
		context.strokeStyle = 'black';
		context.lineWidth = 3;
		context.stroke();

		context.beginPath();
		context.moveTo(widthStep * k, 0);
		context.lineTo(widthStep * k, context.canvas.height);
		context.closePath();
		context.strokeStyle = 'black';
		context.lineWidth = 3;
		context.stroke();
	}

	for (var i = 0; i < playground.length; i++) {
		for (var j = 0; j < playground.length; j++) {
			var padding = 10;
			switch (playground[i][j]) {
				case 0:
					context.beginPath();
					context.arc((widthStep * (i + 1)) - (widthStep / 2), (heightStep * (j + 1)) - (heightStep / 2), Math.min(widthStep, heightStep) / 2 - padding, 0, 2 * Math.PI);
					context.closePath();
					context.strokeStyle = 'blue';
					context.lineWidth = 5;
					context.stroke();
					break;
				case 1:
					context.beginPath();
					context.moveTo(widthStep * i + padding, heightStep * j + padding);
					context.lineTo(widthStep * (i + 1) - padding, heightStep * (j + 1) - padding);
					context.closePath();
					context.strokeStyle = 'red';
					context.lineWidth = 5;
					context.stroke();

					context.beginPath();
					context.moveTo(widthStep * i + padding,  heightStep * (j + 1) - padding);
					context.lineTo(widthStep * (i + 1) - padding, heightStep * j + padding);
					context.closePath();
					context.strokeStyle = 'red';
					context.lineWidth = 5;
					context.stroke();
					break;
			}
		}
	}
}

function getMousePos(canvas, evt) {
	var rect = canvas.getBoundingClientRect();
	return {
		x: evt.clientX - rect.left,
		y: evt.clientY - rect.top
	};
}

function createTwoDimensionalArray(size) {
	var array = new Array(size); // ordinary array
	for (var i = 0; i < size; i++) {
		array[i] = new Array(size); // add array to array (make array of arrays)
	}
	return array;
}

$(document).ready(function() { run(); });

