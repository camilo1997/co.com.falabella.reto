package co.com.falabella.models;

public class DatosTarjeta {
    private String nombreTitular;
    private String numeroTarjeta;
    private String cvv;
    private String fechaVencer;

    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getCvv() {
        return cvv;
    }

    public String getFechaVencer() {
        return fechaVencer;
    }
}
