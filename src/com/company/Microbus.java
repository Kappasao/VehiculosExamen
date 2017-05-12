package com.company;

public class Microbus extends Transporte {

    public Microbus(String matricula, int plazas) {
        super(matricula, plazas);
    }

    @Override
    public double calcularAlquiler(int dias) {
        return super.calcularAlquiler(dias) + 2 * plazas;
    }

    @Override
    public String toString() {
        return "Microbus{" +
                "matricula='" + matricula + '\'' +
                ", plazas=" + plazas +
                '}';
    }

}
