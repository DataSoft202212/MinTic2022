package com.datasoft.sistemadegestion.entidades;

public class Empleado {
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private String dirreccionEmpleado;
    private String telefonoEmpleado;
    private String emailEmpleado;
    private Rol rolEmpleado;
    private Empresa empresa;

    public Empleado(String nombreEmpleado, String apellidoEmpleado, String dirreccionEmpleado, String telefonoEmpleado, String emailEmpleado, Rol rolEmpleado, Empresa empresa) {
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.dirreccionEmpleado = dirreccionEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.rolEmpleado = rolEmpleado;
        this.empresa = empresa;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getDirreccionEmpleado() {
        return dirreccionEmpleado;
    }

    public void setDirreccionEmpleado(String dirreccionEmpleado) {
        this.dirreccionEmpleado = dirreccionEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }

    public Rol getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(Rol rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombreEmpleado='" + nombreEmpleado + '\'' +
                ", apellidoEmpleado='" + apellidoEmpleado + '\'' +
                ", dirreccionEmpleado='" + dirreccionEmpleado + '\'' +
                ", telefonoEmpleado='" + telefonoEmpleado + '\'' +
                ", emailEmpleado='" + emailEmpleado + '\'' +
                ", rolEmpleado=" + rolEmpleado +
                ", empresa=" + empresa +
                '}';
    }
}
