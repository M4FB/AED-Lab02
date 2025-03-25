package Ejercicios;
import Actividades.Chocolatina;
import Actividades.Golosina;

class TestGen {
    // Metodo generico para verificar si un elemento existe en el array
    public static <T extends Comparable<T>> boolean exist(T[] array, T elementoABuscar) {
        //recorre cada item en el array, si es igual al elemento a buscar, entonces retorna true
        for (T item : array) {
            if (item.equals(elementoABuscar)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};
        System.out.println(exist(v, "Sanchez")); // true
        System.out.println(exist(w, 34));        // true
        //System.out.println(exist(w, "Salas")); // ERROR: Tipos incompatibles

        //Creación de elementos chocolatina y golosina
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");
        Golosina g1 = new Golosina("Gomitas", 200);
        Golosina g2 = new Golosina("Caramelo", 12.49);
        Golosina g3 = new Golosina("Chicle", 12.34);

        Chocolatina[] arrayChocolatinas = {c,c1,c2};
        Golosina[] arrayGolosinas = {g1,g2,g3};
        // Da un error, debido a que chocolatinas no tiene un metodo Comparable, las dos soluciones serian:
        //1) Remover el extends Comparable<T>
        //2) @override en chocolatina o en golosina, y en cada clase que se desee implementar que no cuente con comparable
        //System.out.println(exist(arrayChocolatinas,c1));
    }
}
