package java.functional;

import java.util.function.Function;
public class Principal {
    public static void main(String[] args) {
        Function<Double, Double> celsiusToFahrenheit = c -> c * 9 / 5 + 32;
        double fahrenheit = celsiusToFahrenheit.apply(25.0);
        System.out.println(fahrenheit);
    }
}