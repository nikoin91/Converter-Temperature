package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converter-Temperature app.");

        double cel = 5;
        double fahren = convCeliusToFahrenheit(cel);
        System.out.println("Result is " + fahren + " Fahrenheit.");

    }

    private static double convCeliusToFahrenheit(double cel) {
        return cel / ((double) 5 /9) + 32;
    }
}
