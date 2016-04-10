/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;

import java.util.*;

/**
 *
 * @author RDDG
 */
public class data {
    public String priklad;
    ArrayList <polozka> Polozka = new ArrayList<polozka>();
    polozka p;
    
/* pridá na konec pole novej příklad */     
    public void pridejPriklad(String vstupniPriklad){
       p = new polozka(vstupniPriklad);
       Polozka.add(p);
    }
 
/* pridá na konec pole nový výsledek */        
    public void pridejVysledek(double vysledek){
       Polozka.get(Polozka.size()-1).vysledek=vysledek;
    }

/* vypise posledni priklad v poli */    
    public String vypisPosledniPriklad(){
        if ((Polozka != null) && (!Polozka.isEmpty())) {
            p = Polozka.get(Polozka.size()-1);
        /* vytvaris si lokalni promennou priklad, ale returnuje se priklad ktery je globalni
            String priklad = p.priklad;*/
            priklad = p.priklad;
        }
        return priklad;
    }

/* vypise posledni vysledek v poli */  
    public double vypisPosledniVysledek(){
        double vysledek=0;
        if ((Polozka != null) && (!Polozka.isEmpty())) {
            p = Polozka.get(Polozka.size()-1);
            vysledek = p.vysledek;
        }
        return vysledek;
    }
}
