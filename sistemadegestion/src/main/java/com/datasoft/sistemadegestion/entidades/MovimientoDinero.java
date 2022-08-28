package com.datasoft.sistemadegestion.entidades;


public class MovimientoDinero {
    private int numMovimientoDinero;
    private String fechaMovimientoDinero;
    private String conceptoMovimientoDinero;
    private String usuarioMovimientoDinero;

    public MovimientoDinero(int numMovimientoDinero, String fechaMovimientoDinero, String conceptoMovimientoDinero, String usuarioMovimientoDinero) {
        this.numMovimientoDinero = numMovimientoDinero;
        this.fechaMovimientoDinero = fechaMovimientoDinero;
        this.conceptoMovimientoDinero = conceptoMovimientoDinero;
        this.usuarioMovimientoDinero = usuarioMovimientoDinero;
    }

    public int getNumMovimientoDinero() {
        return numMovimientoDinero;
    }

    public void setNumMovimientoDinero(int numMovimientoDinero) {
        this.numMovimientoDinero = numMovimientoDinero;
    }

    public String getFechaMovimientoDinero() {
        return fechaMovimientoDinero;
    }

    public void setFechaMovimientoDinero(String fechaMovimientoDinero) {
        this.fechaMovimientoDinero = fechaMovimientoDinero;
    }

    public String getConceptoMovimientoDinero() {
        return conceptoMovimientoDinero;
    }

    public void setConceptoMovimientoDinero(String conceptoMovimientoDinero) {
        this.conceptoMovimientoDinero = conceptoMovimientoDinero;
    }

    public String getUsuarioMovimientoDinero() {
        return usuarioMovimientoDinero;
    }

    public void setUsuarioMovimientoDinero(String usuarioMovimientoDinero) {
        this.usuarioMovimientoDinero = usuarioMovimientoDinero;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "numMovimientoDinero=" + numMovimientoDinero +
                ", fechaMovimientoDinero='" + fechaMovimientoDinero + '\'' +
                ", conceptoMovimientoDinero='" + conceptoMovimientoDinero + '\'' +
                ", usuarioMovimientoDinero='" + usuarioMovimientoDinero + '\'' +
                '}';
    }
}
