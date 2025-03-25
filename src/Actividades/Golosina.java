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

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Golosina golosina = (Golosina) obj;

        return Double.compare(golosina.peso, peso) == 0 && nombre.equals(golosina.nombre);

    }


    @Override

    public int hashCode() {

        return 31 * nombre.hashCode() + Double.hashCode(peso);

    }
}
