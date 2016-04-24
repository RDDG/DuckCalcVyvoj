package matematika;

import static java.lang.Double.*;
import java.text.DecimalFormat;

/**
 * Třída operation zajišťuje samotné vyhodnocení vstupního řetězce a navrácení správného výsledku
 * @author RDDG
 * @date duben 2016
 * třída operation čte z data příklady a ty řeší, jediným jejim veřejným rozhraním je 
 * public double vyres(data Data) ostatní metody budou neveřejné
 */
public class operation {
    double vysledek;
    String priklad;
    double s1;
/**
 * Jedinná veřejná metoda této třídy, stará se o vyhodnocení příkladu ze vstupu a vrácení korektního výsledku.
 * K tomu využívá další privátní metody.
 * @param Data Řetězec ze vstupu, je v něm uložený příklad k vyřešení
 * @return Číslo datového typu double, je v něm hodnota výsledku příkladu v parametru Data
 * @throws NaN pokud je příklad zadán v jiném tvaru než "číslo opearace číslo" např. 4+5
 * @throws NaN pokud výsledek příkladu není definovaný, nebo je nekonečno (případně mimo rozsah datového typu double)
 */ 
    public double vyres(data Data){
        
        priklad=Data.vypisPosledniPriklad();
        double c1 = 0;     
        double c2 = 0;     
        double inf = Double.POSITIVE_INFINITY;
        char operace = 'n';
        String cislo;
        int i=0, NeniC2=0;
        
        if (priklad.length() < 2){
            return NaN;
        }
        // Cyklus najde první číslo a pokusí se jej převést z řetězce na datový typ double. 
        for (i=1;i<=(priklad.length()-1);i++){
            if((((priklad.charAt(i) < '0') || (priklad.charAt(i) > '9'))) && (priklad.charAt(i) != '.')){
                cislo = priklad.substring(0, i);
                try{
                    c1 = Double.parseDouble(cislo);
                } catch (Exception e) {
                    c1 = NaN;
                }
                break;
            }
        }
        if (i == priklad.length()){
            return NaN;
        }
        operace = priklad.charAt(i);
        i++;
        // Pokus o převedení druhého čísla z řetězce na datový typ double.
        cislo = priklad.substring(i, priklad.length());
        if (i == priklad.length()){
            NeniC2=1;
        }
        try{
            c2 = Double.parseDouble(cislo);
        } catch (Exception e) {
            c2 = NaN;
        }
        // Volání metody na výpočet faktoriálu - specifický případ (faktoriál je totiž pouze jedno číslo a znak operace.
        if ((operace == '!') && (!Double.isNaN(c1)) && (NeniC2 == 1)){
            return faktorial(c1);
        }
        // Přepínač, ve kterém jsou volány metody na základě znaku operace.
        if ((!Double.isNaN(c1)) && (!Double.isNaN(c2))) {
            if ((c1 == inf) || (c2 == inf)){
                return NaN;
            }
            switch (operace){
                case '+':
                    vysledek = soucet(c1, c2);
                    break;
                case '-':
                    vysledek = rozdil(c1, c2);
                    break;
                case '*':
                    vysledek = soucin(c1, c2);
                    break;
                case '/':
                    vysledek = podil(c1, c2);
                    break;
                case '^':
                    vysledek = mocnina(c1, c2);
                    break;
                case '%':
                    vysledek = modulo(c1, c2);
                    break;
                case '!':
                    break;
                default:
                    vysledek = NaN;
                    break;
            }
        }
        else{
            vysledek = NaN;
        }
        // Zaokrouhlení výsledku na 8 sedetinných míst
        if(!Double.isNaN(vysledek)){
            String pomocny=""+vysledek;
            if(pomocny.indexOf('E')==-1){
            int tecka=pomocny.indexOf('.');
           if((tecka+9)>pomocny.length()){
                for(int j=tecka; j<tecka+12; j++){
                    pomocny=pomocny+"0";
                }
           }
            tecka=tecka+9;
            if((tecka+2)<=pomocny.length()){
            int zaokrouhli=Integer.parseInt(pomocny.substring(tecka, tecka+1));
            int z=Integer.parseInt(pomocny.substring(tecka+1, tecka+2));
            if(z>4 && z<=9){
                zaokrouhli++;
            }
            pomocny=pomocny.substring(0, tecka);
            pomocny=pomocny+zaokrouhli;
            vysledek=Double.parseDouble(pomocny);}
            }
        }
        // pokud je v proměnné vysledek hodnota nekonečno (nejčastěji nastane při přetečení datového typu double) je vácena hodnota NaN.
        if (vysledek == inf){
            vysledek = NaN;
        }
        
        return vysledek;
    }
    /**
     * Součet dvou čísel předaných parametrem.
     * @param cislo1 Sčítanec
     * @param cislo2 Sčítanec
     * @return Součet
     */
    private double soucet(double cislo1, double cislo2){
        double vysledek = cislo1 + cislo2;
        return vysledek;
    }
    /**
     * Rozdíl dvou čísel předaných parametrem.
     * @param cislo1 Menšenec
     * @param cislo2 Menšitel
     * @return Rozdíl
     */
    private double rozdil(double cislo1, double cislo2){
        double vysledek = cislo1 - cislo2;
        return vysledek;
    }
    /**
     * Součin dvou čísel předanýhc parametrem.
     * @param cislo1 Činitel
     * @param cislo2 Činitel
     * @return Součin
     */
    private double soucin(double cislo1, double cislo2){
        double vysledek = cislo1 * cislo2;
        return vysledek;
    }
    /**
     * Podíl dvou čísel předaných parametrem
     * @param cislo1 Dělěnec
     * @param cislo2 Dělitel
     * @return Podíl
     */
    private double podil(double cislo1, double cislo2){
        double vysledek;
        if (cislo2 == 0){
            vysledek = NaN;
        }
        else{
            vysledek = cislo1 / cislo2;
        }
        return vysledek;
    }
    /**
     * Mocnina s reálným exponentem
     * @param cislo1 Základ mocniny (mocněnec) 
     * @param cislo2 Exponent (mocnitel)
     * @return výsledek prvního čísla umocněného na hodnotu druheho čísla
     */
    private double mocnina(double cislo1, double cislo2){
        double vysledek = 1;
        if ((cislo1 == 0) && (cislo2 == 0)){
            vysledek = NaN;
        }
        else{
            for (int i=0; cislo2>i; i++){
                vysledek *= cislo1;
            } 
        }
        return vysledek;
    }
    /**
     * Modulo - zbytek po celočíselném dělení
     * @param cislo1 Dělenec
     * @param cislo2 Dělitel
     * @return Zbytek po dělení
     */
    private double modulo(double cislo1, double cislo2){
        double vysledek;
        if (cislo2 == 0){
            vysledek = NaN;
        }
        else{
            vysledek = cislo1 % cislo2;
        }
        return vysledek;
    }
    /**
     * Faktroiál čísla předaného parametrem
     * @param cislo1 Číslo, jehož faktoriál se v metodě počítá.
     * @return výsledek operace faktoriál pro předané číslo
     */
    private double faktorial(double cislo1){
        double vysledek;
        double inf = Double.POSITIVE_INFINITY;
        if ((cislo1 < 0) || ((cislo1%1) != 0)){
            vysledek = NaN;
        }
        else{
            vysledek = 1;
            while(cislo1 != 0){
                vysledek *= cislo1;
                if (vysledek == inf){
                    return NaN;
                }
                cislo1--;
            }
        }
        return vysledek;
    }
}
