package com.company;

/**
 * Created by 46995932D on 01/06/2017.
 */
public class Refrigeracion extends Carga {

    protected int volumen;

    public Refrigeracion(String matricula, double PMA, int volumen){
        super(matricula,PMA);
        this.volumen = volumen;
    }

    @Override

    public double calcularAlquiler(int dias){
        double base = super.calcularAlquiler(dias);
        return base + (40 * volumen * dias);
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
