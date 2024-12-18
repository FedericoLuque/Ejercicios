import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de autenticacion ***");

        final String usuario = "Federico";
        final int password = 123;


        var consola = new Scanner(System.in);

        // Usuario
        System.out.print("Ingresa tu usuario: ");
        String usuarioScanner = consola.nextLine().strip();

        // Password
        System.out.print("Ingresa tu password: ");
        int passwordScanner = Integer.parseInt(consola.nextLine());

        consola.close();
        // Acceso
        if(!usuario.equals(usuarioScanner) && password != passwordScanner){
            System.out.println("Usuario y contraseña invalidos");
        }
        else if(!usuario.equals(usuarioScanner)){
            System.out.println("Usuario invalido");

        }
        else if(password != passwordScanner){
            System.out.println("Password invalido");
        }
        else {
            System.out.println("Bienvenido al sistema.");
        }
    }
}