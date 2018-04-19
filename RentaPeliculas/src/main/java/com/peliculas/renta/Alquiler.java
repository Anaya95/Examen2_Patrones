package com.peliculas.renta;

import java.util.ArrayList;
import java.util.Iterator;

public class Alquiler {
    private ArrayList<Pelicula> peliculasAlquiladas = new ArrayList<Pelicula>();
    private int diasAlquilado;
    private double montoTotal = 0;
    private int puntosAlquilerFrecuente = 0;
    
    public Alquiler(int diasAlquilado) {
    	this.diasAlquilado = diasAlquilado;
    }
    
    public int getDiasAlquilado() {
    	return diasAlquilado;
    }
    
    public void setPeliculasAlquiladas(Pelicula peli) {
    	peliculasAlquiladas.add(peli);
    }
    
    public String crearFactura() {
        Iterator<Pelicula> iterator = peliculasAlquiladas.iterator();
        String result = "";
        
        while (iterator.hasNext()) {
            double montoAlquiler = 0;
            Pelicula peli = iterator.next();
            
            //determine amounts for each line
            switch (peli.getTipoCobro()) {
            case Pelicula.NORMAL:
                montoAlquiler = 2;
                if (diasAlquilado > 2)
                    montoAlquiler += (diasAlquilado - 2) * 1.5;
                break;
            case Pelicula.ESTRENO:
                montoAlquiler += diasAlquilado * 3;
                break;
            case Pelicula.INFANTIL:
                montoAlquiler += 1.5;
                if (diasAlquilado > 3)
                    montoAlquiler += (diasAlquilado - 3) * 1.5;
                break;

        }
            
        montoTotal += montoAlquiler;
        puntosAlquilerFrecuente ++;
        // agregar bono por alquiler de pelicula "estreno"
        if ((peli.getTipoCobro() == Pelicula.ESTRENO) && diasAlquilado > 1) puntosAlquilerFrecuente ++;

        //mostrar datos
        result += peli.getNombre()+ "\t" + montoAlquiler + "\n";

    }
    //fin del reporte
    result +=  "\nMonto total:  " + montoTotal + "\n";
    result += "Gano " + puntosAlquilerFrecuente + " puntos por alquiler frecuente";
    return result;
    }
}