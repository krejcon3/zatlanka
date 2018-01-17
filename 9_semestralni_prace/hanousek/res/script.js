// JavaScript Document


(function() {
    var input = document.createElement('input');
    var supports = {};
    
    supports.autofocus   = 'autofocus' in input;
    supports.required    = 'required' in input;
    supports.placeholder = 'placeholder' in input;
 
    if(!supports.autofocus) {
         
    }
     
    if(!supports.required) {
         
    }
 
    if(!supports.placeholder) {
         
    }
     
    var send = document.getElementById('contact-submit');
    if(send) {
        send.onclick = function () {
            this.innerHTML = '...Sending';
        }
    }
 
})();	


function hide_whole_riddle(){
  var x = document.getElementById("potion_riddle");
  if (x.style.display === "none"){
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

document.getElementById("hadanka_header").addEventListener("click", hide_whole_riddle);
	
	
function hide_video(){
  var x = document.getElementById("video");
  if (x.style.display === "none"){
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

document.getElementById("video_header").addEventListener("click", hide_video);


function hide_riddle(){
  var x = document.getElementById("riddle_text");
  if (x.style.display === "none"){
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

document.getElementById("riddle_header").addEventListener("click", hide_riddle);


function hide_factorial(){
  var x = document.getElementById("factorial");
  if (x.style.display === "none"){
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

document.getElementById("factorial_header").addEventListener("click", hide_factorial);
	
	

	

function calculate(){
  var userInput = document.getElementById ("factorial_input").value;
  var checkValue = isNaN(userInput);
  if (!checkValue) {
    document.getElementById('factorial_inputID').innerHTML = userInput;
    var final = 1;
    while(userInput >= 1) {
        final = final * userInput;
        userInput--;
    }
    
    document.getElementById('checkValue').innerHTML = final;
	}
}
	
	
document.getElementById("factorial_button").addEventListener("click", calculate);
	
	
	