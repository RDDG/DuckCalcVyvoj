package matematika;

import java.util.*;

/**
 * Třída data pracuje s polem struktur polozka (definovaný v polozka.java).
 * @author RDDG
 * @date duben 2016
 * Metody jsou veřejné, protože se budou využívat mimo třídu data.
 */
public class data {
    public String priklad;
    ArrayList <polozka> Polozka = new ArrayList<polozka>();
    polozka p;
    
/**
 * Vytvoří nový prvek pole a uloží do něj příklad ze vstupu předaný parametrem.
 * @param vstupniPriklad řetězec obsahující vstupní příklad.
 */     
    public void pridejPriklad(String vstupniPriklad){
       p = new polozka(vstupniPriklad);
       Polozka.add(p);
    }
 
/**
 * Přidá výsledek na konec pole - výsledek k příslušnému příkladu (ten bude vždy na konci pole).
 * @param vysledek číslo typu double - výsledek příslušného příkladu.
 */        
    public void pridejVysledek(double vysledek){
       Polozka.get(Polozka.size()-1).vysledek=vysledek;
    }

/**
 * Vypíše poslední příklad v poli struktur.
 * @return Řetězec, ve kterém je uložen poslední příklad z pole.
 */    
    public String vypisPosledniPriklad(){
        if ((Polozka != null) && (!Polozka.isEmpty())) {
            p = Polozka.get(Polozka.size()-1);
            priklad = p.priklad;
        }
        return priklad;
    }

/**
 * Vypíše poslední výsledek v poli struktur.
 * @return Řetězec, ve kterém je uložen poslední výsledek z pole - výsledek posledního příkladu.
 */   
    public double vypisPosledniVysledek(){
        double vysledek=0;
        if ((Polozka != null) && (!Polozka.isEmpty())) {
            p = Polozka.get(Polozka.size()-1);
            vysledek = p.vysledek;
        }
        return vysledek;
    }
}
