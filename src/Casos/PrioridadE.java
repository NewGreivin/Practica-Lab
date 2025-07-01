/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Casos;

/**
 *
 * @author Jonathan
 */
public enum PrioridadE {
     ALTA("Alta"),
    MEDIA("Media"),
    BAJA("Baja");
    
    private final String prioridad;

    private PrioridadE(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return prioridad;
    }
       
}