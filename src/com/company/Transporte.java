package com.company;

public class Transporte extends Vehiculo {

    protected int plazas;

    public Transporte(String matricula, int plazas) {
        super(matricula);
        this.plazas = plazas;
    }

    @Override
    public double calcularAlquiler(int dias) {
        double base = super.calcularAlquiler(dias);
        return base + 1.5 * dias + 1.5 * plazas;
    }

    @Override
    public String toString() {
        return "Transporte{" +
                "matricula='" + matricula + '\'' +
                ", plazas=" + plazas +
                '}';
    }
}
