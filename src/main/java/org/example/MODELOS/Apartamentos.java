package org.example.MODELOS;

public class Apartamentos {
    private Long id;
    private String direccion;
    private Integer numeroHabitaciones;
    private Integer numeroBanos;
    private double tamanoMetrosCuadrados;
    private boolean tieneBalcon;
    private boolean permiteMascotas;
    private double precioAlquilerMensual;

    public Apartamentos() {
    }

    public Apartamentos(Long id,String direccion, Integer numeroHabitaciones, Integer numeroBanos, double tamanoMetrosCuadrados, boolean tieneBalcon, boolean permiteMascotas, double precioAlquilerMensual) {
        this.direccion = direccion;
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
        this.tamanoMetrosCuadrados = tamanoMetrosCuadrados;
        this.tieneBalcon = tieneBalcon;
        this.permiteMascotas = permiteMascotas;
        this.precioAlquilerMensual = precioAlquilerMensual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Integer getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(Integer numeroBanos) {
        this.numeroBanos = numeroBanos;
    }

    public double getTamanoMetrosCuadrados() {
        return tamanoMetrosCuadrados;
    }

    public void setTamanoMetrosCuadrados(double tamanoMetrosCuadrados) {
        this.tamanoMetrosCuadrados = tamanoMetrosCuadrados;
    }

    public boolean isTieneBalcon() {
        return tieneBalcon;
    }

    public void setTieneBalcon(boolean tieneBalcon) {
        this.tieneBalcon = tieneBalcon;
    }

    public boolean isPermiteMascotas() {
        return permiteMascotas;
    }

    public void setPermiteMascotas(boolean permiteMascotas) {
        this.permiteMascotas = permiteMascotas;
    }

    public double getPrecioAlquilerMensual() {
        return precioAlquilerMensual;
    }

    public void setPrecioAlquilerMensual(double precioAlquilerMensual) {
        this.precioAlquilerMensual = precioAlquilerMensual;
    }

    @Override
    public String toString() {
        return "Apartamentos{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", numeroHabitaciones=" + numeroHabitaciones +
                ", numeroBanos=" + numeroBanos +
                ", tamanoMetrosCuadrados=" + tamanoMetrosCuadrados +
                ", tieneBalcon=" + tieneBalcon +
                ", permiteMascotas=" + permiteMascotas +
                ", precioAlquilerMensual=" + precioAlquilerMensual +
                '}';
    }
}

