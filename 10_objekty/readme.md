# Informace
## Objektově orientované programování
- popisuje různé objekty (ať už reálné či abstraktní) pomocí atributů a funkcí
- umožňuje přehlednější kód, ale i komplikovanější přístup k programování
- zapouzdřuje logické celky dohromady

### Třída, instance třídy, objekt
- Třída definuje vlastnosti a atributy
- Objekt je přímý prvek s vlastnostmi definovanými danou třídou
- Instace třídy = Objekt

```text
Můžeme si představit, že třída je jakýsi recept například na dort.
Pokud podle tohoto receptu opravdu dort upečeme,
získáme objekt, ke kterému můžeme aktivně přistupovat tedy sníst ho.
```

## Objektové programování v JS
- velmi zjednodušeně řečeno: v JavaScriptu je vše funkce :-)

## Formální zásady
### Názvy atributů
- začínají malým písmenem a klíčovým slovem var
```javascript
var myVariable = "Josef Novák";
```

### Názvy funkcí
- začínají malým písmenem a klíčovým slovem function
```javascript
function myFunction( /* variables */ ) { /* code */ }
```

### Názvy tříd
- "mix" proměnné a funkce
- proměnná začíná velkým písmenem, přiřazujeme do ní funkci beze jména 
```javascript
var MyClass = function( /* variables */ ) { /* code */ }
```

## Aplikace tříd
### Definice třídy včetně základních atributů a vlastností
```javascript
var Human = function(input_name, input_surname, input_age) {
	var name = input_name;
	var surname = input_surname;
	var age = input_age;
	var hunger = 50;
	
	this.getName = function() { 
		return name;
	};
	
	this.getSurname = function() {
		return surname;
	};
	
	this.getAge = function() {
		return age;
	};
	
	this.getFullName = function() {
	    return name + " " + surname;
	};
	
	this.getHunger = function() {
	    return hunger;
	};
	
	this.eat = function() {
	    hunger = Math.max(0, hunger -= 10);
	}
}
```

### Vytvoření objektu
- vytváříme pomocí konstruktoru
    - konstruktor je funkce, která vrací instanci třídy. V našem případě je konstruktor definován jako ```function(input_name, input_surname, input_age)```
    - konstruktor voláme názvem třídy tedy ```Human``` a klíčovým slovem ```new```
```javascript
var karel_novak = new Human("Karel", "Novák", 25);
```

### Volání funkcí třídy
- jednotlivé funkce třídy můžeme volat přímo na instanci pomocí znaku tečky a zavolání metody
```javascript
karel_novak.getName(); // Karel
karel_novak.getSurname(); // Novák
karel_novak.getAge(); // 25
karel_novak.getFullName(); // Karel Novák
karel_novak.getHunger(); // 50
karel_novak.eat();
karel_novak.getHunger(); // 40
karel_novak.eat();
karel_novak.getHunger(); // 30
karel_novak.eat();
karel_novak.getHunger(); // 20
karel_novak.eat();
karel_novak.getHunger(); // 10
karel_novak.eat();
karel_novak.getHunger(); // 0
karel_novak.eat();
karel_novak.getHunger(); // 0
karel_novak.eat();
```

## Zadání úkolů
### První úkol (2b)
Vytvořte třídu pro nohu (od židle), třída bude mít atributy ```x, y, z``` pro rozměry nohy  

### Druhý úkol (3b)
Vytvořte třídu pro židli, pro třídu použijte 4x objekt nohy židle, 1x objekt sedák a 1x objekt opěradlo, objekt sedák a opěradlo budou mít také atributy ```x, y, z```

### Bonusová úloha (5b)
Vytvořte funkce pro židli, které vrátí výsledné rozměry židle
