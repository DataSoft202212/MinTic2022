package com.datasoft.sistemadegestion.entidades;

public class Ingresos {
    private int idIngreso;
    private double valorIngreso;

    public Ingresos() {
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    public double getValorIngreso() {
        return valorIngreso;
    }

    public void setValorIngreso(double valorIngreso) {
        this.valorIngreso = valorIngreso;
    }

    @Override
    public String toString() {
        return "Ingresos{" +
                "idIngreso=" + idIngreso +
                ", valorIngreso=" + valorIngreso +
                '}';
    }
}
