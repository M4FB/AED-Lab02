package Ejercicios;

import Actividades.Chocolatina;
import Actividades.Golosina;

public class CajMainCajoneria {
    public static void main(String[] args) {
        CajCajoneria cajoneria = new CajCajoneria();
        //Caja de chocolatinas
        CajCaja<Chocolatina> cajaChocolatinas = new CajCaja<>("Rojo");
        cajaChocolatinas.add(new Chocolatina("Milka"));
        cajaChocolatinas.add(new Chocolatina("Nestlé"));
        //Caja de golosinas
        CajCaja<Golosina> cajaGolosinas = new CajCaja<>("Azul");
        cajaGolosinas.add(new Golosina("Caramelo", 2.2));
        cajaGolosinas.add(new Golosina("Gomita", 4.12));
        //Caja de strings
        CajCaja<String> cajaStrings = new CajCaja<>("Verde");
        cajaStrings.add("Hola");
        cajaStrings.add("Mundo");
        cajaStrings.add("Cajonería Genérica");
        //Caja de integers
        CajCaja<Integer> cajaNumeros = new CajCaja<>("Amarillo");
        cajaNumeros.add(10);
        cajaNumeros.add(20);
        cajaNumeros.add(30);


        cajoneria.add(cajaChocolatinas);
        cajoneria.add(cajaGolosinas);
        cajoneria.add(cajaStrings);
        cajoneria.add(cajaNumeros);

        System.out.println("Contenido de la cajonería:");
        cajoneria.mostrarContenido();
    }
}
