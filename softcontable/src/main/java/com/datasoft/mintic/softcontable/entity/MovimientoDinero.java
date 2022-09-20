package com.datasoft.mintic.softcontable.entity;

import javax.persistence.*;

@MappedSuperclass
public class MovimientoDinero {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_mov_dinero")
    private long idMovDinero;

    @Column (name = "tipo_mov_dinero")
    private TipoMovimiento tipoMovDinero;

    @ManyToOne
    @JoinColumn (name = "id_usuario")
    private Usuario userMovDinero;

    @ManyToOne
    @JoinColumn (name = "id_empresa")
    private Empresa empresaMovDinero;

    public MovimientoDinero(){

    }


    public MovimientoDinero(long idMovDinero, TipoMovimiento tipoMovDinero, Usuario userMovDinero, Empresa empresaMovDinero) {
        this.idMovDinero = idMovDinero;
        this.tipoMovDinero = tipoMovDinero;
        this.userMovDinero = userMovDinero;
        this.empresaMovDinero = empresaMovDinero;
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

    public Empresa getEmpresaMovDinero() {
        return empresaMovDinero;
    }

    public void setEmpresaMovDinero(Empresa empresaMovDinero) {
        this.empresaMovDinero = empresaMovDinero;
    }
}
