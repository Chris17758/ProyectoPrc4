/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author manue
 */
 
   

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir nombre de usuario
        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = input.nextLine();

        // Mostrar mensaje de bienvenida
        System.out.println("Bienvenido, " + nombreUsuario + ".");
        System.out.println("¿Qué desea hacer?");

        // Mostrar opciones de menú
        System.out.println("1. Ventana nueva");
        System.out.println("2. Consultar inventarios");
        System.out.println("3. Cambiar contraseña");
        System.out.println("4. Salir del sistema");

        // Pedir opción al usuario
        System.out.print("Ingrese el número de la opción que desea: ");
        int opcion = input.nextInt();

        // Variables para la opción 3 (cambiar contraseña)
        String contrasenaActual = "contrasena"; // Cambiar por la contraseña actual del usuario
        String nuevaContrasena;

        // Ejecutar opción seleccionada
        switch (opcion) {
            case 1:
                System.out.println("Opción 1 seleccionada: Ventana nueva");
                break;
            case 2:
                System.out.println("Opción 2 seleccionada: Consultar inventarios");
                break;
            case 3:
                // Pedir contraseña actual y nueva contraseña
                System.out.print("Ingrese su contraseña actual: ");
                String contrasenaIngresada = input.next();

                if (contrasenaIngresada.equals(contrasenaActual)) {
                    System.out.print("Ingrese su nueva contraseña: ");
                    nuevaContrasena = input.next();
                    System.out.println("Contraseña cambiada con éxito.");
                    // Actualizar contraseña en la variable contrasenaActual
                    contrasenaActual = nuevaContrasena;
                } else {
                    System.out.println("Contraseña incorrecta. No se pudo cambiar la contraseña.");
                }
                break;
            case 4:
                System.out.println("Hasta luego, " + nombreUsuario + ". Cerrando programa.");
                System.exit(0); // Salir del programa
                break;
            default:
                System.out.println("Opción inválida. Saliendo del programa...");
                System.exit(0); // Salir del programa
                break;
        }
    }
} 
