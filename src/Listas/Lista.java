/**
 * @author Greivin
 */
package Listas;

public interface Lista<T> {
    public boolean Agregar(T t);
    public boolean Eliminar(T t);
    T Buscar(Object id);
}
