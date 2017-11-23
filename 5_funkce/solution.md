# Řešení úkolů
## První úkol (2b)
Napište funkci, která převede čísla 0..9 na text
* 0 => Nula
* 1 => Jedna
* ...
* 9 => Devět

```javascript
function task_1(number) {
	switch(number) {
        case 0: return "Nula";
        case 1: return "Jedna";
        case 2: return "Dva";
        case 3: return "Tři";
        case 4: return "Čtyři";
        case 5: return "Pět";
        case 6: return "Šest";
        case 7: return "Sedm";
        case 8: return "Osm";
        case 9: return "Devět";
     }
}
```
poznámka: Mohlo být pooužito i console.log místo return bez ztráty bodů

## Druhý úkol (3b)
Napište funkci, která bude přijímat parametr celé číslo. Funkce vypíše čísla od jedné až do čísla, které je vstupem. Vstup MUSÍ být celé číslo větší než nula - nutno udělat kontrolu.
```javascript
function task_2(number) {
	// vypsání čísel pomocí for cyklu
	for (var i = 1; i <= number; i++) {
		console.log(i);
    }
}
```

## Bonusová úloha (5b)
Zkombinujte obě funkce tak, aby vstup bylo celé číslo větší než nula. Výstup byla opět série od jedničky. Ale výstup bude z číslic přeložen na text.

### Řešení pomocí modulo
```javascript
function task_3(number) {
	for (var i = 1; i <= number; i++) {
		// udělám si kontejner kam budu dávat zprávu kterou vypíšu
		var msg = ""; 
        
		// tohle dělám abych si nesahal na `i` což je iterator
        var temporary = i;    
        
        // opakuji dokud je číslo větší než nula 
        // (pro vstup nula mi to tedy vrátí prázdný string :-))
        while (temporary > 0) { 
            
            // tímto získám poslední číslo protože 321 % 10 = 1
            var num = temporary % 10;
            
             // (321 - 1) / 10 = 320 / 10 = 32
            temporary = (temporary - num) / 10;
            
             // pomocí první úlohy (proto ten RETURN) si převedu číslo na string,
             // protože jedu od konce.. musím počítat s tím,
             // že dosavadní zprávu přiletím za to...
            msg = task_1(num) + " " + msg;
        }
        console.log(msg);
	}
}
```

### Řešení pomocí převedení čísla na String (chová se jako pole)
- využívám toho že String se chová jako pole charů (tedy jednotlivých znaků)
```javascript
function task_3(number) {
	for (var i = 1; i <= number; i++) {
		
		// převedu si číslo na String (číslo + String = String)
		var str = i + "";
		
		// udělám si kontejner kam budu dávat zprávu kterou vypíšu
		var msg = "";
		
		// pro délku Stringu (j bude nabývat hodnot (0:length-1)
		// což jsou první a poslední index pole
		for (var j = 0; j < str.length; j++) {
			
			// pokud v msg už něco je.. pak přidám mezeru (aby to dělalo mezeru mezi slovy)
			if (msg.length > 0) {
				msg += " ";
            }
            
            // do msg přidám přeložené číslo pomocí task_1 (proto ten RETURN),
            // parseInt mi zase ze Stringu udělá Int
			msg += task_1(parseInt(str[j]));
        }
		console.log(msg);
    }
}
```