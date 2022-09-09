package com.datasoft.mintic.sistemacontable.entity;

import java.util.Date;

public class Egreso extends MovimientoDinero{

    private long idEgreso;
    private Date fechaEgreso;
    private double valorEgreso;
    private String conceptoEgreso;

    public Egreso(long idMovDinero, TipoMovimiento tipoMovDinero, Usuario userMovDinero, Empresa empresaMovDinero, long idEgreso, Date fechaEgreso, double valorEgreso, String conceptoEgreso) {
        super(idMovDinero, tipoMovDinero, userMovDinero, empresaMovDinero);
        this.idEgreso = idEgreso;
        this.fechaEgreso = fechaEgreso;
        this.valorEgreso = valorEgreso;
        this.conceptoEgreso = conceptoEgreso;
    }

    public long getIdEgreso() {
        return idEgreso;
    }

    public void setIdEgreso(long idEgreso) {
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
        return "Egreso{" +
                "idEgreso=" + idEgreso +
                ", fechaEgreso=" + fechaEgreso +
                ", valorEgreso=" + valorEgreso +
                ", conceptoEgreso='" + conceptoEgreso + '\'' +
                "} " + super.toString();
    }
}
