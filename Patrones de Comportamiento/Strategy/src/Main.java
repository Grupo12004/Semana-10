public class Main {
    // Uso del patrón Strategy
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AdicionOperation());
        System.out.println("11 + 7 = " + calculator.executeStrategy(11, 7)); // Utiliza la operación de adición

        calculator = new Calculator(new SustraccionOperation());
        System.out.println("10 - 5 = " + calculator.executeStrategy(10, 5)); // Utiliza la operación de sustracción

        calculator = new Calculator(new MultiplicacionOperation());
        System.out.println("8 * 50 = " + calculator.executeStrategy(8, 50)); // Utiliza la operación de multiplicación
    }
}
