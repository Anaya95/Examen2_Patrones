package com.peliculas.renta;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void testStatement() {
		Cliente cliente = new Cliente("Erick Anaya");
		Pelicula peli1 = new Pelicula("Terminator",0);
		Pelicula peli2 = new Pelicula("Los Pitufos",2);
		Pelicula peli3 = new Pelicula("Gigantes del pacífico 2",1);
		Disco disc1 = new Disco("x",peli1);
		Disco disc2 = new Disco("xx",peli2);
		Disco disc3 = new Disco("xxx",peli3);
		Alquiler alq1 = new Alquiler(disc1,5);
		Alquiler alq2 = new Alquiler(disc2,2);
		Alquiler alq3 = new Alquiler(disc3,1);
		cliente.addRental(alq1);
		cliente.addRental(alq2);
		cliente.addRental(alq3);
		
		System.out.println(cliente.statement());
		assertEquals(cliente.statement(),"Alquileres de Erick Anaya:\n" + 
				"	Terminator	6.5\n" + 
				"	Los Pitufos	1.5\n" + 
				"	Gigantes del pacífico 2	3.0\n" + 
				"Monto total:  11.0\n" + 
				"Gano 3 puntos por alquiler frecuente");
	}
}
