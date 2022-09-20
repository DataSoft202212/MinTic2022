package com.datasoft.mintic.softcontable.entity;

import javax.persistence.*;

@Entity
@Table (name = "Roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private long idRol;
    @Column(name = "descripcion", nullable = false)
    private String descripcionRol;
    @Column(name = "estado")
    private boolean estadoRol;

    public Rol() {
    }

    public Rol(long idRol, String descripcionRol, boolean estadoRol) {
        this.idRol = idRol;
        this.descripcionRol = descripcionRol;
        this.estadoRol = estadoRol;
    }

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }

    public boolean isEstadoRol() {
        return estadoRol;
    }

    public void setEstadoRol(boolean estadoRol) {
        this.estadoRol = estadoRol;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "idRol=" + idRol +
                ", descripcionRol='" + descripcionRol + '\'' +
                ", estadoRol=" + estadoRol +
                '}';
    }
}
