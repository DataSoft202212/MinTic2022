package com.datasoft.mintic.sistemacontable.entity;

import java.util.Date;

public class Ingreso extends MovimientoDinero{

    private long idIngreso;
    private Date fechaIngreso;
    private double valorIngreso;
    private String conceptoIngreso;

    public Ingreso(long idMovDinero, TipoMovimiento tipoMovDinero, Usuario userMovDinero, long idIngreso, Date fechaIngreso, double valorIngreso, String conceptoIngreso) {
        super(idMovDinero, tipoMovDinero, userMovDinero);
        this.idIngreso = idIngreso;
        this.fechaIngreso = fechaIngreso;
        this.valorIngreso = valorIngreso;
        this.conceptoIngreso = conceptoIngreso;
    }

    public long getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(long idIngreso) {
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
        return "Ingreso{" +
                "idIngreso=" + idIngreso +
                ", fechaIngreso=" + fechaIngreso +
                ", valorIngreso=" + valorIngreso +
                ", conceptoIngreso='" + conceptoIngreso + '\'' +
                "} " + super.toString();
    }
}
