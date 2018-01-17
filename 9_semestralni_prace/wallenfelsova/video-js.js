var button = document.getElementById("video"), video=document.querySelector("video"); 
button.addEventListener("click", 
function playPause() { 
if (video.paused) 
	video.play(); 
else video.pause(); 
return false; })