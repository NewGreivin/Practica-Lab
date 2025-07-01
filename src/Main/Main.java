/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Casos.Caso;
import Casos.PrioridadE;
import Victimas.Victima;
import java.time.LocalDate;

/**
 *
 * @author Ricardo Chaves
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una víctima de ejemplo
        Victima victima1 = new Victima(
            "123456789",                     // cédula
            "Ana María López",               // nombre
            LocalDate.of(1990, 5, 15),      // fecha de nacimiento
            "Femenino",                     // género
            "ana.lopez@email.com",          // correo
            "8888-1234",                    // teléfono
            "San José, Costa Rica"          // dirección
        );

        // Crear un caso con los datos necesarios
        Caso caso = new Caso(
            "C001",                       // id
            victima1,                     // víctima creada arriba
            "Robo en la casa",           // descripción
            "Robo",                      // tipo
            LocalDate.of(2025, 7, 1),   // fecha (1 de julio 2025)
            PrioridadE.ALTA              // prioridad
        );

        // Mostrar el caso con toString
        System.out.println(caso);
        System.out.println(victima1);
        
        // También puedes mostrar atributos individuales
        System.out.println("ID: " + caso.getId());
        System.out.println("Victima: " + caso.getVictima());
        System.out.println("Descripcion: " + caso.getDescripcion());
        System.out.println("Prioridad: " + caso.getPrioridad());
    }
}
