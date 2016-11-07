# Informace
## Funkce
### Hlavička
* slouží k definování rozhraní funkce
* obsahuje typ zapouzdření (`private`, `public`)
* pro statickou funkci používáme ještě slovo `static`
* obsahuje typ metody (typ návratové hodnoty či `void`)
* obsahuje název metody
* obsahuje vstupní parametry funkce (funkce nemusí mít žádné vstupní parametry)

`public static void main(String[] args)`
`public static int faktorial(int a)`

### Tělo
* obsahuje vlastní kód funkce
* v případě použití návratové funkce obsahuje na místech kde má vracet výsledek `return`
* použití `return` ukončuje metodu

`public static void main(String[] args) { // hlavička funkce
    for (int i = 0; i < 10; i++) { // tělo funkce
        System.out.println("Hello world!");
    }
} // konec funkce`

### Typy funkci
1. návratové
    * v hlavičce obsahují definici typu návratové hodnoty
        * `public int faktorial()`
    * návratová hodnota je vrácena pomocí `return`
        * `return 0;`
    
2. void
    * v hlavičce obsahují místo typu návratové hodnoty jen `void`
    * nevrací žádnou hodnotu (nemusejí mít `return`)
    
## Rekurzivní funkce
* volá sama sebe
* musíme dát pozor na ukončovací podmínky!!! jinak poběží do "nekonečna"

## Zadání úkolů
* viz kód
