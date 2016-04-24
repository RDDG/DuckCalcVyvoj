package matematika;

/**
 * Třída položka je struktura, ve které je uložený příklad a k němu příslušný výsledek. 
 * @author RDDG
 * @date duben 2016
 * Třída polozka je struktura se třemi konstruktory - využívá se přetěžování.
 * Proměnné jsou veřejné pro jejich dosah i mimo třídu. Třída polozka je součástí balíčku matematika.
 * <h3>String priklad</h3>
 * V proměnné příklad je uložen řetězec s příkladem, který byl zadán uživatelem.
 * <h3>double vysledek</h3>
 * V proměnné výsledek je uložen výsledek - číslo datového typu double. Tohle číslo je výsledkem příkladu v proměnné priklad
 */
public class polozka {
    public String priklad;
    public double vysledek;
    
/**
 * Konstruktor, který uloží řetezec ze vstupu do proměnné priklad.
 * @param vstup řetezec, ve kterém je uložený příklad.
 */    
    polozka(String vstup){
       priklad = vstup;
    }

/**
 * Konstruktor, který uloží číslo typu double ze vstupu do proměnné vysledek.
 * @param vstup číslo datového typu Double, ve kterém je uložený výsledek příkladu.
 */
    polozka(double vstup){
        vysledek = vstup;
    }

/**
 * Konstruktor, který uloží řetezec a číslo ze vstupu do proměnných priklad a vysledek.
 * @param vstupPriklad řetezec, ve kterém je uložený příklad.
 * @param vstupVysledek číslo datového typu Double, ve kterém je uložený výsledek příkladu.
 */
    polozka(String vstupPriklad, double vstupVysledek){
        priklad = vstupPriklad;
        vysledek = vstupVysledek;
    }
}
