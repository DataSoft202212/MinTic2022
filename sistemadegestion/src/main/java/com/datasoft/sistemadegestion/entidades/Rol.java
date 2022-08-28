package com.datasoft.sistemadegestion.entidades;

public class Rol {
    private double idRol;
    private String descripcionRol;
    private boolean estadoRol;

    public Rol(double idRol, String descripcionRol, boolean estadoRol) {
        this.idRol = idRol;
        this.descripcionRol = descripcionRol;
        this.estadoRol = estadoRol;
    }

    public double getIdRol() {
        return idRol;
    }

    public void setIdRol(double idRol) {
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
