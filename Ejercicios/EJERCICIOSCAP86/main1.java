package EJERCICIOSCAP86;

import java.util.Scanner;

public class main1 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer entrada

        // Crea un array de 4 empleados
        Empleado[] empleados = new Empleado[4];

        // Lee los datos de cada empleado
        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            String nombre = scanner.nextLine(); // Lee el nombre del empleado

            System.out.print("Ingrese el teléfono del empleado " + (i + 1) + ": ");
            String telefono = scanner.nextLine(); // Lee el teléfono del empleado

            // Crea una nueva instancia de Empleado y la almacena en el array
            empleados[i] = new Empleado(nombre, telefono);
        }

        // Muestra los datos de cada empleado
        System.out.println("\nDatos de los empleados:");
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Teléfono: " + empleado.getTelefono());
        }

        // Muestra el número total de empleados
        System.out.println("Número total de empleados: " + Empleado.getNumeroEmpleados());
        
        scanner.close(); // Cierra el scanner para liberar recursos
    }
}