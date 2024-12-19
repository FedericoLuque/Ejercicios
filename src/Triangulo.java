import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un triángulo ***");
        var consola = new Scanner(System.in);

        System.out.print("Proporciona el número de filas: ");
        int numeroFilas = consola.nextInt();

        for(int fila = 1; fila <= numeroFilas; fila++){
            var espaciosBlanco = " ".repeat(numeroFilas-fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlanco + asteriscos);
        }

    }
}
