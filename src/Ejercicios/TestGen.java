package Ejercicios;

class TestGen {
    // Metodo genérico para verificar si un elemento existe en el array
    public static <T extends Comparable<T>> boolean exist(T[] array, T elemento) {
        for (T item : array) {
            if (item.equals(elemento)) {  // Compara el elemento con los del array
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
    }
}
