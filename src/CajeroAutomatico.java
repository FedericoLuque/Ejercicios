import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        double saldo = 1000.00;
        boolean salir=false;
        var consola = new Scanner(System.in);

        while(!salir){
            System.out.print("""
                    *** Aplicacion de Cajero Automatico
                    Operaciones que puedes realizar:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opcion:\s""");

            int opcion = -1;

            try {
                opcion = consola.nextInt();
            } catch (Exception e) {
                System.out.printf("Ingrese un número válido para la opción.%n%n");
                consola.nextLine(); // Limpiar el buffer del scanner
                continue; // Volver al inicio del bucle
            }

            switch (opcion){
                case 1 -> System.out.printf("Tu saldo actual es %.2f€%n%n",saldo);
                case 2 -> {
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = consola.nextDouble();
                    if(saldo>=retiro) {
                        saldo -= retiro;
                        System.out.printf("Se han retirado %.2f€. Saldo restante: %.2f€%n%n", retiro, saldo);
                    }
                    else System.out.printf("No hay saldo suficiente para este retiro. Tu saldo actual es de %.2f€%n%n",saldo);
                }
                case 3 -> {
                    System.out.print("Ingrese cantidad a depositar: ");
                    double ingreso = consola.nextDouble();
                    saldo += ingreso;
                    System.out.printf("Se han ingresado %.2f€. Nuevo saldo: %.2f€%n%n",ingreso,saldo);
                }
                case 4 -> {
                    System.out.println("Hasta la próxima.");
                    salir = true;
                }
                default -> System.out.printf("Opcion no válida. Seleccione otra opción%n%n");
            }
        }
    }
}
