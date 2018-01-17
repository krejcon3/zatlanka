function validateForm() {
    var x = document.forms["Kontaktujte"]["name"].value;
    if (x == "") {
        alert("Musíte vyplnit jméno!");
        return false;
    }
	var y = document.forms["Kontaktuje"] ["email"].value;
	if (y == "") {
		alert("Musíte vyplnit email!");
		return false;
	}
	var z = document.forms["Kontaktuje"] ["zprava"].value;
	if (z == "") {
		alert("Musíte vyplnit zprávu!");
		return false;}
}