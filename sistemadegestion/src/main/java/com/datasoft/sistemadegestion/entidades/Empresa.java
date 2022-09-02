package com.datasoft.sistemadegestion.entidades;
public class Empresa {
    private int nitEmpresa;
    private String razonSocialEmpresa;
    private String direccionEmpresa;
    private int telefonoEmpresa;
    private String emailEmpresa;

    public Empresa(int nitEmpresa, String razonSocialEmpresa, String direccionEmpresa, int telefonoEmpresa, String emailEmpresa) {
        this.nitEmpresa = nitEmpresa;
        this.razonSocialEmpresa = razonSocialEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.emailEmpresa = emailEmpresa;
    }

    public int getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getRazonSocialEmpresa() {
        return razonSocialEmpresa;
    }

    public void setRazonSocialEmpresa(String razonSocialEmpresa) {
        this.razonSocialEmpresa = razonSocialEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public int getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(int telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nitEmpresa=" + nitEmpresa +
                ", razonSocialEmpresa='" + razonSocialEmpresa + '\'' +
                ", direccionEmpresa='" + direccionEmpresa + '\'' +
                ", telefonoEmpresa=" + telefonoEmpresa +
                ", emailEmpresa='" + emailEmpresa + '\'' +
                '}';
    }
}
