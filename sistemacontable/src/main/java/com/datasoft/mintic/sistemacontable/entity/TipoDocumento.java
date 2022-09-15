package com.datasoft.mintic.sistemacontable.entity;

import javax.persistence.*;

@Entity
@Table(name = "tipo_documento")
public class TipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_documento")
    private long idTipoDocumento;
    @Column(name = "descripcion_tipo_documento",nullable = false)
    private String descripcionTipodocumento;
    @Column(name = "siglas_tipo_documento",nullable = false)
    private String siglasTipoDocumento;
    @Column(name = "estado",nullable = false)
    private boolean estado;

    public TipoDocumento() {
    }

    public TipoDocumento(long idTipoDocumento, String descripcionTipodocumento, String siglasTipoDocumento, boolean estado) {
        this.idTipoDocumento = idTipoDocumento;
        this.descripcionTipodocumento = descripcionTipodocumento;
        this.siglasTipoDocumento = siglasTipoDocumento;
        this.estado = estado;
    }

    public long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDescripcionTipodocumento() {
        return descripcionTipodocumento;
    }

    public void setDescripcionTipodocumento(String descripcionTipodocumento) {
        this.descripcionTipodocumento = descripcionTipodocumento;
    }

    public String getSiglasTipoDocumento() {
        return siglasTipoDocumento;
    }

    public void setSiglasTipoDocumento(String siglasTipoDocumento) {
        this.siglasTipoDocumento = siglasTipoDocumento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "TipoDocumento{" +
                "idTipoDocumento=" + idTipoDocumento +
                ", descripcionTipodocumento='" + descripcionTipodocumento + '\'' +
                ", siglasTipoDocumento='" + siglasTipoDocumento + '\'' +
                ", estado=" + estado +
                '}';
    }
}
