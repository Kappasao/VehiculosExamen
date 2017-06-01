package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Coche coche1 = new Coche("A123", 5, true, "A");
        Coche coche2 = new Coche("B456", 5, false, "A");
        Coche coche3 = new Coche("C789", 5, false, "B");
        Coche coche4 = new Coche("D123", 4, true, "B");
        Coche coche5 = new Coche("E456", 4, true, "C");
        Coche coche6 = new Coche("F789", 4, false, "C");
        Microbus microbus = new Microbus("G123", 21);
        Camion camion = new Camion("H456", 18);
        Furgoneta furgoneta1 = new Furgoneta("I789", 2, 200 );
        Furgoneta furgoneta2 = new Furgoneta("J123", 4, 233);

        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(coche1);
        vehiculos.add(coche2);
        vehiculos.add(coche3);
        vehiculos.add(coche4);
        vehiculos.add(coche5);
        vehiculos.add(coche6);
        vehiculos.add(microbus);
        vehiculos.add(camion);
        vehiculos.add(furgoneta1);
        vehiculos.add(furgoneta2);

        int opcion = 0;

        do {
            System.out.println("===============================================================");
            System.out.println("Selecciona una opción: [1] Calcular alquiler o [2] Cerrar.");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Calcular el alquiler de un vehiculo.");

                    System.out.println("Introduce la matrícula del vehiculo:");
                    String matricula = scanner.nextLine();

                    for (Vehiculo vehiculo : vehiculos) {
                        if (vehiculo.getMatricula().equals(matricula)) {
                            System.out.println("Introduce los días que ha estado en alquiler:");
                            int dias = scanner.nextInt();
                            scanner.nextLine();
                            double precioAlquiler = vehiculo.calcularAlquiler(dias);
                            System.out.println("El precio del alquiler es de: " + precioAlquiler + "€.");
                        }
                    }

                    break;
                case 2:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Cerrando");
                    System.out.println("===============================================================");
                    break;
            }
        } while (opcion != 2);

    }
}
