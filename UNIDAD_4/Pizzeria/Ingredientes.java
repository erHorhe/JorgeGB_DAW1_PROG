package Pizzeria;

public class Ingredientes {

    private String nombre;
    private int cantidadCalorias;

    Ingredientes() {
        this.nombre = "Queso";
        this.cantidadCalorias = 250;
    }

    Ingredientes(String nombre, int cantidadCalorias) {
        this.nombre = nombre;
        this.cantidadCalorias = cantidadCalorias;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n" + "Cantidad de calorías: " + getCantidadCalorias();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadCalorias() {
        return cantidadCalorias;
    }

    public void setCantidadCalorias(int cantidadCalorias) {
        this.cantidadCalorias = cantidadCalorias;
    }
}
