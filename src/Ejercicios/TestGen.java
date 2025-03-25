package Ejercicios;

import Actividades.Chocolatina;
import Actividades.Golosina;

class TestGen {
    // Metodo genérico para verificar si un elemento existe en el array
    public static <T extends Comparable<T>> boolean exist(T[] array, T elementoABuscar) {
        // Recorre cada item en el array, si es igual al elemento a buscar, entonces retorna true
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
        // System.out.println(exist(w, "Salas")); // ERROR: Tipos incompatibles

        // Creación de elementos chocolatina y golosina
        Chocolatina c = new Chocolatina("Milka");
        Chocolatina c1 = new Chocolatina("Nestle");
        Chocolatina c2 = new Chocolatina("Ferrero");
        Golosina g1 = new Golosina("Gomitas", 200);
        Golosina g2 = new Golosina("Caramelo", 12.49);
        Golosina g3 = new Golosina("Chicle", 12.34);
        Golosina g4 = new Golosina("GomitasAcidas", 180);
        Golosina g5 = new Golosina("Galletas", 27.98);

        // Crear la cajonería y agregar golosinas
        CajCajoneria cajoneria = new CajCajoneria();
        CajCaja<Golosina> cajaGolosinas = new CajCaja<>("Azul");
        cajaGolosinas.add(g1);
        cajaGolosinas.add(g2);
        cajaGolosinas.add(g3);
        cajaGolosinas.add(g4);
        cajaGolosinas.add(g5);
        cajoneria.add(cajaGolosinas);

        // Mostrar contenido de la cajonería
        System.out.println("Contenido de la cajonería:");
        cajoneria.mostrarContenido();
        System.out.println("--------------------------------------------------");

        // Verificar la existencia de algunas golosinas
        System.out.println("Buscando 'Gomitas' con peso 200: " +
                cajoneria.search(new Golosina("Gomitas", 200))); // Debería encontrarla
        System.out.println("Buscando 'Caramelo' con peso 12.49: " +
                cajoneria.search(new Golosina("Caramelo", 12.49))); // Debería encontrarla
        System.out.println("Buscando 'Chicle' con peso 10.0: " +
                cajoneria.search(new Golosina("Chicle", 10.0))); // No debería encontrarla
        System.out.println("--------------------------------------------------");

        // Probar la funcionalidad del método delete
        System.out.println("Eliminando 'Gomitas' con peso 200: " +
                cajoneria.delete(new Golosina("Gomitas", 200))); // Debería eliminarla
        System.out.println("Contenido de la cajonería después de la eliminación:");
        cajoneria.mostrarContenido();
        System.out.println("--------------------------------------------------");

        // --------------------------------------------------------------
        // --------------------------------------------------------------
        // --------------------------------------------------------------
        // --------------------------------------------------------------
        // --------------------------------------------------------------

        // Ahora, vamos a trabajar con chocolatinas
        System.out.println("Contenido de la cajonería con chocolatinas:");
        CajCajoneria cajoneriaChocolatinas = new CajCajoneria();
        CajCaja<Chocolatina> cajaChocolatinas = new CajCaja<>("Rojo");
        cajaChocolatinas.add(c);
        cajaChocolatinas.add(c1);
        cajaChocolatinas.add(c2);
        cajoneriaChocolatinas.add(cajaChocolatinas);

        // Mostrar contenido de la cajonería de chocolatinas
        cajoneriaChocolatinas.mostrarContenido();
        System.out.println("--------------------------------------------------");

        // Verificar la existencia de chocolatinas
        System.out.println("Buscando 'Milka': " +
                cajoneriaChocolatinas.search(new Chocolatina("Milka"))); // Debería encontrarla
        System.out.println("Buscando 'Ferrero': " +
                cajoneriaChocolatinas.search(new Chocolatina("Ferrero"))); // Debería encontrarla
        System.out.println("Buscando 'Nestlé': " +
                cajoneriaChocolatinas.search(new Chocolatina("Nestlé"))); // No debería encontrarla
        System.out.println("--------------------------------------------------");

        // Probar la funcionalidad del metodo delete para chocolatinas
        System.out.println("Eliminando 'Milka': " +
                cajoneriaChocolatinas.delete(new Chocolatina("Milka"))); // Debería eliminarla
    }
}