/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;

import static java.lang.Double.*;
import java.text.DecimalFormat;

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
        if(!Double.isNaN(vysledek)){
            System.out.print(vysledek+"\n");
            String pomocny=""+vysledek;
            System.out.print(pomocny+"\n");
            int tecka=pomocny.indexOf('.');
            if((tecka+9)>pomocny.length()){
                for(int j=tecka; j<tecka+9; j++){
                    pomocny=pomocny+"0";
                }
            }
            System.out.print(pomocny+"\n");
            tecka=tecka+9;
            int zaokrouhli=Integer.parseInt(pomocny.substring(tecka, tecka+1));
            int z=Integer.parseInt(pomocny.substring(tecka+1, tecka+2));
            if(z>4 && z<=9){
                zaokrouhli++;
            }
            pomocny=pomocny.substring(0, tecka);
            pomocny=pomocny+zaokrouhli;
            System.out.print(pomocny+"\n");
            vysledek=Double.parseDouble(pomocny);
            System.out.print(vysledek+"\n");
        }
     /*   DecimalFormat df = new DecimalFormat("#.#########");
       try{
        
            vysledek = Double.valueOf(df.format(vysledek));
       } catch (Exception e) {
            vysledek = NaN;
        }
        
        System.out.print(vysledek+"\n");*/
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
        double vysledek;
        if (cislo2 == 0){
            vysledek = NaN;
        }
        else{
            vysledek = cislo1 / cislo2;
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
        double vysledek;
        if (cislo2 == 0){
            vysledek = NaN;
        }
        else{
            vysledek = cislo1 % cislo2;
        }
        return vysledek;
    }
}
