package com.company;

public class Furgoneta extends Carga {

    private boolean isotermico;

    public Furgoneta(String matricula, double PMA, boolean isotermico) {
        super(matricula, PMA);
        this.isotermico = isotermico;
    }

    @Override
    public double calcularAlquiler(int dias) {
        double precio = super.calcularAlquiler(dias);

        if (isotermico) {
            precio += 200;
        }

        return precio;
    }

    @Override
    public String toString() {
        return "Furgoneta{" +
                "matricula='" + matricula + '\'' +
                ", isotermico=" + isotermico +
                ", PMA=" + PMA +
                '}';
    }
}
