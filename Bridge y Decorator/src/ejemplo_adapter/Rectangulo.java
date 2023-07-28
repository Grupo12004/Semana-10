package ejemplo_adapter;

// Clase Rectangulo con el implmenets Forma

class Rectangulo implements Forma {
    private double longitud;
    private double ancho;

    public Rectangulo(double longitud, double ancho) {

        //Constructos con parametros ingresados y atributos
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public double calcularArea() {
        return longitud * ancho;
    }
}