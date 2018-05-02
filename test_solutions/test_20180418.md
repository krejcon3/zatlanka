1) definujte proměnnou 'a' a uložte do ní libovolnou pravdivostní hodnotu [1b]

```javascript
var a = true; // nebo false
```

2) vytvořte funkci, která bude přijímat 2 parametry a vracet jejich součet [1b]

```javascript
function example(a, b) {
    return a + b;
}
```

3) Co musí splňovat rekurzivní funkce? [1b]
    a) nemá `NÁVRATOVOU` hodnotu
    b) volá sama sebe
    c) nemá `VSTUPNÍ` argumenty
    d) vykonává se do nekonečné smyčky
    
```
Rekurzivní funkce je taková funkce, která volá sama sebe
```

4) Co to je funkce typu VOID a k čemu v takové funkci slouží magické slůvko RETURN? [1b]
```
Funkce typu VOID nemá definovanou návratovou hodnotu.
RETURN okamžitě zastavuje provádění funkce a vrací hodnotu k němu připojenou.
RETURN ve funkci VOID nesmí vracet žádnou hodnotu a tedy jen ukončuje funkci.
V případě, že se k němu hodnota připojí, nejedná se už o funkci VOID. 
```

5) Napište funkci včetně hlavičky, která přijme parametr definující rozměry čtvercového pole. Toto pole vyplňte číslem 0,
v diagonály vyplňte číslem 1. [3b]

```javascript
function example(size) {
	var array = [];
	for (var i = 0; i < size; i++) {
		for (var j = 0; j < size; j++) {
			if (array[i] === undefined) array[i] = [];
			array[i][j] = 0;
		}
	}
	for (var k = 0; k < size; k++) {
		array[k][k] = 1;
		array[k][size - k - 1] = 1;
	}
	return array;
}
```

6) Napište JSON objekt, který bude obsahovat: [3b]
 a) atribut s názvem alphabet jako pole hodnot: A, B, C, D, E, F
 b) atribut s názvem name a hodnotou: orákulum
 c) atribut s názvem sum a číslem jež odpovídá počtu prvků pole alphabet: 6

```json
{
    "alphabet": ["A", "B", "C", "D", "E", "F"],
    "name": "orákulum",
    "sum": 6
}
```

7) Pomocí JavaScriptu vypište postupně všechny hodnoty objektu definovaného výše [5b]
```javascript
function example(object) {
	for (var i = 0; i < object.alphabet.length; i++) {
		console.log(object.alphabet[i]);
	}
	console.log(object.name);
	console.log(object.sum);
}
```