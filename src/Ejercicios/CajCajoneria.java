package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CajCajoneria implements Iterable<CajCaja<?>> {
    private List<CajCaja<?>> lista = new ArrayList<>();

    public void add(CajCaja<?> caja) {
        lista.add(caja);
    }

    public void mostrarContenido() {
        if (lista.isEmpty()) {
            System.out.println("La cajonería está vacía.");
        } else {
            for (CajCaja<?> caja : lista) {
                System.out.println(caja);
            }
        }
    }

    public String search(Object elemento) {
        for (int i = 0; i < lista.size(); i++) {
            CajCaja<?> caja = lista.get(i);
            if (caja.getContenido().contains(elemento)) {
                return "Posición: " + i + ", Color de Caja: " + caja.getColor();
            }
        }
        return "Elemento no encontrado.";
    }

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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lista.size(); i++) {
            CajCaja<?> caja = lista.get(i);
            for (Object objeto : caja.getContenido()) {
                sb.append("Posición: ").append(i)
                        .append(", Color Caja: ").append(caja.getColor())
                        .append(", Objeto: ").append(objeto)
                        .append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public Iterator<CajCaja<?>> iterator() {
        return lista.iterator();
    }
}