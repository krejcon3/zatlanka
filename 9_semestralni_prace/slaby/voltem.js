                              
                              
                              
                              //faktoriál
function factorial(n)
{
    if (n < 0) {
        return -1;
    }
    else if (n == 0) {
        return 1;
    }
    else {
        return (n * factorial(n - 1));
    }
}



                      //pøevod teplotních jednotek
 function pøevod(degree) {
      var i;
      if (degree == "C") {
        i = document.getElementById("c").value * 9 / 5 + 32;
        document.getElementById("f").value = Math.round(i);
      } else {
        i = (document.getElementById("f").value -32) * 5 / 9;
        document.getElementById("c").value = Math.round(i);
      }
    }
                                //pøeklad z èísla na slovo (0-9)    
function prevraceni(number) {

 switch (number) {
    case 0: return ("nula"); break;
    case 1: return ("jedna"); break;
    case 2: return ("dva"); break;
    case 3: return ("tøi"); break;
    case 4: return ("ètyøi"); break;
    case 5: return ("pìt"); break;
    case 6: return ("šest"); break;
    case 7: return ("sedm"); break;
    case 8: return ("osm"); break;
    case 9: return ("devìt"); break;
    
  
        }
  }                          
                      