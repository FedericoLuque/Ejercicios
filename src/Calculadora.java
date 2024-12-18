import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double resultado;
        double valor1 = 0;
        double valor2 = 0;
        boolean salir = false;
        var consola = new Scanner(System.in);

        while (!salir) {
            System.out.print("""
                    *** Calculadora en Java ***
                    Operaciones que puedes realizas:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Escoge una opción:\s""");

            int opcion;

            try {
                opcion = consola.nextInt();
            } catch (Exception e) {
                System.out.printf("Ingrese un número válido para la opción.%n%n");
                consola.nextLine(); // Limpiar el buffer del scanner
                continue; // Volver al inicio del bucle
            }

            if(opcion >= 1 && opcion <=4){
                System.out.print("Dame el primer numero: ");
                try {
                    valor1 = consola.nextDouble();
                } catch (Exception e) {
                    System.out.printf("Ingrese un número válido para la opción.%n%n");
                    consola.nextLine(); // Limpiar el buffer del scanner
                    continue; // Volver al inicio del bucle
                }
                System.out.print("Dame el segundo numero: ");
                try {
                    valor2 = consola.nextDouble();
                } catch (Exception e) {
                    System.out.printf("Ingrese un número válido para la opción.%n%n");
                    consola.nextLine(); // Limpiar el buffer del scanner
                    continue; // Volver al inicio del bucle
                }
            }

            switch (opcion) {
                case 1 -> {
                    resultado = valor1 + valor2;
                    System.out.printf("El resultado de tu suma es %.2f%n%n", resultado);
                }
                case 2 -> {
                    resultado = valor1 - valor2;
                    System.out.printf("El resultado de tu resta es %.2f%n%n",resultado);
                }
                case 3 -> {
                    resultado = valor1 * valor2;
                    System.out.printf("El resultado de tu multiplicación es %.2f%n%n",resultado);
                }
                case 4 -> {
                    if(valor2 != 0) {
                        resultado = valor1 / valor2;
                        System.out.printf("El resultado de tu división es %.2f%n%n", resultado);
                    }
                    else System.out.printf("No se puede dividir por cero. Inténtalo de nuevo.%n%n");
                }
                case 5 -> {
                    System.out.println("Hasta la próxima!");
                    salir = true;
                }
                default -> System.out.printf("No se reconoce esta opción. Inténtalo de nuevo.%n%n");
            }
        }
    }
}