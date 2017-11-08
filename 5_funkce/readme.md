# Informace
## Základní datové typy
### Číselné typy

* Celá čísla
    * Int: 1,2,3,4,-800
    * Long
    * Short
* Desetinná čísla
    * Double
    * Float

### Textové typy
* Znak
    * Char: 'z', '?'
* Řetězec
    * String: "řetězec"

### Ostatní
* Pravdivostní ohodnocení
    * Boolean, Bool: true|false
    
### Zkratky
* i++
* ++i

```javascript
var i = 0;
if (i++ == 1) {
    console.log("T");
} else {
    console.log("F");
}
// Výsledek je F... PROČ?
```

```javascript
var i = 0;
if (++i == 1) {
    console.log("T");
} else {
    console.log("F");
}
// Výsledek je T... PROČ?
```

## Řízení toku programu
### Podmínky 
* IF & ELSE
```javascript
if (true || false) {
    // proběhne pokud je boolean TRUE
} else {
    // proběhne pokud je boolean FALSE
}
```
* SWITCH
```javascript
switch (value) {
    case 1: console.log("Jedna"); break;
    case 2: console.log("Dva"); break;
    default: console.log("Moc"); 
}
```

### Cykly
* for
```javascript
for (var i = 0; i < 10; i++) {
    console.log(i);
}
```
* while
```javascript
var i = 0;
while (i < 10) {
    console.log(i);
    i++;
}
```
```javascript
var i = -1;
while (++i < 10) {
    console.log(i);
}
```

### Funkce
* používáme pro zapouzdření a znovupoužitelnost kódu
```javascript
function salute() {
    console.log("Dobrý den!");
}
function print(message) {
	console.log(message);
}
salute(); // vypíše: Dobrý den
print("Nazdar"); // vypíše: Nazdar
```

## Zadání úkolů
### První úkol (2b)
Napište funkci, která převede čísla 0..9 na text
* 0 => Nula
* 1 => Jedna
* ...
* 9 => Devět

### Druhý úkol (3b)
Napište funkci, která bude přijímat parametr celé číslo. Funkce vypíše čísla od jedné až do čísla, které je vstupem. Vstup MUSÍ být celé číslo větší než nula - nutno udělat kontrolu.
```javascript
// pro číslo 5 bude výstup
1
2
3
4
5
```

### Bonusová úloha (5b)
Zkombinujte obě funkce tak, aby vstup bylo celé číslo větší než nula. Výstup byla opět série od jedničky. Ale výstup bude z číslic přeložen na text.
```javascript
// pro číslo 15 bude výstup
"Jedna"
"Dva"
"Tři"
"Čtyři"
"Pět"
"Šest"
"Sedm"
"Osm"
"Devět"
"Jedna Nula"
"Jedna Jedna"
"Jedna Dva"
"Jedna Tři"
"Jedna Čtyři"
"Jedna Pět"
```
