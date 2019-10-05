package com.example.appinmobiliariahugo;

public class ContratoItem {
    private String fechaInicio;
    private String fechaCierre;
    private double importe;

    public ContratoItem(String fechaInicio, String fechaCierre, double importe) {
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.importe = importe;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
