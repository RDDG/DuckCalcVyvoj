/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;

import static java.lang.Double.*;

/**
 *
 * @author RDDG
 * 
 * třída operation čte z data příklady a ty řeší, jediným jejim veřejným rozhraním je 
 * public double vyres(data Data) ostatní metody budou neveřejné
 */
public class operation {
    double vysledek;
    String priklad;
    double s1;
//TO DO
/* rozhrani pro komunikaci, podle znaménka volá příslušnou metodu na řešeni matematické operace*/ 
    public double vyres(data Data){
        priklad=Data.vypisPosledniPriklad();
        // TODO rozsekání stringu (dle mého by nemělo být v knihovně ale mělo by mít svou vlastní třídu)
        double c1 = 42;     //tam bude prvni cislo
        double c2 = 42;     //tam bude druhe cislo
        char operace = 'n';//tam bude znak operace
        String cislo;
        int i=0;
        for (i=1;i<=(priklad.length()-1);i++){
            if((((priklad.charAt(i) < '0') || (priklad.charAt(i) > '9'))) && (priklad.charAt(i) != '.')){
                cislo = priklad.substring(0, i);
                try{
                    c1 = Double.parseDouble(cislo);
                } catch (Exception e) {
                    //e.printStackTrace();
                    c1 = NaN;
                }
                break;
            }
        }
        operace = priklad.charAt(i);
        i++;
        cislo = priklad.substring(i, priklad.length());
        try{
            c2 = Double.parseDouble(cislo);
        } catch (Exception e) {
            //e.printStackTrace();
            c2 = NaN;
        }
        
        if ((!Double.isNaN(c1)) && (!Double.isNaN(c2))) {
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
                default:
                    vysledek = NaN;
                    break;
            }
        }
        else{
            vysledek = NaN;
        }
        
        return vysledek;
    }
    
    private double soucet(double cislo1, double cislo2){
        double vysledek = cislo1 + cislo2;
        return vysledek;
    }
    private double rozdil(double cislo1, double cislo2){
        double vysledek = cislo1 - cislo2;
        return vysledek;
    }
    private double soucin(double cislo1, double cislo2){
        double vysledek = cislo1 * cislo2;
        return vysledek;
    }
    private double podil(double cislo1, double cislo2){
        if (cislo2 == 0){
            double vysledek = NaN;
        }
        else{
            double vysledek = cislo1 / cislo2;
        }
        return vysledek;
    }
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
    private double modulo(double cislo1, double cislo2){
        if (cislo2 == 0){
            double vysledek = NaN;
        }
        else{
            double vysledek = cislo1 % cislo2;
        }
        return vysledek;
    }
}
