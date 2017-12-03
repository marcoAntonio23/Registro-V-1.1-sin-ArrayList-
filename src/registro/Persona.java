
package registro;

public class Persona {
    String nombres,apellidos,telefono,fecNaci,cedula,correo,contraseña;

    public Persona(String nombres, String apellidos, String telefono, String fecNaci, String cedula, String correo, String contraseña) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fecNaci = fecNaci;
        this.cedula = cedula;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecNaci() {
        return fecNaci;
    }

    public void setFecNaci(String fecNaci) {
        this.fecNaci = fecNaci;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
