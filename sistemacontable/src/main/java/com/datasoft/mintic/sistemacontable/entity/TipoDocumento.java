package com.datasoft.mintic.sistemacontable.entity;

public class TipoDocumento {
    private long idTipoDocumento;
    private String descripcionTipodocumento;
    private String siglasTipoDocumento;
    private boolean estado;

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
