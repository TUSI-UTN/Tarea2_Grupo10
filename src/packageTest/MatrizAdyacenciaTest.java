package packageTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import frgp.utn.edu.ar.main.MatrizAdyacencia;
import static org.junit.jupiter.api.Assertions.*;

public class MatrizAdyacenciaTest {
	
	private MatrizAdyacencia matriz;
	
	@BeforeEach
    public void setUp() throws Exception {
        matriz = new MatrizAdyacencia(5);
    }

    @Test
    public void agregarElementoTest() {
    	matriz.agregarElemento(0, 1); 
        assertTrue(matriz.existeElemento(0, 1)); 
    }
    
    @Test
    public void agregarElementoSimetriaTest() {
        matriz.agregarElemento(2, 3);
        assertTrue(matriz.existeElemento(2, 3));
        assertTrue(matriz.existeElemento(3, 2));
    }
    
    
    @Test
    public void eliminarElementoTest() {
    	matriz.eliminarElemento(2, 3);
    	assertTrue(!matriz.existeElemento(2, 3));
    }
    
    
    @Test
    public void eliminarElementoSimetricoTest() {
        
    }
    
    @Test
    public void contarRelacionesTest() {
        
    }
}
