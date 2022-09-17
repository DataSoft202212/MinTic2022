package com.datasoft.mintic.sistemacontable.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "Ingresos")
public class Ingreso extends MovimientoDinero{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_ingreso")
    private long idIngreso;

    @Column (name = "fecha_ingreso")
    private Date fechaIngreso;

    @Column (name = "valor_ingreso")
    private double valorIngreso;

    @Column (name = "concepto_ingreso")
    private String conceptoIngreso;

    public Ingreso(){

    }

    public Ingreso(long idMovDinero, TipoMovimiento tipoMovDinero, Usuario userMovDinero, Empresa empresaMovDinero, long idIngreso, Date fechaIngreso, double valorIngreso, String conceptoIngreso) {
        super(idMovDinero, tipoMovDinero, userMovDinero, empresaMovDinero);
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
