import java.util.Scanner;

public class TemperatureConverter1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Convertidor de Temperaturas");
        System.out.println("Por favor, seleccione la opción deseada:");
        System.out.println("1. Convertir de Celsius a Fahrenheit");
        System.out.println("2. Convertir de Fahrenheit a Celsius");
        System.out.println("3. Convertir de Celsius a Kelvin");
        System.out.println("4. Convertir de Kelvin a Celsius");
        System.out.println("5. Convertir de Fahrenheit a Kelvin");
        System.out.println("6. Convertir de Kelvin a Fahrenheit");
        System.out.print("Opción: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.print("Ingrese la temperatura en Celsius: ");
                int celsiusToFahrenheit = scanner.nextInt();
                System.out.println("La temperatura en Fahrenheit es: " + (int)celsiusToFahrenheitToFahrenheit(celsiusToFahrenheit));
                break;
            case 2:
                System.out.print("Ingrese la temperatura en Fahrenheit: ");
                int fahrenheitToCelsius = scanner.nextInt();
                System.out.println("La temperatura en Celsius es: " + (int)fahrenheitToCelsiusToCelsius(fahrenheitToCelsius));
                break;
            case 3:
                System.out.print("Ingrese la temperatura en Celsius: ");
                int celsiusToKelvin = scanner.nextInt();
                System.out.println("La temperatura en Kelvin es: " + (int)celsiusToKelvinToKelvin(celsiusToKelvin));
                break;
            case 4:
                System.out.print("Ingrese la temperatura en Kelvin: ");
                int kelvinToCelsius = scanner.nextInt();
                System.out.println("La temperatura en Celsius es: " + (int)kelvinToCelsiusToCelsius(kelvinToCelsius));
                break;
            case 5:
                System.out.print("Ingrese la temperatura en Fahrenheit: ");
                int fahrenheitToKelvin = scanner.nextInt();
                System.out.println("La temperatura en Kelvin es: " + (int)fahrenheitToKelvinToKelvin(fahrenheitToKelvin));
                break;
            case 6:
                System.out.print("Ingrese la temperatura en Kelvin: ");
                int kelvinToFahrenheit = scanner.nextInt();
                System.out.println("La temperatura en Fahrenheit es: " + (int)kelvinToFahrenheitToFahrenheit(kelvinToFahrenheit));
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }

    // Convertir Celsius a Fahrenheit
    public static double celsiusToFahrenheitToFahrenheit(int celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convertir Fahrenheit a Celsius
    public static double fahrenheitToCelsiusToCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convertir Celsius a Kelvin
    public static double celsiusToKelvinToKelvin(int celsius) {
        return celsius + 273.15;
    }

    // Convertir Kelvin a Celsius
    public static double kelvinToCelsiusToCelsius(int kelvin) {
        return kelvin - 273.15;
    }

    // Convertir Fahrenheit a Kelvin
    public static double fahrenheitToKelvinToKelvin(int fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    // Convertir Kelvin a Fahrenheit
    public static double kelvinToFahrenheitToFahrenheit(int kelvin) {
        return kelvin * 9 / 5 - 459.67;
    }
}
