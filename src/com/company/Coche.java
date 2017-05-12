package com.company;

public class Coche extends Transporte {

    private boolean permiteFumar;
    private String categoria;

    public Coche(String matricula, int plazas, boolean permiteFumar, String categoria) {
        super(matricula, plazas);
        this.permiteFumar = permiteFumar;
        this.categoria = categoria;
    }

    @Override
    public double calcularAlquiler(int dias) {
        double precio = super.calcularAlquiler(dias);

        if (permiteFumar) {
            precio += 50;
        }

        switch (categoria) {
            case "A":
                precio += 40 * dias;
                break;
            case "B":
                precio += 30 * dias;
                break;
            case "C":
                precio += 20 * dias;
                break;
        }

        return precio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", permiteFumar=" + permiteFumar +
                ", plazas=" + plazas +
                ", categoria='" + categoria + '\'' +
                '}';
    }

}
