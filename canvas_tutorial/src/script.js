function run() {
	var canvas = document.getElementsByTagName("canvas")[0];
	var context = canvas.getContext("2d");

	// top-left to bottom-right
	context.beginPath();
	context.moveTo(0, 0);
	context.lineTo(800, 500);
	context.closePath();
	context.strokeStyle = "red";
	context.stroke();

	// top-right to bottom-left
	context.beginPath();
	context.moveTo(800, 0);
	context.lineTo(0, 500);
	context.closePath();
	context.strokeStyle = "red";
	context.stroke();

	// draw circles
	for (var r = 10; r <= 250; r += 10) {
		context.beginPath();
		context.arc(400, 250, r, 0, 2 * Math.PI);
		context.closePath();
		context.strokeStyle = "blue";
		context.stroke();
	}
}

$(document).ready(function() {
	run();
});