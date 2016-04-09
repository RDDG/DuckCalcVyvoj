/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;

/**
 *
 * @author RDDG
 * 
 * třída polozka je struktura se třemi konstruktory - využívá se přetěžovani
 * proměnné jsou veřejné pro jejich dosah i mimo třídu
 */
public class polozka {
    public String priklad;
    public double vysledek;
    
/* uloží String vstup do String priklad  */    
    polozka(String vstup){
       priklad = vstup;
    }

/* uloží double vstup do double vysledek  */
    polozka(double vstup){
        vysledek = vstup;
    }

/* uloží String vstupPriklad do String priklad a double vstupVysledek do Vysledek   */
    polozka(String vstupPriklad, double vstupVysledek){
        priklad = vstupPriklad;
        vysledek = vstupVysledek;
    }
}
