package org.example;


import org.example.MODELOS.Apartamentos;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        Apartamentos apartamentos  = new Apartamentos();

        System.out.println("***************");
        System.out.println("SYSTEMA");
        System.out.println("***************");

        System.out.println("direccion");
        apartamentos.setDireccion(lea.nextLine());
        System.out.println("Habitaciones");
        apartamentos.setNumeroHabitaciones(lea.nextInt());
        System.out.println("Numerobaños");
        apartamentos.setNumeroBanos(lea.nextInt());
        System.out.println("Metros cuadrados");
        apartamentos.setTamanoMetrosCuadrados(lea.nextDouble());
        System.out.println("tiene Balcon?");
        apartamentos.setTieneBalcon(lea.nextBoolean());
        System.out.println("permite mascotas?");
        apartamentos.setPermiteMascotas(lea.nextBoolean());
        System.out.println("Alquiler mensual");
        apartamentos.setPrecioAlquilerMensual(lea.nextDouble());
    }
}