function mfoto() {
	var z = document.getElementById('form_fotka').value;

	document.getElementById("vysledek").innerHTML = "Bude tě to stát " + parseInt(z) * 350 + " Kč";
}
