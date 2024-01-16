package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           /*mostrar el consumo total de combustible para
        el viaje y el costo total de este combustible*/ /*litros por casda 100km*/
        double km, precioGasolina,precioLitro=5000,gasolinaConsumida;
        Scanner leerDato=new Scanner(System.in);
        System.out.println("ingrese el numero de km recorridos");
        km=leerDato.nextDouble();
        System.out.println("el precio de la gasolina por litro es de 5000");
        System.out.println("ingrese la cantidad de gasolina consumida en lintros");
        gasolinaConsumida= leerDato.nextDouble();
        double precioEstimado =precioLitro*gasolinaConsumida;
        double totalPrecio= precioEstimado*km;
        System.out.println("la distancia recorrida es de"+km+"km, su consumo de gasolina es de "+gasolinaConsumida+" el total del precio de la gasolina consumida es de" +precioEstimado+ "litros, y el total de su costo por todo es:" +totalPrecio);
    }
}