package org.example.MODELOS;

public class Propietario {
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String direccionResidencia;
    private String documentoIdentidad;
    private Integer numeroPropiedades;

    public Propietario() {
    }

    public Propietario(Long id,String nombre, String apellido, String telefono, String email, String direccionResidencia, String documentoIdentidad, Integer numeroPropiedades) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.direccionResidencia = direccionResidencia;
        this.documentoIdentidad = documentoIdentidad;
        this.numeroPropiedades = numeroPropiedades;
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

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public Integer getNumeroPropiedades() {
        return numeroPropiedades;
    }

    public void setNumeroPropiedades(Integer numeroPropiedades) {
        this.numeroPropiedades = numeroPropiedades;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", direccionResidencia='" + direccionResidencia + '\'' +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                ", numeroPropiedades=" + numeroPropiedades +
                '}';
    }
}
