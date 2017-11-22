# Informace
## Pole

```javascript
var array1 = [];
var array2 = [1, 2, 3, 4];
```
- Co to je?
- Proč to používat?
- Jaké typy mohou být v poli použité?

## Rekurzivní funkce
- co to je?
- k čemu to může sloužit?
- co musí být definováno v rekurzivní funkci?
- jaké je nebezpečí rekurzivní funkce?

## Vlastnosti pole
- délka
- indexování (první a poslední index)
- přistupování k jednotlivým prvkům

## Fibonacciho posloupnost
### Pomocí rekurze
```javascript
function fibonacci_recursion(number) {
    if (number < 1) {
        return 0;
    }
    if (number == 1) {
        return 1;
    }
    return fibonacci_recursion(number - 1) + fibonacci_recursion(number - 2);
}
```
### Pomocí pole
```javascript
function fibonacci_array(number) {
    var array = [0, 1];
    for (var i = 2; i <= number; i++) {
        array[i] = array[i - 1] + array[i - 2];
    }
    return array[number];
}
```

## Zadání úkolů
### První úkol (2b)
Vytvořte funkci, která bude vracet pole s náhodně vygenerovanými prvky od 0 do 100. Vstupní parametr funkce bude délka pole.

### Druhý úkol (3b)
Vytvořte funkci, která bude přijímat pole celočíselných hodnot a výstup bude součet všech prvků pole. Není dovoleno používat funkci ```reduce```
```
[1, 2, 3] => 6
```

### Bonusová úloha (5b)
Vytvořte funkci, která bude přijímat pole celočíselných hodnot, výstupem funkce bude hodnota mediánu tohoto pole.
```
[1, 2, 3] => 2 // prostřední prvek
[1, 2, 3, 4] => 2.5 // průměr prostředních prvků
```
