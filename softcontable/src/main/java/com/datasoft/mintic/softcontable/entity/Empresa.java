package com.datasoft.mintic.softcontable.entity;

import javax.persistence.*;

@Entity
@Table(name = "empresa")

public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private long idEmpresa;
    @Column(name = "nit_empresa", unique = true)
    private long nitEmpresa;
    @Column(name = "razon_social_empresa", nullable = false)
    private String razonSocialEmpresa;
    @Column(name = "dir_empresa",nullable = false)
    private String dirEmpresa;
    @Column(name = "tel_empresa", nullable = false)
    private long telEmpresa;
    @Column(name = "email_empresa",nullable = false)
    private String emailEmpresa;

    public Empresa() {
    }

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


