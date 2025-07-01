/**
 * @author Greivin
 */
package Victimas;

import Listas.Lista;

public class ListaVictima implements Lista<Victima>{
    private static Victima[] victima = new Victima[100]; 

    @Override
    public boolean Agregar(Victima t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean Eliminar(Victima t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Victima Buscar(Object id) {
    int max = victima.length;
        for (int i = 0; i < max; i++) {
            if (victima[i] == null && victima[i].getCedula().equals(id)){
                return victima[i];
            }
        }
        return null;
    }
   
}
