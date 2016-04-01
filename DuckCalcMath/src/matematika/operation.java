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
 * třída operation čte z data příklady a ty řeší, jediným jejim veřejným rozhraním je 
 * public long vyres(data Data) ostatní metody budou neveřejné
 */
public class operation {
    long vysledek;
    String priklad;
    long s1;
//TO DO
/* rozhrani pro komunikaci, podle znaménka volá příslušnou metodu na řešeni matematické operace*/ 
    public long vyres(data Data){
        priklad=Data.vypisPosledniPriklad();
        //TO DO
        
        
        
        return vysledek;
    }
}
