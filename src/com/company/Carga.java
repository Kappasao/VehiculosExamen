package com.company;

public class Carga extends Vehiculo {

    protected double PMA;

    public Carga(String matricula, double PMA) {
        super(matricula);
        this.PMA = PMA;
    }

    @Override
    public double calcularAlquiler(int dias) {
        double precio = super.calcularAlquiler(dias) + 20 * PMA;
        return precio;
    }

    @Override
    public String toString() {
        return "Carga{" +
                "matricula='" + matricula + '\'' +
                ", PMA=" + PMA +
                '}';
    }

}
