package packageTest;

import org.junit.jupiter.api.Test;
import frgp.utn.edu.ar.main.MatrizAdyacencia;
import static org.junit.jupiter.api.Assertions.*;

public class MatrizAdyacenciaTest {
	
	private MatrizAdyacencia matriz;
	
    @Test
    public void agregarElementoTest() {
    	matriz = new MatrizAdyacencia(1);
    	matriz.agregarElemento(0, 0); 
        assertTrue(matriz.existeElemento(0, 0)); 
    }
    
    @Test
    public void agregarElementoSimetriaTest() {
    	matriz = new MatrizAdyacencia(2);
        matriz.agregarElemento(0, 1);
        assertTrue(matriz.existeElemento(0, 1));
        assertTrue(matriz.existeElemento(1, 0));
    }
    
    
    @Test
    public void eliminarElementoTest() {
    	matriz = new MatrizAdyacencia(1);
    	matriz.eliminarElemento(0, 0);
    	assertTrue(!matriz.existeElemento(0, 0));
    }
    
    @Test
    public void eliminarElementoSimetricoTest() {
    	matriz = new MatrizAdyacencia(2);
    	matriz.agregarElemento(0, 1);
    	matriz.eliminarElemento(1, 0);
    	assertTrue(!matriz.existeElemento(0, 1));
    }
    
    @Test
    public void contarRelacionesTest() {
    	matriz = new MatrizAdyacencia(4);
    	matriz.agregarElemento(0, 1);
    	matriz.agregarElemento(1, 2);
    	matriz.agregarElemento(2, 3);
    	
    	assertTrue(matriz.getCantidadElementos() == 3);
    }

    
    @Test
    public void agregarElementoColumnaNegativaTest() {
        matriz = new MatrizAdyacencia(2);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            matriz.agregarElemento(0, -1);
        });
    }
    
    @Test
    public void agregarElementoFueraRangoTest() {
        matriz = new MatrizAdyacencia(2);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            matriz.agregarElemento(0,2 );
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            matriz.agregarElemento(2, 0);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            matriz.agregarElemento(2, 2);
        });
    }
}
