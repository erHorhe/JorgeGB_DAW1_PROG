package Pizzeria;

public class Pizza {

    private static TamagnoPizza size = TamagnoPizza.FAMILIAR;
    private Integer[] listaIngredientes = new Integer[3];

    public Pizza() {

    }

    void mostrarTamagnosPizza() {
        System.out.println("Tamaños de pizza DISPONIBLES:"
                + "\n" + "-" + TamagnoPizza.MEDIANA
                + "\n" + "-" + TamagnoPizza.FAMILIAR);
    }

    int contarIngredientes() {
        int contadorIngredientes = 0;
        for (int i = 0; i < listaIngredientes.length; i++) {
            if (listaIngredientes[i] != null) {
                contadorIngredientes++;
            }
        }
        return contadorIngredientes;
    }

    boolean agnadirIngrediente(Ingredientes ingredientes) {
        if (contarIngredientes() < 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Tamaño: " + getSize() + "\n" + "Ingredientes: " + getListaIngredientes();
    }

    public static TamagnoPizza getSize() {
        return size;
    }

    public static void setSize(TamagnoPizza size) {
        Pizza.size = size;
    }

    public Integer[] getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(Integer[] listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
}
