package Actividades;

public class Golosina {
    private String nombre;
    private double peso;

    public Golosina(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Golosina{" + "nombre='" + nombre + '\'' + ", peso=" + peso + '}';
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj){ // primera comparacion, ve si los dos objetos son el mismo, ej comparar chocolate1 con chocolate 1
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){ //segunda comparacion, si el objeto es null, o es de otra clase
            return false;
        }
        Golosina golosina = (Golosina) obj; //convierte el obj a tipo golosina para efectuar la comparacion
        //si el peso de la golosina y su nombre es igual, entonces son iguales
        return Double.compare(golosina.peso, peso) == 0 && nombre.equals(golosina.nombre);

    }
}
