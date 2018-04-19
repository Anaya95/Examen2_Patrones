package com.peliculas.renta;

import java.util.ArrayList;
import java.util.Iterator;

public class Alquiler {
    private ArrayList<Pelicula> peliculasAlquiladas = new ArrayList<Pelicula>();
    private int diasAlquilado;
    private double montoTotal = 0;
    
    public Alquiler(int diasAlquilado) {
    	this.diasAlquilado = diasAlquilado;
    }
    
    public int getDiasAlquilado() {
    	return diasAlquilado;
    }
    
    public ArrayList<Pelicula> getPeliculas() {
    	return peliculasAlquiladas;
    }
    
    public void setPeliculasAlquiladas(Pelicula peli) {
    	peliculasAlquiladas.add(peli);
    }
    
    public String statement() {
        int puntosAlquilerFrecuente = 0;
        Iterator<Pelicula> iterator = peliculasAlquiladas.iterator();
        String result = "";
        while (iterator.hasNext()) {
            double montoAlquiler = 0;
            Pelicula peli = iterator.next();

            //determine amounts for each line
            switch (peli.getTipoCobro()) {
                case Pelicula.NORMAL:
                	montoTotal = 2;
                    if (diasAlquilado > 2)
                    	montoTotal = (diasAlquilado * 1.5) - 2;
                    break;
                case Pelicula.ESTRENO:
                	montoTotal = diasAlquilado * 3;
                    break;
                case Pelicula.INFANTIL:
                    montoAlquiler += 1.5;
                    if (diasAlquilado > 3)
                    	montoTotal += (diasAlquilado * 1.5) - 3;
                    break;

            }
            montoTotal = montoAlquiler;

            puntosAlquilerFrecuente ++;
            // agregar bono por alquiler de pelicula "estreno"
            if ((peli.getTipoCobro() == Pelicula.ESTRENO) && diasAlquilado > 1) puntosAlquilerFrecuente ++;

            //mostrar datos
            result += "\t" + peli.getNombre()+ "\t" + String.valueOf(montoAlquiler) + "\n";

        }
        //fin del reporte
        result +=  "Monto total:  " + String.valueOf(montoTotal) + "\n";
        result += "Gano " + String.valueOf(puntosAlquilerFrecuente) + " puntos por alquiler frecuente";
        return result;

    }
}