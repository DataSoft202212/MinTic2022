package com.datasoft.sistemadegestion.entidades;

public class TipoDocumento {
    private int idTipoDocumento;
    private String tipoDocumento;
    private String siglasDocumento;
    private boolean estadoDocumento;

    public TipoDocumento(int idTipoDocumento, String tipoDocumento, String siglasDocumento, boolean estadoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
        this.tipoDocumento = tipoDocumento;
        this.siglasDocumento = siglasDocumento;
        this.estadoDocumento = estadoDocumento;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getSiglasDocumento() {
        return siglasDocumento;
    }

    public void setSiglasDocumento(String siglasDocumento) {
        this.siglasDocumento = siglasDocumento;
    }

    public boolean isEstadoDocumento() {
        return estadoDocumento;
    }

    public void setEstadoDocumento(boolean estadoDocumento) {
        this.estadoDocumento = estadoDocumento;
    }

    @Override
    public String toString() {
        return "TipoDocumento{" +
                "idTipoDocumento=" + idTipoDocumento +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", siglasDocumento='" + siglasDocumento + '\'' +
                ", estadoDocumento=" + estadoDocumento +
                '}';
    }
}
