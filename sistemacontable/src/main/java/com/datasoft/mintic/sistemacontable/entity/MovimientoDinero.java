package com.datasoft.mintic.sistemacontable.entity;

public class MovimientoDinero {
    private long idMovDinero;
    private TipoMovimiento tipoMovDinero;
    private Usuario userMovDinero;

    public MovimientoDinero(long idMovDinero, TipoMovimiento tipoMovDinero, Usuario userMovDinero) {
        this.idMovDinero = idMovDinero;
        this.tipoMovDinero = tipoMovDinero;
        this.userMovDinero = userMovDinero;
    }

    public long getIdMovDinero() {
        return idMovDinero;
    }

    public void setIdMovDinero(long idMovDinero) {
        this.idMovDinero = idMovDinero;
    }

    public TipoMovimiento getTipoMovDinero() {
        return tipoMovDinero;
    }

    public void setTipoMovDinero(TipoMovimiento tipoMovDinero) {
        this.tipoMovDinero = tipoMovDinero;
    }

    public Usuario getUserMovDinero() {
        return userMovDinero;
    }

    public void setUserMovDinero(Usuario userMovDinero) {
        this.userMovDinero = userMovDinero;
    }
}
