package com.peliculas.renta;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlquilerTest {
	
	Cliente cliente = new Cliente("Erick Anaya");
	Alquiler alq = new Alquiler(2);
	
	@Test
	public void testCrearFactura() {
		Pelicula peli1 = new Pelicula("Terminator",0);
		Pelicula peli2 = new Pelicula("Los Pitufos",2);
		Pelicula peli3 = new Pelicula("Titanes del pacífico 2",1);
		
		alq.setPeliculasAlquiladas(peli1);
		alq.setPeliculasAlquiladas(peli2);
		alq.setPeliculasAlquiladas(peli3);
		cliente.setAlquiler(alq);
		
		assertEquals(alq.crearFactura(),"Terminator	2.0\n" + 
										"Los Pitufos	1.5\n" + 
										"Titanes del pacífico 2	6.0\n" + 
										"\n" + 
										"Monto total:  9.5\n" + 
										"Gano 4 puntos por alquiler frecuente");
	}
	
	@Test
	public void testGetDiasAlquilado() {
		assertEquals(alq.getDiasAlquilado(),2);
	}

}
