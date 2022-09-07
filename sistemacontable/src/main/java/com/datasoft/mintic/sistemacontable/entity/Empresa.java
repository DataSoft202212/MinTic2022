package com.datasoft.mintic.sistemacontable.entity;

public class Empresa {

    private long idEmpresa;
    private long nitEmpresa;
    private String razonSocialEmpresa;
    private String dirEmpresa;
    private long telEmpresa;
    private String emailEmpresa;

    public Empresa(long idEmpresa, long nitEmpresa, String razonSocialEmpresa, String dirEmpresa, long telEmpresa, String emailEmpresa) {
        this.idEmpresa = idEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.razonSocialEmpresa = razonSocialEmpresa;
        this.dirEmpresa = dirEmpresa;
        this.telEmpresa = telEmpresa;
        this.emailEmpresa = emailEmpresa;
    }

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public long getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(long nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getRazonSocialEmpresa() {
        return razonSocialEmpresa;
    }

    public void setRazonSocialEmpresa(String razonSocialEmpresa) {
        this.razonSocialEmpresa = razonSocialEmpresa;
    }

    public String getDirEmpresa() {
        return dirEmpresa;
    }

    public void setDirEmpresa(String dirEmpresa) {
        this.dirEmpresa = dirEmpresa;
    }

    public long getTelEmpresa() {
        return telEmpresa;
    }

    public void setTelEmpresa(long telEmpresa) {
        this.telEmpresa = telEmpresa;
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
                "idEmpresa=" + idEmpresa +
                ", nitEmpresa=" + nitEmpresa +
                ", razonSocialEmpresa='" + razonSocialEmpresa + '\'' +
                ", dirEmpresa='" + dirEmpresa + '\'' +
                ", telEmpresa=" + telEmpresa +
                ", emailEmpresa='" + emailEmpresa + '\'' +
                '}';
    }
}


