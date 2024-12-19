import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Adivina el número secreto ***\n");

        var consola = new Scanner(System.in);
        Random random = new Random();
        int numero = random.nextInt(100) + 1;
        int intento =-1;
        int contador = 0;

        System.out.println("¿Puedes adivinar en que numero del 1 al 100 estoy pensando?\n");

        while(numero != intento) {
            if(contador == 0) System.out.print("Prueba suerte: ");
            intento = consola.nextInt();
            ++contador;
            if(intento < numero && contador > 0){
                System.out.print("""
                        \nEl número es mayor.
                        Prueba otra vez:\s""");
            } else if (intento > numero && contador > 0){
                System.out.print("""
                        \nEl número es menor.
                        Prueba otra vez:\s""");
            } else{
                System.out.printf("\nGenial! Lo adivinaste. El número correcto es %d. Has necesitado %d intentos.\n",numero, contador);
            }
        }
    }
}
