package com.datasoft.sistemadegestion.entidades;
class Empresa {
    private int nitEmpresa;
    private String razonSocialEmpresa;
    private String direccionEmpresa;
    private int telefeonoEmpresa;
    private String emailEmpresa;

    public void crearEmpresar(){

    }

    public void modificarEmpresa(){

    }

    public Empresa(int nitEmpresa, String razonSocialEmpresa, String direccionEmpresa, int telefeonoEmpresa, String emailEmpresa) {
        this.nitEmpresa = nitEmpresa;
        this.razonSocialEmpresa = razonSocialEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefeonoEmpresa = telefeonoEmpresa;
        this.emailEmpresa = emailEmpresa;
    }

    public int getNitEmpresa() {
        return nitEmpresa;
    }

    public String getRazonSocialEmpresa() {
        return razonSocialEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public int getTelefeonoEmpresa() {
        return telefeonoEmpresa;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public void setRazonSocialEmpresa(String razonSocialEmpresa) {
        this.razonSocialEmpresa = razonSocialEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public void setTelefeonoEmpresa(int telefeonoEmpresa) {
        this.telefeonoEmpresa = telefeonoEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }
}
