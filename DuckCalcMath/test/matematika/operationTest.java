/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;

import static java.lang.Double.NaN;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RDDG
 */
public class operationTest {
    data Data;
    operation Operation;
    double ERROR=NaN;
    public operationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Data=new data();
        Operation=new operation();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testadd() 
    {
        
        Data.pridejPriklad("1+1");
            assertEquals(2,             Operation.vyres(Data),0.);
        
        Data.pridejPriklad("1+9");
            assertEquals(10,            Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("6+34");
            assertEquals(40,            Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("65536+65536");
            assertEquals(131072,        Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("3.1+6.9");
            assertEquals(10,            Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("3.00000001+3.00000001");
            assertEquals(6.00000002, 	Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("62+1322");
            assertEquals(1384,          Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("147483647+147483647");
            assertEquals(294967294,    Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("4+-5");
            assertEquals(-1,            Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("-4+-5");
            assertEquals(-9,            Operation.vyres(Data),0.0);
    }
    
    @Test
    public void testsub() 
    {
        Data.pridejPriklad("1-1");
            assertEquals(0,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("1-9");
            assertEquals(-8,            Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("6-34");
            assertEquals(-28,           Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("65536-65536");
            assertEquals(0,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("3.1-6.9");
            assertEquals(-3.8,          Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("3.00000001-3.00000005");
            assertEquals(-0.00000004, 	Operation.vyres(Data), 0.000000009);
        
        Data.pridejPriklad("1322-62");
            assertEquals(1260,          Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("147483647--147483647");
            assertEquals(294967294,    Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("4--5");
            assertEquals(9,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("-4--5");
            assertEquals(1,             Operation.vyres(Data),0.0);
    }
    
    @Test
    public void testdiv() 
    {
        Data.pridejPriklad("5/0");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("0/5");
            assertEquals(0,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("0/0");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("144/12");
            assertEquals(12,            Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("12/122");
            assertEquals(0.09836066,    Operation.vyres(Data),0.000000009);
        
        Data.pridejPriklad("5/25");
            assertEquals(0.2,           Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("25/5");
            assertEquals(5,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("-25/-5");
            assertEquals(5,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("-25/5");
            assertEquals(-5,            Operation.vyres(Data),0.0);
    }
    
    @Test
    public void testmul() 
    {
        Data.pridejPriklad("6*5");
            assertEquals(30,            Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("-5*5");
            assertEquals(-25,           Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("5*-5");
            assertEquals(-25,           Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("55*52");
            assertEquals(2860,          Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("666*666");
            assertEquals(443556,        Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("0*5");
            assertEquals(0,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("5*0");
            assertEquals(0,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("0*0");
            assertEquals(0,             Operation.vyres(Data),0.0);
    }
    
    @Test
    public void testpowsingle() 
    {
        Data.pridejPriklad("5^1");
            assertEquals(5,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("5^2");
            assertEquals(25,            Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("5^3");
            assertEquals(125,           Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("5^9");
            assertEquals(1953125,       Operation.vyres(Data),0.0);
     
        Data.pridejPriklad("5^0");
            assertEquals(1,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("1254870^0");
            assertEquals(1,             Operation.vyres(Data),0.0);
            
        Data.pridejPriklad("-5^0");
            assertEquals(1,             Operation.vyres(Data),0.0);
            
        Data.pridejPriklad("0^0");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
    }
    
    @Test
    public void testmod() 
    {
        Data.pridejPriklad("5%2");
            assertEquals(1,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("2%2");
            assertEquals(0,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("16%4");
            assertEquals(0,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("16%3");
            assertEquals(1,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("12%9");
            assertEquals(3,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("123456%12");
            assertEquals(0, 	        Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("120%0");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
    }
    
    @Test
    public void testfakt() 
    {
        Data.pridejPriklad("5!");
            assertEquals(120,           Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("2!");
            assertEquals(2,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("0!");
            assertEquals(1,             Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("15!");
            assertEquals(1307674368000d,Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("!1");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("7!");
            assertEquals(5040,          Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("10!!");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("-10!");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("-!");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
            
        Data.pridejPriklad("10000000000000!"); //přeteče double
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
            
        Data.pridejPriklad("!");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
    }
    
    @Test
    public void testerr() 
    {
        Data.pridejPriklad("5**2");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("2*/2");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
      /*  Data.pridejPriklad("16-+4");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        */
        Data.pridejPriklad("/163*6");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("12/0");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("123456%^12");
            assertEquals(ERROR, 	Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("*");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("**");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("+-*");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
            
        Data.pridejPriklad("a");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
            
        Data.pridejPriklad("a+b");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
            
        Data.pridejPriklad("<|>");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("^>^>^");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("toto+je");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("1 + 1");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad(" ");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("ěšč");
            assertEquals(ERROR, 	Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("##$$");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("&#%$");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad(";");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("$1+$2");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
            
        Data.pridejPriklad("1+2+3");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
            
        Data.pridejPriklad(".");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
            
        Data.pridejPriklad("(-.)*54");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("i++");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("j=20");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("break");
            assertEquals(ERROR, 	Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("return 0");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("return 1");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("NULL");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
        
        Data.pridejPriklad("INF");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
            
        Data.pridejPriklad("INF-INF");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
            
        Data.pridejPriklad("MIN_VALUE");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
            
        Data.pridejPriklad("NaN+3");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
            
        Data.pridejPriklad("MIN_NORMAL");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
            
        Data.pridejPriklad("NEGATIVE_INFINITY*2");
            assertEquals(ERROR,         Operation.vyres(Data),0.0);
    }

}
