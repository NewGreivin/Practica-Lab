/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoSocial;

/**
 *
 * @author Usuario
 */
public class TrabajadorSocial {
     private String cedula;
    private String nombre;
    private String correo;
    private String telefono;
    private String canton;

    public TrabajadorSocial(String cedula, String nombre, String correo, String telefono, String canton) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.canton = canton;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCanton() {
        return canton;
    }

    @Override
    public String toString() {
        return "TrabajadoSoci{" 
                + "cedula=" + cedula 
                + ", nombre=" + nombre 
                + ", correo=" + correo 
                + ", telefono=" + telefono 
                + ", canton=" + canton + '}';
    }
    
    
    
    
    
    
    
    
}


