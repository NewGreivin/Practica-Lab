/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Victimas;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Usuario
 */
public class Victima {
    private String cedula;
    private String nombre;
    private String fechaNacimiento;
    private String genero;
    private String correo;
    private String telefono;
    private String direccion;

    public Victima(String cedula, String nombre, String fechaNacimiento, String genero, String correo, String telefono, String direccion) {
        this.cedula = generarHash(cedula);
        this.nombre = generarHash(nombre);
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public String generarHash(String dato){
        return "El hash es: "+ dato.hashCode();
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public int verificarEdad(LocalDate fechaNacimiento){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Victima{" + "cedula=" + cedula + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + '}';
    }
    
    
    
    
  
    
}
