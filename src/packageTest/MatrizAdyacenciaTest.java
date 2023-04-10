package packageTest;

import org.junit.jupiter.api.Test;
import frgp.utn.edu.ar.main.MatrizAdyacencia;
import static org.junit.jupiter.api.Assertions.*;

public class MatrizAdyacenciaTest {
	
	private MatrizAdyacencia matriz;

    @Test
    public void agregarElementoTest() {
        matriz.agregarElemento(1, 2);
        assertTrue(matriz.existeElemento(1, 2));
    }
    
    @Test
    public void agregarElementoSimetriaTest() {
        matriz.agregarElemento(2, 3);
        assertTrue(matriz.existeElemento(2, 3));
        assertTrue(matriz.existeElemento(3, 2));
    }
    
    @Test
    public void eliminarElementoTest() {
       
    }
    
    @Test
    public void eliminarElementoSimetricoTest() {
        
    }
    
    @Test
    public void contarRelacionesTest() {
        
    }
}
