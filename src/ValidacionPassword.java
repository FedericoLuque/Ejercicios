import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        System.out.println("*** Creación de usuario y contraseña ***");
        var consola = new Scanner(System.in);

        System.out.print("Introduzca su nombre de usuario: ");
        String usuario = consola.nextLine();
        System.out.print("Introduzca su nueva contraseña de 6 caracteres: ");
        String contrasena = consola.nextLine();

        while(contrasena.length() < 6){
            System.out.println("La contraseña debe tener al menos 6 caracteres. Inténtelo de nuevo.");
            System.out.print("Introduzca su nueva contraseña: ");
            contrasena = consola.nextLine();
            }
        System.out.printf("Usuario %s y contraseña %s creados correctamente.",usuario, contrasena);
    }
}