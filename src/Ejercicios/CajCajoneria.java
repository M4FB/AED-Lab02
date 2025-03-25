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

    @Override
    public Iterator<CajCaja<?>> iterator() {
        return lista.iterator();
    }
}
