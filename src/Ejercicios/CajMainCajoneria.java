package Ejercicios;

import Actividades.Chocolatina;
import Actividades.Golosina;

public class CajMainCajoneria {
    public static void main(String[] args) {
        CajCajoneria cajoneria = new CajCajoneria();

        // Caja de chocolatinas
        CajCaja<Chocolatina> cajaChocolatinas = new CajCaja<>("Rojo");
        cajaChocolatinas.add(new Chocolatina("Milka"));
        cajaChocolatinas.add(new Chocolatina("Nestlé"));

        // Caja de golosinas
        CajCaja<Golosina> cajaGolosinas = new CajCaja<>("Azul");
        cajaGolosinas.add(new Golosina("Caramelo", 2.2));
        cajaGolosinas.add(new Golosina("Gomita", 4.12));

        // Caja de strings
        CajCaja<String> cajaStrings = new CajCaja<>("Verde");
        cajaStrings.add("Hola");
        cajaStrings.add("Mundo");
        cajaStrings.add("Cajonería Genérica");

        // Caja de integers
        CajCaja<Integer> cajaNumeros = new CajCaja<>("Amarillo");
        cajaNumeros.add(10);
        cajaNumeros.add(20);
        cajaNumeros.add(30);

        // Agregar cajas a la cajonería
        cajoneria.add(cajaChocolatinas);
        cajoneria.add(cajaGolosinas);
        cajoneria.add(cajaStrings);
        cajoneria.add(cajaNumeros);

        // Mostrar contenido inicial de la cajonería
        System.out.println("Contenido de la cajonería:");
        cajoneria.mostrarContenido();
        System.out.println("--------------------------------------------------");

        // Ejemplo de búsqueda
        System.out.println(cajoneria.search(new Chocolatina("Milka"))); // Debería encontrarla
        System.out.println("--------------------------------------------------");

        // Ejemplo de eliminación
        System.out.println("Eliminando: " + cajoneria.delete(new Chocolatina("Milka"))); // Debería eliminarla
        System.out.println("--------------------------------------------------");

        // Mostrar contenido después de la eliminación
        System.out.println("Contenido de la cajonería después de la eliminación:");
        cajoneria.mostrarContenido();
        System.out.println("--------------------------------------------------");

        // Mostrar el reporte
        System.out.println("Reporte de la cajonería:");
        System.out.println(cajoneria.toString());
        System.out.println("--------------------------------------------------");
    }
}