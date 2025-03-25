package Ejercicios;

import Actividades.Chocolatina;
import Actividades.Golosina;
import java.util.ArrayList;
import java.util.Iterator;


//Nueva implementacion de la clase bolsa, la mayor diferencia es la inclusion del metodo para mostrar el contenido
public class BolsaConMetodo<T> implements Iterable<T> {
    private ArrayList<T> lista = new ArrayList<>();
    private int tope;

    public BolsaConMetodo(int tope) {
        this.tope = tope;
    }

    public void add(T objeto) {
        if (lista.size() < tope) {
            lista.add(objeto);
        } else {
            throw new RuntimeException("No Caben Más");
        }
    }

    // Metodo generico para mostrar el contenido de la bolsa
    public void mostrarContenido() {
        if (lista.isEmpty()) {
            System.out.println("La bolsa está vacía.");
        } else {
            for (T item : lista) {
                System.out.println(item);
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }

    public static void main(String[] args) {
        // Bolsa de Chocolatinas
        BolsaConMetodo<Chocolatina> bolsaChocolatinas = new BolsaConMetodo<>(3);
        bolsaChocolatinas.add(new Chocolatina("Milka"));
        bolsaChocolatinas.add(new Chocolatina("Ferrero Rocher"));
        bolsaChocolatinas.add(new Chocolatina("Nestlé"));

        System.out.println("Contenido de la bolsa de Chocolatinas:");
        bolsaChocolatinas.mostrarContenido();

        // Bolsa de Golosinas
        BolsaConMetodo<Golosina> bolsaGolosinas = new BolsaConMetodo<>(2);
        bolsaGolosinas.add(new Golosina("Gomitas", 200));
        bolsaGolosinas.add(new Golosina("Caramelos", 150));

        System.out.println("\nContenido de la bolsa de Golosinas:");
        bolsaGolosinas.mostrarContenido();
    }
}
