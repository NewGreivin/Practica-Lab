/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casos;

import Listas.Lista;
import Casos.Caso;

/**
 *
 * @author Ricardo Chaves
 */
public class List_Caso implements Lista<Caso> {
    private Caso caso[];
    
    public List_Caso(){
        this.caso = new Caso[100];
    }
    @Override
    public boolean Agregar(Caso t) {
        int max = caso.length;
        for (int i = 0; i < max; i++) {
            if(caso[i]==null){
                caso[i]=t;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean Eliminar(Caso t) {
        int max = caso.length;
        for (int i = 0; i < max; i++) {
            if(caso[i]!=null){
                if(caso[i]==t){
                    caso[i]=null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Caso Buscar(Object id) {
        int max = caso.length;
        String idt = String.valueOf(id);
        for (int i = 0; i < max; i++) {
            if(caso[i]!=null){
                if(caso[i].getId().equals(idt)){
                    return caso[i];
                }
            }
        }
        return null;
    }
    
    public int cantidadPorPrioridad(PrioridadE prioridad) {
        int max = caso.length;
        int cantidad = 0;
        for(int i = 0; i < max ; i++) {
            if (caso[i] != null && caso[i].getPrioridad() == prioridad) {
                cantidad++;
            }
        }
        return cantidad;
    }

}
