package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Se utilizo una wildcard <?> para permitir que la cajoneria trabaje con diferentes tipos de caja, segun los elementos
//que esta guarde, evita las restricciones ya que sino, todas las cajas deberian almacenar el mismo tipo de datos
public class CajCajoneria implements Iterable<CajCaja<?>> {
    private List<CajCaja<?>> lista = new ArrayList<>();

    public void add(CajCaja<?> caja) {
        lista.add(caja);
    }
    // muestra el contenido de la cajoneria, si no hay elementos, muestra un mensaje, sino gracias a iterable reocrre
    //La lista de cajas almacenadas en cajoneria, de la misma forma se utiliza un wildcard, para justamente que las cajas
    //tengan diferentes tipos de contenido
    public void mostrarContenido() {
        if (lista.isEmpty()) {
            System.out.println("La cajonería está vacía.");
        } else {
            for (CajCaja<?> caja : lista) {
                System.out.println(caja);
            }
        }
    }
    //Se busca un elemento, las cajas almacenadas en cajoneria, y retorna la posicion y el color de la caja
    public String search(Object elemento) {
        for (int i = 0; i < lista.size(); i++) {
            CajCaja<?> caja = lista.get(i);
            //al mostrar el contenido, con el get contenido, se busca si esta contiene el elemento que estamos buscando.
            if (caja.getContenido().contains(elemento)) {
                return "Posición: " + i + ", Color de Caja: " + caja.getColor();
            }
        }
        return "Elemento no encontrado.";
    }
    //Casi el mismo funcionamiento que la busqueda, la unica diferencia es que al listar el contenido de una caja, se elimina
    //el respectivo elemento
    public Object delete(Object elemento) {
        for (CajCaja<?> caja : lista) {
            if (caja.getContenido().remove(elemento)) {
                return elemento; // Retorna el objeto eliminado
            }
        }
        return null; // Retorna null si no se encontró el elemento
    }

    @Override
    public String toString() {
        String resultado = ""; // Inicializa una cadena vacía
        for (int i = 0; i < lista.size(); i++) {
            CajCaja<?> caja = lista.get(i);
            for (Object objeto : caja.getContenido()) {
                // Concatenar la información de cada caja y su contenido
                resultado += "Posición: " + i
                        + ", Color Caja: " + caja.getColor()
                        + ", Objeto: " + objeto
                        + "\n"; // Agrega un salto de línea
            }
        }
        return resultado; // Retorna la cadena construida
    }

    @Override
    public Iterator<CajCaja<?>> iterator() {
        return lista.iterator();
    }
}