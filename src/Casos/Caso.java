/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casos;

import Victimas.Victima;
import java.time.LocalDate;

/**
 *
 * @author Jonathan
 */
public class Caso {
     private int id;
    private Victima victima;
    private String descripcion;
    private String tipo;
    private LocalDate fecha;
    private PrioridadE prioridad;

    public int getId() {
        return id;
    }

    public Victima getVictima() {
        return victima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public PrioridadE getPrioridad() {
        return prioridad;
    }
    
    

    public Caso(int id, Victima victima, String descripcion, String tipo, LocalDate fecha, PrioridadE prioridad) {
        this.id = id;
        this.victima = victima;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fecha = fecha;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Caso{" + "id=" + id + ", victima=" + victima + ", descripcion=" + descripcion + ", tipo=" + tipo + ", fecha=" + fecha + ", prioridad=" + prioridad + '}';
    }
    
}
