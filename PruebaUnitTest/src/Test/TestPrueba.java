package Test;
import static org.junit.Assert.*;

import org.junit.Test;
import Metodos.Metodos;;

public class TestPrueba {
	  @Test
	  public void testPregunta1() { 
		Metodos metodo = new Metodos();
	    boolean resultado  = metodo.isValid1("aabbcc");  
	    assertEquals(1, resultado == true ? 1 : 0);
	  }
	  
	 @Test
	  public void testPregunta2() {
		  Metodos metodo = new Metodos();
		  boolean resultado = metodo.isValid2("aabbccc");
		  assertEquals(1, resultado == true ? 1 : 0);
	  } 
}
