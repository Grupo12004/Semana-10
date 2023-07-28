package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica;
        Objeto objeto;

        // Crear objeto utilizando la fábrica Libro
        fabrica = new FabricaLibro();
        objeto = fabrica.crearObjeto();
        System.out.println("Numero 1 " + objeto.descripcion());

        // Crear objeto utilizando la fábrica Tesis

        fabrica = new FabricaTesis();
        objeto = fabrica.crearObjeto();
        System.out.println("Fabrica Objeto: " + objeto.descripcion());

        // Crear objeto utilizando la fábrica Articulo

        fabrica = new FabricaArticulo();
        objeto = fabrica.crearObjeto();
        System.out.println("Fabrica Objeto: " + objeto.descripcion());
    }
}