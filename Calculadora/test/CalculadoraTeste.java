import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTeste {
    @Test
    public void testarSoma(){
        Calculadora calc = new Calculadora ();
        assertEquals(calc.somar(1,1),2);
    }
    
    public void testarSubtrair(){
        Calculadora calc = new Calculadora ();
        assertTrue(calc.subtrair(1,1) == 0);
        assertTrue(calc.subtrair(-1,-2) == 1);        
        assertFalse(calc.subtrair(3,3) == 3);
    }
    
    public void testarMuplicar(){
        Calculadora calc = new Calculadora ();
        assertEquals(calc.multiplicar(3,2),6);
        assertFalse(calc.multiplicar(3,3) == 3);
        assertTrue(calc.multiplicar(3,3) == 9);
    
    }
    
    public void testarDividir(){
        Calculadora calc = new Calculadora ();
        assertEquals(calc.dividir(3,2),1);
        assertFalse(calc.dividir(3,3) == 3);
        assertTrue(calc.dividir(3,4) == 0);        
    
    }
    
}
 