package com.datasoft.sistemadegestion.entidades;


import java.time.LocalDate;

public class MovimientoDinero {
    private int numMovimientoDinero;
    private LocalDate fechaMovimientoDinero;
    private String conceptoMovimientoDinero;
    private double valorMovimientoDinero;
    private Empleado empleadoMovimiento;

    private Ingresos movimientoIngreso;

    private Egresos movimientoEgreso;


    public MovimientoDinero(int numMovimientoDinero, LocalDate fechaMovimientoDinero, String conceptoMovimientoDinero, double valorMovimientoDinero, Empleado empleadoMovimiento, Ingresos movimientoIngreso, Egresos movimientoEgreso) {
        this.numMovimientoDinero = numMovimientoDinero;
        this.fechaMovimientoDinero = fechaMovimientoDinero;
        this.conceptoMovimientoDinero = conceptoMovimientoDinero;
        this.valorMovimientoDinero = valorMovimientoDinero;
        this.empleadoMovimiento = empleadoMovimiento;
        this.movimientoIngreso = movimientoIngreso;
        this.movimientoEgreso = movimientoEgreso;
    }

    public int getNumMovimientoDinero() {
        return numMovimientoDinero;
    }

    public void setNumMovimientoDinero(int numMovimientoDinero) {
        this.numMovimientoDinero = numMovimientoDinero;
    }

    public LocalDate getFechaMovimientoDinero() {
        return fechaMovimientoDinero;
    }

    public void setFechaMovimientoDinero(LocalDate fechaMovimientoDinero) {
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
                ", fechaMovimientoDinero=" + fechaMovimientoDinero +
                ", conceptoMovimientoDinero='" + conceptoMovimientoDinero + '\'' +
                ", valorMovimientoDinero=" + valorMovimientoDinero +
                ", empleadoMovimiento=" + empleadoMovimiento +
                ", movimientoIngreso=" + movimientoIngreso +
                ", movimientoEgreso=" + movimientoEgreso +
                '}';
    }
}
