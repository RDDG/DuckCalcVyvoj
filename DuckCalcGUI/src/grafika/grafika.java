/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafika;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author pavel
 */
public class grafika extends JFrame{
    JPanel zakladni=new JPanel();     //vytvoreni zakladniho grafickeho panelu
    Container kont=getContentPane();  //vytvoreni grafickeho kontejnrtu
    String priklad;//=new String("vypis z grafiky");
/*** tvorba tlacitek ***/    
    JButton tlPlus=new JButton("+");
    JButton tlMinus=new JButton("-");
    JButton tlDeleno=new JButton("/");
    JButton tlKrat=new JButton("*");
    JButton tlModulo=new JButton("%");
    JButton tlFact=new JButton("!");
    JButton tlDes=new JButton(".");
    JButton tl0=new JButton("0");
    JButton tl1=new JButton("1");
    JButton tl2=new JButton("2");
    JButton tl3=new JButton("3");
    JButton tl4=new JButton("4");
    JButton tl5=new JButton("5");
    JButton tl6=new JButton("6");
    JButton tl7=new JButton("7");
    JButton tl8=new JButton("8");
    JButton tl9=new JButton("9");
    JButton tlMocnina=new JButton("^");
    public JButton tlRovnase=new JButton("=");
    JButton tlClear=new JButton("C");
    
/*** vytvoreni displeje pro priklad a vysledek ***/
    JTextField displejPriklad=new JTextField(20);
    JTextField displejVysledek=new JTextField(20);
    
    public grafika(){
        super("kalkulacka");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        vykresli();
    }
    
    private void vykresli(){
        
    }
    
    public String vypis(){
        priklad=displejPriklad.getText();
        System.out.print(priklad);
        return priklad;
    }
}
