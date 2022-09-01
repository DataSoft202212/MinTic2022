package com.datasoft.sistemadegestion.entidades;

import java.util.Date;

public class Ingresos extends MovimientoDinero {
    private int idIngreso;
    private Date fechaIngreso;
    private double valorIngreso;
    private String conceptoIngreso;

    public Ingresos(int numMovimientoDinero, TipoDeMovimiento tipoMovimientoDinero, Empleado usuarioMovimientoDinero, int idIngreso, Date fechaIngreso, double valorIngreso, String conceptoIngreso) {
        super(numMovimientoDinero, tipoMovimientoDinero, usuarioMovimientoDinero);
        this.idIngreso = idIngreso;
        this.fechaIngreso = fechaIngreso;
        this.valorIngreso = valorIngreso;
        this.conceptoIngreso = conceptoIngreso;
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getValorIngreso() {
        return valorIngreso;
    }

    public void setValorIngreso(double valorIngreso) {
        this.valorIngreso = valorIngreso;
    }

    public String getConceptoIngreso() {
        return conceptoIngreso;
    }

    public void setConceptoIngreso(String conceptoIngreso) {
        this.conceptoIngreso = conceptoIngreso;
    }

    @Override
    public String toString() {
        return "Ingresos{" +
                "idIngreso=" + idIngreso +
                ", fechaIngreso=" + fechaIngreso +
                ", valorIngreso=" + valorIngreso +
                ", conceptoIngreso='" + conceptoIngreso + '\'' +
                "} " + super.toString();
    }
}
