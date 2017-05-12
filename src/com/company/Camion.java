package com.company;

public class Camion extends Carga {

    public Camion(String matricula, double PMA) {
        super(matricula, PMA);
    }

    @Override
    public double calcularAlquiler(int dias) {
        return super.calcularAlquiler(dias) + 40;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "matricula='" + matricula + '\'' +
                ", PMA=" + PMA +
                '}';
    }
}
