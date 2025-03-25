package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class CajCaja<T> {
    private String color;
    private List<T> contenido;

    public CajCaja(String color) {
        this.color = color;
        this.contenido = new ArrayList<>();
    }

    public void add(T objeto) {
        contenido.add(objeto);
    }

    public String getColor() {
        return color;
    }

    public List<T> getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Caja de color " + color + " con contenido: " + contenido;
    }
}
