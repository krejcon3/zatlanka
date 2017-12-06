# Informace
## Moderní webové stránky
- HTML/CSS
- JavaScript (JS)

## Proč používat JS?

## Jak JS zakomponovat do webu?

### DOM
```javascript
var id = document.getElementById("container");
var tagName = x.getElementsByTagName("p");
var className = document.getElementsByClassName("article-text");
var selector = document.querySelectorAll("p.article-text");
```

## Eventy a event listenery
```javascript
element.addEventListener("click", function() {
    alert("Hello World!");
});
```

## Timery
```javascript
setTimeout(function() {
	alert("Hello");
}, 3000);

setInterval(function() {
	alert("Hello"); 
}, 3000);
```

## Zadání úkolů
### První úkol (2b)
Použijte web_sablona. Přidejte 3x nadpis druhé úrovně s odstavcem a nastylujte tak aby byl text nadpisů modrý.  

### Druhý úkol (3b)
Při kliknutí na nadpis skryjte odstavec pod ním (použijte javascript).

### Bonusová úloha (5b)
Javascriptem cyklicky měňte text nadpisů i odstavců každých 5s.

#### 1. krok:
```text
Nadpis 1
Odstavec 1
Nadpis 2
Odstavec 2
Nadpis 3
Odstavec 3
```

#### 2. krok:
```text
Nadpis 3
Odstavec 3
Nadpis 1
Odstavec 1
Nadpis 2
Odstavec 2
```

#### 3. krok:
```text
Nadpis 2
Odstavec 2
Nadpis 3
Odstavec 3
Nadpis 1
Odstavec 1
```
