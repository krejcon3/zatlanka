# Řešení úkolů
## První úkol (2b)
Vytvořte funkci, která bude vracet pole s náhodně vygenerovanými prvky od 0 do 100. Vstupní parametr funkce bude délka pole.
```javascript
function task_1(number) {
    var pole = [];
    for (var i = 0; i < number; i++) {
        pole[i] = Math.floor(Math.random() * 100);
    }
    return pole;
}
```

## Druhý úkol (3b)
Vytvořte funkci, která bude přijímat pole celočíselných hodnot a výstup bude součet všech prvků pole. Není dovoleno používat funkci ```reduce```
```javascript
function task_2(array) {
	var sum = 0;
	for (var i = 0; i < array.length; i++) {
	    sum += array[i];
	}
	return sum;
}
```

## Bonusová úloha (5b)
Vytvořte funkci, která bude přijímat pole celočíselných hodnot, výstupem funkce bude hodnota mediánu tohoto pole.
### Řešení pomocí funkce sort
```javascript
function task_3(array) {
	array = array.sort();
	if (array.length % 2 == 0) {
		
		// !!! JEN PRO SUDÁ ČÍSLA !!!
		// např v poli o délce 6 potřebuji hodnoty na indexu 2 a 3
		// 6 / 2 = 3 
		// (6 / 2) - 1 = 2
		// pak si vezmu hodnoty na těchto indexech, sečtu je a vydělím 2 => průměr
	    return (array[array.length / 2] + array[(array.length / 2) - 1]) / 2;
	} else {
		
		// !!! JEN PRO LICHÁ ČÍSLA !!!
		// vrátím hodnotu na prostředním indexu v poli
		// 9 / 2 = 4.5 (ale prostřední je 5 (tedy index 4!), proto musíme zaokrouhlit dolů `Math.floor`
	    return array[Math.floor(array.length / 2)]; 
	}
}
```

### Řešení pomocí vlastního řazení
```javascript
function task_3(array) {
	// použiji například bubble sort
	// pro více info: https://www.youtube.com/watch?v=lyZQPjUT5B4
	// nebo https://www.algoritmy.net/article/3/Bubble-sort
	for (var i = 0; i < array.length; i++) {
	    for (var j = 1; j < array.length; j++) {
	        if (array[j] < array[j - 1]) {
	            var tmp = array[j];
	            array[j] = array[j - 1];
	            array[j - 1] = tmp;
	        }
	    }
	}
	
	if (array.length % 2 == 0) {
        
        // !!! JEN PRO SUDÁ ČÍSLA !!!
        // např v poli o délce 6 potřebuji hodnoty na indexu 2 a 3
        // 6 / 2 = 3 
        // (6 / 2) - 1 = 2
        // pak si vezmu hodnoty na těchto indexech, sečtu je a vydělím 2 => průměr
        return (array[array.length / 2] + array[(array.length / 2) - 1]) / 2;
    } else {
        
        // !!! JEN PRO LICHÁ ČÍSLA !!!
        // vrátím hodnotu na prostředním indexu v poli
        // 9 / 2 = 4.5 (ale prostřední je 5 (tedy index 4!), proto musíme zaokrouhlit dolů `Math.floor`
        return array[Math.floor(array.length / 2)]; 
    }
}
```
