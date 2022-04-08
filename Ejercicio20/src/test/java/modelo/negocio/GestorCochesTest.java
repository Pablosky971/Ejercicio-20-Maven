package modelo.negocio;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import modelo.entidad.Coche;

class GestorCochesTest {
	
	@Test
	void getCocheId() {
		
		int id = 1;
		
		String matriculaEsperada = "2502MPX";
		String marcaEsperada = "Hyundai";
		String modeloEsperado = "Kona";
		double kmEsperado = 25022022;
		
		GestorCoche g = new GestorCoche();
		Coche coche = g.obtenerCocheId(id);
		
		// Comprobaciones:
		assertEquals(matriculaEsperada, coche.getMatricula());
		assertEquals(marcaEsperada, coche.getMarca());
		assertEquals(modeloEsperado, coche.getModelo());
		assertEquals(kmEsperado, coche.getKilometros());
		
		

}
}
