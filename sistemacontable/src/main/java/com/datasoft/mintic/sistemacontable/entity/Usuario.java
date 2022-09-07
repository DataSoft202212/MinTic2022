package com.datasoft.mintic.sistemacontable.entity;

public class Usuario {
    private long idUsuario;
    private TipoDocumento tipoDocumento;
    private String nroIdentificacion;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String dirUsuario;
    private long telUsuario;
    private String emailUsuario;
    private Rol rolUsuario;
    private String passUsuario;
    private boolean estadoUsuario;

    public Usuario(long idUsuario, TipoDocumento tipoDocumento, String nroIdentificacion, String nombreUsuario, String apellidoUsuario, String dirUsuario, long telUsuario, String emailUsuario, Rol rolUsuario, String passUsuario, boolean estadoUsuario) {
        this.idUsuario = idUsuario;
        this.tipoDocumento = tipoDocumento;
        this.nroIdentificacion = nroIdentificacion;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.dirUsuario = dirUsuario;
        this.telUsuario = telUsuario;
        this.emailUsuario = emailUsuario;
        this.rolUsuario = rolUsuario;
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
