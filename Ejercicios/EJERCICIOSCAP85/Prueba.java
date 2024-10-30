package EJERCICIOSCAP85;

import java.util.Scanner;

public class Prueba {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    Math2 math = new Math2();
        System.out.println("Numeros enteros");
        System.out.print("Ingrese la cantidad de números enteros: ");
        int n = scanner.nextInt();
        int[] intArray = new int[n];

        System.out.println("Ingrese los números enteros:");
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.println("El mínimo de los numeros enteros es: " + math.min(intArray));
        System.out.println("El máximo de los numeros enteros es: " + math.max(intArray));

        System.out.println("\nPrueba con dobles:");
        System.out.print("Ingrese la cantidad de números decimales: ");
        int m = scanner.nextInt();
        double[] doubleArray = new double[m];

        System.out.println("Ingrese los números decimales:");
        for (int i = 0; i < m; i++) {
            doubleArray[i] = scanner.nextDouble();
        }

        System.out.println("El mínimo es: " + math.min(doubleArray));
        System.out.println("El máximo es: " + math.max(doubleArray));
    }
}
 
