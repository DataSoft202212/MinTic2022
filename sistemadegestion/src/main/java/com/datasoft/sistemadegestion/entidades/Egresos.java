package com.datasoft.sistemadegestion.entidades;

public class Egresos {
    private int idEgreso;
    private double valorEgreso;

    public Egresos() {
    }

    public int getIdEgreso() {
        return idEgreso;
    }

    public void setIdEgreso(int idEgreso) {
        this.idEgreso = idEgreso;
    }

    public double getValorEgreso() {
        return valorEgreso;
    }

    public void setValorEgreso(double valorEgreso) {
        this.valorEgreso = valorEgreso;
    }

    @Override
    public String toString() {
        return "Egresos{" +
                "idEgreso=" + idEgreso +
                ", valorEgreso=" + valorEgreso +
                '}';
    }
}
