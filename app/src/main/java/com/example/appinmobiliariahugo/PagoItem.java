package com.example.appinmobiliariahugo;

class PagoItem {
    private int pago;
    private String fecha;
    private double importe;

    public PagoItem(int pago, String fecha, double importe) {
        this.pago = pago;
        this.fecha = fecha;
        this.importe = importe;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
