function run() {
	var finalDate = new Date (new Date().getTime() + 15 * 60 * 1000);
	setInterval(function() {
		var timer = new Date(finalDate.getTime() - new Date().getTime());
		document.getElementById("timer").innerText = formatNumber(timer.getMinutes()) + ":" + formatNumber(timer.getSeconds());
	}, 100);
}

function formatNumber(number) {
	return number > 9 ? number + "" : "0" + number;
}

$(document).ready(function() {
	run();
});

