package com.datasoft.sistemadegestion.entidades;



public class MovimientoDinero {
    private int numMovimientoDinero;
    private TipoDeMovimiento tipoMovimientoDinero;
    private Empleado usuarioMovimientoDinero;

    public MovimientoDinero(int numMovimientoDinero, TipoDeMovimiento tipoMovimientoDinero, Empleado usuarioMovimientoDinero) {
        this.numMovimientoDinero = numMovimientoDinero;
        this.tipoMovimientoDinero = tipoMovimientoDinero;
        this.usuarioMovimientoDinero = usuarioMovimientoDinero;
    }

    public int getNumMovimientoDinero() {
        return numMovimientoDinero;
    }

    public void setNumMovimientoDinero(int numMovimientoDinero) {
        this.numMovimientoDinero = numMovimientoDinero;
    }

    public TipoDeMovimiento getTipoMovimientoDinero() {
        return tipoMovimientoDinero;
    }

    public void setTipoMovimientoDinero(TipoDeMovimiento tipoMovimientoDinero) {
        this.tipoMovimientoDinero = tipoMovimientoDinero;
    }

    public Empleado getUsuarioMovimientoDinero() {
        return usuarioMovimientoDinero;
    }

    public void setUsuarioMovimientoDinero(Empleado usuarioMovimientoDinero) {
        this.usuarioMovimientoDinero = usuarioMovimientoDinero;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "numMovimientoDinero=" + numMovimientoDinero +
                ", tipoMovimientoDinero=" + tipoMovimientoDinero +
                ", usuarioMovimientoDinero=" + usuarioMovimientoDinero +
                '}';
    }
}

