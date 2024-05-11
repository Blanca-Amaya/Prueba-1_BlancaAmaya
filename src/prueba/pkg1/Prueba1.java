/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba.pkg1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu(); //llamar el menu 
    }

    public static void menu() {
        int cont = 0; // el contador de cuanta veces se repitio el menu principal
        boolean salir = false;
        while (!salir) { // va salir del while cuando el usuario ingrese al case 3 y al mismo tiempo va mandar la veces que se ingreso al menu principal
            System.out.println("Bienvenido a mi primera prueba práctica en Java, las opciones son las siguientes: ");
            System.out.println("1. Repetir mi nombre");
            System.out.println("2. SubMenu de mensajes");
            System.out.println("3. Salir");
            Scanner leer = new Scanner(System.in);
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    caso1();
                    cont++;
                    break;
                case 2:
                    submenu();
                    break;
                case 3:
                    System.out.println("Adiós, esta fue mi prueba");
                    System.out.println("Se repitió " + cont + " veces.");
                    salir = true;
                    break;
                default:
                    System.out.println("No es una opción válida del menú.");
                    break;
            }
        }
    }

    public static void caso1() { // caso1 donde se va repetir el mensaje con el nombre las veces que el usuario desee 
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Entrada de datos: ");
        String entrada = leer2.nextLine();
        System.out.println("Cantidad de veces: ");
        int cantidad = leer2.nextInt();
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("¡Hola mi nombre es " + entrada + " y miren mi prueba!");
        }
    }

    public static void submenu() {
        boolean salirSubmenu = false;
        while (!salirSubmenu) { // va salir del while cuando el usuario ingrese al case 3 porque el menu no va ser false sino true 
            System.out.println("1. Bienvenida");
            System.out.println("2. Despedida");
            System.out.println("3. Salir del sub menú");
            Scanner leer4 = new Scanner(System.in);
            int opcionsub = leer4.nextInt();
            switch (opcionsub) {
                case 1:
                    System.out.println("Hola :DD ");
                    submenu();
                case 2:
                    System.out.println("Hasta luego, gracias por usar mi programa");
                    submenu();
                case 3:
                    salirSubmenu = true;
                    break;
                default:
                    System.out.println("No es una opción válida del submenú.");
                    break;
            }
        }
    }
}
