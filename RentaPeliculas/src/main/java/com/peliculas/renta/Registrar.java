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
	
	public static void addPelicula(String coleccion, Object objeto) {
		Pelicula nuevaPelicula = (Pelicula) objeto;
		peliculas.put(nuevaPelicula.getNombre(), nuevaPelicula);
	}
	
	public static void addCliente(String coleccion, Object objeto) {
		Cliente nuevoCliente = (Cliente) objeto;
		clientes.put(nuevoCliente.getNombre(), nuevoCliente);
	}
}