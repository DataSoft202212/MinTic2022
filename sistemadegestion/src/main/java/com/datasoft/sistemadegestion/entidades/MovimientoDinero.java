package com.datasoft.sistemadegestion.entidades;


public class MovimientoDinero {
    private int numMovimientoDinero;
    private String fechaMovimientoDinero;
    private String conceptoMovimientoDinero;
    private double valorMovimientoDinero;
    private Empleado empleadoMovimiento;

    public MovimientoDinero(int numMovimientoDinero, String fechaMovimientoDinero, String conceptoMovimientoDinero, double valorMovimientoDinero, Empleado empleadoMovimiento) {
        this.numMovimientoDinero = numMovimientoDinero;
        this.fechaMovimientoDinero = fechaMovimientoDinero;
        this.conceptoMovimientoDinero = conceptoMovimientoDinero;
        this.valorMovimientoDinero = valorMovimientoDinero;
        this.empleadoMovimiento = empleadoMovimiento;
    }

    public int getNumMovimientoDinero() {
        return numMovimientoDinero;
    }

    public void setNumMovimientoDinero(int numMovimientoDinero) {
        this.numMovimientoDinero = numMovimientoDinero;
    }

    public String getFechaMovimientoDinero() {
        return fechaMovimientoDinero;
    }

    public void setFechaMovimientoDinero(String fechaMovimientoDinero) {
        this.fechaMovimientoDinero = fechaMovimientoDinero;
    }

    public String getConceptoMovimientoDinero() {
        return conceptoMovimientoDinero;
    }

    public void setConceptoMovimientoDinero(String conceptoMovimientoDinero) {
        this.conceptoMovimientoDinero = conceptoMovimientoDinero;
    }

    public double getValorMovimientoDinero() {
        return valorMovimientoDinero;
    }

    public void setValorMovimientoDinero(double valorMovimientoDinero) {
        this.valorMovimientoDinero = valorMovimientoDinero;
    }

    public Empleado getEmpleadoMovimiento() {
        return empleadoMovimiento;
    }

    public void setEmpleadoMovimiento(Empleado empleadoMovimiento) {
        this.empleadoMovimiento = empleadoMovimiento;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "numMovimientoDinero=" + numMovimientoDinero +
                ", fechaMovimientoDinero='" + fechaMovimientoDinero + '\'' +
                ", conceptoMovimientoDinero='" + conceptoMovimientoDinero + '\'' +
                ", valorMovimientoDinero=" + valorMovimientoDinero +
                ", empleadoMovimiento=" + empleadoMovimiento +
                '}';
    }
}
