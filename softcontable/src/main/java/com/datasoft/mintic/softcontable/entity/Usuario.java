package com.datasoft.mintic.softcontable.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private long idUsuario;
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento",nullable = false)
    private TipoDocumento tipoDocumento;
    @Column(name = "nro_identificacion",unique = true,nullable = false)
    private String nroIdentificacion;
    @Column(name = "nombre_usuario",nullable = false)
    private String nombreUsuario;
    @Column(name = "apellido_usuario",nullable = false)
    private String apellidoUsuario;
    @Column(name = "dir_usuario",nullable = false)
    private String dirUsuario;
    @Column(name = "tel_usuario", nullable = false)
    private long telUsuario;
    @Column(name = "email_usuario",nullable = false)
    private String emailUsuario;
    @ManyToOne
    @JoinColumn(name = "id_rol",nullable = false)
    private Rol rolUsuario;

    @ManyToOne
    @JoinColumn(name = "id_empresa", nullable = false)
    private Empresa empresa;
    @Column(name = "pass_usuario",nullable = false)
    private String passUsuario;
    @Column(name = "estado_usuario",nullable = false)
    private boolean estadoUsuario;

    public Usuario(){
    }

    public Usuario(long idUsuario, TipoDocumento tipoDocumento, String nroIdentificacion, String nombreUsuario, String apellidoUsuario, String dirUsuario, long telUsuario, String emailUsuario, Rol rolUsuario, Empresa empresa, String passUsuario, boolean estadoUsuario) {
        this.idUsuario = idUsuario;
        this.tipoDocumento = tipoDocumento;
        this.nroIdentificacion = nroIdentificacion;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.dirUsuario = dirUsuario;
        this.telUsuario = telUsuario;
        this.emailUsuario = emailUsuario;
        this.rolUsuario = rolUsuario;
        this.empresa = empresa;
        this.passUsuario = passUsuario;
        this.estadoUsuario = estadoUsuario;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroIdentificacion() {
        return nroIdentificacion;
    }

    public void setNroIdentificacion(String nroIdentificacion) {
        this.nroIdentificacion = nroIdentificacion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getDirUsuario() {
        return dirUsuario;
    }

    public void setDirUsuario(String dirUsuario) {
        this.dirUsuario = dirUsuario;
    }

    public long getTelUsuario() {
        return telUsuario;
    }

    public void setTelUsuario(long telUsuario) {
        this.telUsuario = telUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public Rol getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(Rol rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public String getPassUsuario() {
        return passUsuario;
    }

    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }

    public boolean isEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(boolean estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", tipoDocumento=" + tipoDocumento +
                ", nroIdentificacion='" + nroIdentificacion + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", apellidoUsuario='" + apellidoUsuario + '\'' +
                ", dirUsuario='" + dirUsuario + '\'' +
                ", telUsuario=" + telUsuario +
                ", emailUsuario='" + emailUsuario + '\'' +
                ", rolUsuario=" + rolUsuario +
                ", passUsuario='" + passUsuario + '\'' +
                ", estadoUsuario=" + estadoUsuario +
                '}';
    }
}
