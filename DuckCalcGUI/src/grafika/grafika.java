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
 * Class grafika is child of JFrame. 
 * @author RDDG
 * 
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
    
/** grafika() is constructor, it implements base setting of windows. 
*/
    public grafika(){
        super("kalkulacka");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        vykresli();
    }
/** 
*   vykeresli() is privat void method without parametrs. 
*   vykresli() is called from constructor grafika() and it displays all buttons, displays etc.
* 
*/
        
    private void vykresli(){
        /*** nastavi velikost zakladniho tlacitka ***/
        Dimension velikostTlacitka=new Dimension(50, 25);
        
        BorderLayout kontDefault=new BorderLayout();  // kontDefault je zakladni layout manager pro kont
        kont.setLayout(kontDefault);
       
    /*** layout manager pro JPanel zakladni + zakladni nastaveni pro JPanel zakladni ***/    
        GridBagLayout zakladniPanelLayout= new GridBagLayout();
        GridBagConstraints zakladniPanelLayoutConstraint = new GridBagConstraints();
        zakladni.setLayout(zakladniPanelLayout);
        zakladni.setBackground(new Color(204, 204, 255));
    
    /*** nasazeni tlacitek a displeju do JPanel zakladni ***/
        
    /* JTextField pro priklad **/    
        zakladniPanelLayoutConstraint.gridx=0;
        zakladniPanelLayoutConstraint.gridy=0;
        zakladniPanelLayoutConstraint.gridwidth=5;
        zakladniPanelLayoutConstraint.fill=GridBagConstraints.HORIZONTAL;
        displejPriklad.setEditable(false);   //zakaza klikatelnost kurzoru
        zakladni.add(displejPriklad, zakladniPanelLayoutConstraint);
    
    /*JTextField pro vysledek **/
        zakladniPanelLayoutConstraint.gridy=1;
        displejVysledek.setEditable(false);
        zakladni.add(displejVysledek, zakladniPanelLayoutConstraint);
    
    /* tlacitko 1**/
        tl1.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx = 0;
        zakladniPanelLayoutConstraint.gridy = 2;
        zakladniPanelLayoutConstraint.gridwidth = 1;
        tl1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
        zakladni.add(tl1, zakladniPanelLayoutConstraint);
    
    /* tlacitko 2**/
        tl2.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=1;
        tl2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
        zakladni.add(tl2, zakladniPanelLayoutConstraint);
    
    /* tlacitko 3**/
        tl3.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=2;
        zakladni.add(tl3, zakladniPanelLayoutConstraint);
        tl3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
        
    /* tlacitko +**/
        tlPlus.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=3;
        zakladni.add(tlPlus, zakladniPanelLayoutConstraint);
        tlPlus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
        
    /* tlacitko -**/
        tlMinus.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=4;
        zakladni.add(tlMinus, zakladniPanelLayoutConstraint);
        tlMinus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
        
    /* tlacitko 4**/
        tl4.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=0;
        zakladniPanelLayoutConstraint.gridy=3;
        zakladni.add(tl4, zakladniPanelLayoutConstraint);
        tl4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
    
    /* tlacitko 5**/
        tl5.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=1;
        zakladni.add(tl5, zakladniPanelLayoutConstraint);
        tl5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
        
    /* tlacitko 6**/
        tl6.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=2;
        zakladni.add(tl6, zakladniPanelLayoutConstraint);
        tl6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
        
    /* tlacitko * **/
        tlKrat.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=3;
        zakladni.add(tlKrat, zakladniPanelLayoutConstraint);
        tlKrat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });

    /*tlacitko / **/
        tlDeleno.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=4;
        zakladni.add(tlDeleno, zakladniPanelLayoutConstraint);
        tlDeleno.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
        
    /* tlacitko 7**/
        tl7.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=0;
        zakladniPanelLayoutConstraint.gridy=4;
        zakladni.add(tl7, zakladniPanelLayoutConstraint);
        tl7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
        
    /* tlacitko 8**/
        tl8.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=1;
        zakladni.add(tl8, zakladniPanelLayoutConstraint);
        tl8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
    
    /* tlacitko 9**/
        tl9.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=2;
        zakladni.add(tl9, zakladniPanelLayoutConstraint);
        tl9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
       
    /* tlacitko %**/
        tlModulo.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=3;
        zakladni.add(tlModulo, zakladniPanelLayoutConstraint);
        tlModulo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
    
    /* tlacitko ^**/
        tlMocnina.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=4;
        //zakladniPanelLayoutConstraint.gridy=5;
        //zakladniPanelLayoutConstraint.fill=GridBagConstraints.HORIZONTAL;
        zakladni.add(tlMocnina, zakladniPanelLayoutConstraint);
        tlMocnina.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
        
    /* tlacitko =**/
        tlRovnase.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=4;
        zakladniPanelLayoutConstraint.gridy=5;
        
       
        zakladni.add(tlRovnase, zakladniPanelLayoutConstraint);
    
    /* tlacitko C**/
        tlClear.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridwidth=1;
        zakladniPanelLayoutConstraint.gridx=0;
        zakladniPanelLayoutConstraint.gridy=5;
        zakladni.add(tlClear, zakladniPanelLayoutConstraint);
        tlClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displejPriklad.setText(null);
                }
        });
        
    /* tlacitko 0**/
        tl0.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=1;
        zakladni.add(tl0, zakladniPanelLayoutConstraint);
        tl0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
        
    /* tlacitko , **/
        tlDes.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=2;
        zakladni.add(tlDes, zakladniPanelLayoutConstraint);
        tlDes.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
        
    /*tlacitko ! **/
        tlFact.setPreferredSize(velikostTlacitka);
        zakladniPanelLayoutConstraint.gridx=3;
        zakladni.add(tlFact, zakladniPanelLayoutConstraint);
        tlFact.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pridejHodnotu(e);
                }
        });
    /* vlozeni zakladniho JPanelu do kontejnetu a zobrazeni kontejneru ***/    
        kont.add(zakladni, kontDefault.CENTER);
        setContentPane(kont);
    }
    
    private void pridejHodnotu(ActionEvent e){
        priklad=displejPriklad.getText();
        displejPriklad.setText(priklad+e.getActionCommand());
    }
    
/**
*   vypis() is public String method to return math example from display.
*   @return priklad is String. In priklad is math example for solve
* 
*/
    public String vypis(){
        priklad=displejPriklad.getText();
        //System.out.print(priklad);
        return priklad;
    }
    
/**
*  pridejVysledek(String) is public void method to show solved math example on display.
*  @param vysledek vysledek is String
* 
*/
    public void pridejVysledek(double vysledek){
        String p=""+vysledek;
        displejVysledek.setText(p);
    }
}
