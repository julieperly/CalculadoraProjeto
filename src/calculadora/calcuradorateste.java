package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class calcuradorateste {

	  Calculadora calc = new Calculadora();

	    @Test
	    void testSoma() {
	        assertEquals(5, calc.somar(2, 3));
	        assertEquals(-1, calc.somar(2, -3));
	        assertEquals(0, calc.somar(0, 0));
	    }

	    @Test
	    void testSubtracao() {
	        assertEquals(-1, calc.subtrair(2, 3));
	        assertEquals(5, calc.subtrair(2, -3));
	        assertEquals(0, calc.subtrair(0, 0));
	    }

	    @Test
	    void testMultiplicacao() {
	        assertEquals(6, calc.multiplicar(2, 3));
	        assertEquals(-6, calc.multiplicar(2, -3));
	        assertEquals(0, calc.multiplicar(2, 0));
	    }

	    @Test
	    void testDivisao() {
	        assertEquals(2, calc.dividir(6, 3));
	        assertEquals(-2, calc.dividir(6, -3));
	    }

	    @Test
	    void testDivisaoPorZero() {
	        Exception exception = assertThrows(ArithmeticException.class, () -> {
	            calc.dividir(5, 0);
	        });
	        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
	    }
	}

