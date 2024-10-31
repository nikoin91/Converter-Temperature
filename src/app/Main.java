package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converter-Temperature app.");

        double cls = 5;
        double frt = 77;
        double fahren = convCeliusToFahrenheit(cls);
        double celsius = convFahrenheitToCelius(frt);
        System.out.println("Result is " + fahren + " Fahrenheit.");
        System.out.println("Result is " + celsius + " Celsius");

    }

    private static double convCeliusToFahrenheit(double cls) {
        return cls / ((double) 5/9) + 32;
    }
    private static double convFahrenheitToCelius(double frt){
        return (frt - 32) * ((double) 5/9);
    }
}
