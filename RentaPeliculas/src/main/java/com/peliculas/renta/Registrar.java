package com.peliculas.renta;

import java.util.HashMap;

public class Registrar {
	private static HashMap peliculas = new HashMap();
	private static HashMap clientes = new HashMap();
	
	public static Object getPelicula(String nombre) {
		return peliculas.get(nombre);
		
	}
	
	public static Object getCliente(String nombre) {
		return clientes.get(nombre);
		
	}
	
	public static void addPelicula(Pelicula pelicula) {
		peliculas.put(pelicula.getNombre(), pelicula);
	}
	
	public static void addCliente(Cliente cliente) {
		clientes.put(cliente.getNombre(), cliente);
	}
}