package org.example.MODELOS;

public class Arrendatario {

    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String documentoIdentidad;
    private String direccionTrabajo;
    private double ingresoMensual;

    public Arrendatario() {
    }

    public Arrendatario(Long id,String nombre, String apellido, String telefono, String email, String documentoIdentidad, String direccionTrabajo, double ingresoMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.documentoIdentidad = documentoIdentidad;
        this.direccionTrabajo = direccionTrabajo;
        this.ingresoMensual = ingresoMensual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getDireccionTrabajo() {
        return direccionTrabajo;
    }

    public void setDireccionTrabajo(String direccionTrabajo) {
        this.direccionTrabajo = direccionTrabajo;
    }

    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    @Override
    public String toString() {
        return "Arrendatario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                ", direccionTrabajo='" + direccionTrabajo + '\'' +
                ", ingresoMensual=" + ingresoMensual +
                '}';
    }
}
