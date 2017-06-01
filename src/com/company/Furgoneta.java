package com.company;

public class Furgoneta extends Refrigeracion {


    public Furgoneta(String matricula, double PMA, int volumen) {
        super(matricula, PMA, volumen);
    }

    @Override
    public double calcularAlquiler(int dias) {
        double precio = super.calcularAlquiler(dias);

        return precio;
    }

    @Override
    public String toString() {
        return "Carga{" +
                "matricula='" + matricula + '\'' +
                ", PMA=" + PMA +
                ", volumen" +volumen+
                '}';
    }
}
