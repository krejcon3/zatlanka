# Řešení
## Zadání úkolů
### První úkol (2b)
Vytvořte třídu pro nohu (od židle), třída bude mít atributy ```x, y, z``` pro rozměry nohy

```javascript
var Leg = function(i_x, i_y, i_z) {
    var x = i_x;
    var y = i_y;
    var z = i_z;
    
    this.getX = function() { 
    	return x;
    };
    
    this.getY = function() { 
    	return y;
    };
    
    this.getZ = function() { 
    	return z;
    };
}
```

### Druhý úkol (3b)
Vytvořte třídu pro židli, pro třídu použijte 4x objekt nohy židle, 1x objekt sedák a 1x objekt opěradlo, objekt sedák a opěradlo budou mít také atributy ```x, y, z```

```javascript
var Seat = function(i_x, i_y, i_z) {
    var x = i_x;
    var y = i_y;
    var z = i_z;
    
    this.getX = function() { 
    	return x;
    };
    
    this.getY = function() { 
    	return y;
    };
    
    this.getZ = function() { 
    	return z;
    };
}

var Back = function(i_x, i_y, i_z) {
    var x = i_x;
    var y = i_y;
    var z = i_z;
    
    this.getX = function() { 
    	return x;
    };
    
    this.getY = function() { 
    	return y;
    };
    
    this.getZ = function() { 
    	return z;
    };
}

var Chair = function() {
    var back = new Back(10, 100, 100);
    var stool = new Back(100, 10, 100);
    var frontLeftLeg = new Leg(10, 100, 10);
    var frontRightLeg = new Leg(10, 100, 10);
    var backLeftLeg = new Leg(10, 100, 10);
    var backRightLeg = new Leg(10, 100, 10);
}
```

### Bonusová úloha (5b)
Vytvořte funkce pro židli, které vrátí výsledné rozměry židle

```javascript
var Chair = function() {
    var back = new Back(10, 100, 100);
    var stool = new Back(100, 10, 100);
    var frontLeftLeg = new Leg(10, 100, 10);
    var frontRightLeg = new Leg(10, 100, 10);
    var backLeftLeg = new Leg(10, 100, 10);
    var backRightLeg = new Leg(10, 100, 10);
    
    this.getX = function() {
    	// hledám největší rozmer na ose X (skládají se rozměry nohou)
    	return Math.max(
    		back.getX(),
    		stool.getX(),
    		frontLeftLeg.getX() + backLeftLeg.getX(),
    		frontRightLeg.getX() + backRightLeg.getX()
        );
    };
    
    this.getY = function() {
    	// skládám největší rozměry na výšku (hledám nejvyšší nohu)
    	return back.getY() + stool.getY() + Math.max(
    		frontLeftLeg.getY(),
            frontRightLeg.getY(),
            backLeftLeg.getY(),
            backRightLeg.getY()
        );
    };
    
    this.getZ = function() {
    	// hledám největší rozmer na ose Z (skládají se rozměry nohou)
    	return Math.max(
            back.getZ(),
            stool.getZ(),
            frontLeftLeg.getZ() + frontRightLeg.getZ(),
            backLeftLeg.getZ() + backRightLeg.getZ()
        );
    }
}
```
