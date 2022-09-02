package com.datasoft.sistemadegestion.entidades;

import java.util.Date;

public class Egresos extends MovimientoDinero{

    private int idEgreso;
    private Date fechaEgreso;
    private double valorEgreso;
    private String conceptoEgreso;

    public Egresos(int numMovimientoDinero, TipoDeMovimiento tipoMovimientoDinero, Empleado usuarioMovimientoDinero, int idEgreso, Date fechaEgreso, double valorEgreso, String conceptoEgreso) {
        super(numMovimientoDinero, tipoMovimientoDinero, usuarioMovimientoDinero);
        this.idEgreso = idEgreso;
        this.fechaEgreso = fechaEgreso;
        this.valorEgreso = valorEgreso;
        this.conceptoEgreso = conceptoEgreso;
    }

    public int getIdEgreso() {
        return idEgreso;
    }

    public void setIdEgreso(int idEgreso) {
        this.idEgreso = idEgreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public double getValorEgreso() {
        return valorEgreso;
    }

    public void setValorEgreso(double valorEgreso) {
        this.valorEgreso = valorEgreso;
    }

    public String getConceptoEgreso() {
        return conceptoEgreso;
    }

    public void setConceptoEgreso(String conceptoEgreso) {
        this.conceptoEgreso = conceptoEgreso;
    }

    @Override
    public String toString() {
        return "Egresos{" + super.toString() +
                "idEgreso=" + idEgreso +
                ", fechaEgreso=" + fechaEgreso +
                ", valorEgreso=" + valorEgreso +
                ", conceptoEgreso='" + conceptoEgreso + '\'' +
                "} " ;
    }
}
