package org.example;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double gatosGasolinakm, km,precioLitro=5000,multplicacionGasolina;
        Scanner leerDato=new Scanner(System.in);
        System.out.println("el precio de la gasolina por litro es de 5000");

        System.out.println("ingrese el numero de gasolina gastada por cada 100km");
        gatosGasolinakm=leerDato.nextDouble();

        multplicacionGasolina= precioLitro*precioLitro;

        System.out.println("ingrese la cantidad de distancia que vas a conducir");
        km= leerDato.nextDouble();
        double gasolinaEstimada =km*gatosGasolinakm/100;
        double precioEstimado= gasolinaEstimada*precioLitro;
   
        System.out.println("la distancia recorrida es de "+km+"km, el total del precio de la gasolina consumida es de" +gasolinaEstimada+ "litros, y el total de su costo por todo es:" +precioEstimado);
    }



}

