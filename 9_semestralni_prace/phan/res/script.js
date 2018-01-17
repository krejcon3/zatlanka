
var greetings = new Array ();
greetings[0] = "Xin chào";
greetings[1] = "Ahoj";
greetings[2] = "Hello";
greetings[3] = "Ni Hao";
greetings[4] = "Konnichiwa";
greetings[5] = "Annyeonghaseyo";
greetings[6] = "Hallo";

var i = Math.floor(7*Math.random())

document.write('<div class="hello">' + greetings[i] + '</div>');




jQuery(document).ready(function(){
	jQuery('.skillbar').each(function(){
		jQuery(this).find('.skillbar-bar').animate({
			width:jQuery(this).attr('data-percent')
		},8000);
	});
});

$(function(){
    $('.fadein img:gt(0)').hide();
    setInterval(function(){
      $('.fadein :first-child').fadeOut()
         .next('img').fadeIn()
         .end().appendTo('.fadein');}, 
      3000);
});


$(function() {
  var flag = false;
  var result = $(".result input");
  $(".number").on("click", function() {
    if (flag) {
      result.val("");
      flag = false;
    }
    var number = $(this).html();
    var text = result.val();
    result.val(text + number);
  });
  $(".operate").on("click", function() {
    flag = false;
    var operate = $(this).html();
    var text = result.val();
    result.val(text + operate);
  });
  $(".equal").on("click", function() {
    result.val(eval(result.val()));
    flag = true;
  });
  $(".clear").on("click", function() {
    result.val("");
  });
  $(".delete").on("click", function() {
    var text = result.val();
    if (text) {
      if (flag) {
        result.val("");
      } else {
        result.val(text.replace(text.slice(-1), ""));
      }
    }
  });
});

$(document).ready(function() {

});