package Actividades;

public class Chocolatina {
    private String marca;

    public Chocolatina(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Chocolatina{" + "marca='" + marca + '\'' + '}';
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // primera comparacion, ve si los dos objetos son el mismo, ej comparar chocolate1 con chocolate 1
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {//segunda comparacion, si el objeto es null, o es de otra clase
            return false;
        }
        Chocolatina that = (Chocolatina) obj; //convierte el obj a tipo chocolatina para efectuar la comparacion
        return marca.equals(that.marca); //si la marca es igual al objeto que buscamos, es igual el elemento.
    }
}

