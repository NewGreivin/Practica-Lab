/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoSocial;

import Listas.Lista;
import java.util.List;

/**
 *
 * @author Ricardo Chaves
 */
public class List_TrabajoSocial implements Lista<TrabajadorSocial>{
    private TrabajadorSocial trabajadorsocial[];
    
    public List_TrabajoSocial(){
        this.trabajadorsocial = new TrabajadorSocial[100];
    }
    @Override
    public boolean Agregar(TrabajadorSocial t) {
        int max = trabajadorsocial.length;
        for (int i = 0; i < max; i++) {
            if(trabajadorsocial[i]==null){
                trabajadorsocial[i]=t;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean Eliminar(TrabajadorSocial t) {
        int max = trabajadorsocial.length;
        for (int i = 0; i < max; i++) {
            if(trabajadorsocial[i]!=null){
                if(trabajadorsocial[i]==t){
                    trabajadorsocial[i]=null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public TrabajadorSocial Buscar(Object id) {
        int max = trabajadorsocial.length;
        String idt = String.valueOf(id);
        for (int i = 0; i < max; i++) {
            if(trabajadorsocial[i].getCedula().equals(idt))
                return trabajadorsocial[i];
        }
        return null;
    }
    
    public TrabajadorSocial[] trabajadores(TrabajadorSocial t){
        TrabajadorSocial[] resultado = new TrabajadorSocial[trabajadorsocial.length];
        
        int index = 0;
        
        int max = trabajadorsocial.length;
        String idt = String.valueOf(t);
        for (int i = 0; i < max; i++) {
            if(trabajadorsocial[i]!=null && trabajadorsocial[i].getCanton().equalsIgnoreCase(idt)){
                resultado[index++] = trabajadorsocial[i];
            }
        }
        return resultado;
    }
}
