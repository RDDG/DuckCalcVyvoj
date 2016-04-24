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
    /**
     * private JPanel pro na vyskládání graf komponent.
     */
    JPanel zakladni=new JPanel();     //vytvoreni zakladniho grafickeho panelu
    /**
     * private Containre pro ukládání JPanelů.
     */
    Container kont=getContentPane();  //vytvoreni grafickeho kontejnrtu
    /**
     * private String pro ukládání napsaného textu na displej.
     */
    String priklad;//=new String("vypis z grafiky");
//tvorba tlacitek
    /**
     * private JButton pro vykreslení +.
     */
    JButton tlPlus=new JButton("+");
    /**
     * private JButton pro vykreslení -.
     */
    JButton tlMinus=new JButton("-");
    /**
     * private JButton pro vykreslení /.
     */
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

    /**
     *
     */
    public JButton tlRovnase=new JButton("=");
    JButton tlClear=new JButton("C");
    int p=0;
    
/*** vytvoreni displeje pro priklad a vysledek ***/
    JTextField displejPriklad=new JTextField(20);
    JTextField displejVysledek=new JTextField(20);
    
/** grafika() je kontruktor pro jednoduchou definici okna.
 * volá metody vykresli() pro vykreslení grafických prvků okna
*/
    public grafika(){
        super("DuckCalc RDDG");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        vykresli();
    }
/** 
*   vykeresli() je privátní void metoda pro vykreslení grafických prvku. 
*   
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
                displejVysledek.setText(null);
                p=0;
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
    /**
    * pridejHodnotu je privatní void metoda pro vypisovani na displej prikladu.
    * @param e e je ActionEvent generovaný po stisku tlačítka
    * 
    */
    private void pridejHodnotu(ActionEvent e){
        if(displejVysledek.getText().isEmpty()){
            if(p==0){
                priklad=displejPriklad.getText();
                displejPriklad.setText(priklad+e.getActionCommand());
                if(((e.getActionCommand().equals("^")) || (e.getActionCommand().equals("+")) || (e.getActionCommand().equals("-")) || (e.getActionCommand().equals("*")) || (e.getActionCommand().equals("/")) || (e.getActionCommand().equals("%")) || (e.getActionCommand().equals("!")))){
                    p=1;
                }
            }else
            /*if(p==1)*/{
                if((e.getActionCommand().equals("-")) || (e.getActionCommand().equals("+"))){
                    priklad=displejPriklad.getText();
                    if((priklad.charAt(priklad.length()-1)=='-' || priklad.charAt(priklad.length()-1)=='+') && (priklad.charAt(priklad.length()-2)>='0' && priklad.charAt(priklad.length()-2)<='9')){
                        displejPriklad.setText(priklad+e.getActionCommand());
                    }
                }
                else if(((e.getActionCommand().equals("^")) || (e.getActionCommand().equals("*")) || (e.getActionCommand().equals("/")) || (e.getActionCommand().equals("%")) || (e.getActionCommand().equals("!")))){
                }
                
                else{
                    priklad=displejPriklad.getText();
                    displejPriklad.setText(priklad+e.getActionCommand());
                }
   
            }
            
            
            
            
            
      /*  if(((e.getActionCommand().equals("^")) || (e.getActionCommand().equals("+")) || (e.getActionCommand().equals("-")) || (e.getActionCommand().equals("*")) || (e.getActionCommand().equals("/")) || (e.getActionCommand().equals("%")) || (e.getActionCommand().equals("!"))) &&(p==0) ){
        priklad=displejPriklad.getText();
        p=1;
        displejPriklad.setText(priklad+e.getActionCommand());
        System.out.print("int+"+(int)'+');}
        if(((e.getActionCommand().equals("^")) || (e.getActionCommand().equals("+")) || (e.getActionCommand().equals("-")) || (e.getActionCommand().equals("*")) || (e.getActionCommand().equals("/")) || (e.getActionCommand().equals("%")) || (e.getActionCommand().equals("!"))) &&(p==1) ){
        }
            else {//if((!(e.getActionCommand().equals("+")) || !(e.getActionCommand().equals("-")) || !(e.getActionCommand().equals("*")) || !(e.getActionCommand().equals("/")) || !(e.getActionCommand().equals("%")) || !(e.getActionCommand().equals("!"))) && Integer.parseInt(e.getActionCommand())<=(int)'9' && Integer.parseInt(e.getActionCommand())>=(int)'0' ){
                    priklad=displejPriklad.getText();
                    displejPriklad.setText(priklad+e.getActionCommand());
                }*/
        }         /*else{
                
                }*/
    }
    
/**
*   vypis() je public String metoda, co vypisuje(return) příklad.
*   @return priklad je typu String, obsahuje zadaní matematického příkladu
* 
*/
    public String vypis(){
        priklad=displejPriklad.getText();
        //System.out.print(priklad);
        return priklad;
    }
    
/**
*  pridejVysledek(String) je public void metoda která z double udělá String a zobrazí vysledek na displeji.
*  @param vysledek vysledek je double
* 
*/
    public void pridejVysledek(double vysledek){
       
        String p=""+vysledek;
        displejVysledek.setText(p);
       
    }
}
