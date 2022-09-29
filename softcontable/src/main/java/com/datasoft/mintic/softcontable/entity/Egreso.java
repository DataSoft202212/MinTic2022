package com.datasoft.mintic.softcontable.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "Egresos")
public class Egreso extends MovimientoDinero{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_egreso")
    private long idEgreso;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    @Column (name = "fecha_egreso", nullable = false)
    private Date fechaEgreso;

    @Column (name = "valor_egreso", nullable = false)
    private double valorEgreso;

    @Column (name = "concepto_egreso", nullable = false)
    private String conceptoEgreso;

    public Egreso(){

    }

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
