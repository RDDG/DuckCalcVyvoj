/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duckcalc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import matematika.*;
import grafika.*;

/**
 *
 * @author pavel
 * @class DuckCalc
 */
public class DuckCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final data Data=new data();
        final grafika GUI=new grafika();
        final operation Operation=new operation();
        GUI.tlRovnase.addActionListener(new ActionListener (){ //pridani posluchace tlacitka pomoci anonzmni metody
            public void actionPerformed(ActionEvent e){
                Data.pridejPriklad(GUI.vypis());
                Data.pridejVysledek(Operation.vyres(Data));
                GUI.pridejVysledek(Data.vypisPosledniVysledek());
                System.out.print("\n"+Data.vypisPosledniVysledek());
                }
        }); 
        
        
    }
    
}
