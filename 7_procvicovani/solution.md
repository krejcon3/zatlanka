## Zadání úkolů
### První úkol (2b)
Vytvořte funkci pro výpočet faktoriálu. Použijte rekurzi.
```javascript
function faktorial(n) {
    if (n < 2) {
        return 1;
    }
    return n * faktorial(n - 1);
}
```

### Druhý úkol (3b)
Vytvořte funkci pro seřazení pole od největšího k nejmenšímu. Použijte algoritmus pro bubblesort.
```javascript
function bubblesort(a) {
    for (var i = 0; i < a.length; i++) {
        for (var j = 1; j < a.length; j++) {
            if (a[j - 1] < a[j]) {
                var temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
            }            
        }
    }
    return a;
}
```

### Bonusová úloha (5b)
Vytvořte 2 funkce. Jedna funkce bude převádět stupně Celsia na Fahrenheita, druhá bude fungovat obráceně.
```javascript
function F2C(n) {
    return (n - 32) * 5 / 9;
}

function C2F(n) {
	return n * 9 / 5 + 32;
}
```
