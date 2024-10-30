package EJERCICIOSCAP83;

public class prueba {
  public static void main(String[] args) {
    try {
        Empleado empleado1 = new Empleado("Jose Mendez", 122244, 23, false, 300000);
        System.out.println(empleado1.toString());
        System.out.println("Clasificación: " + empleado1.clasifica());

        empleado1.subirSalario(10);
        System.out.println("Salario tras aumento: " + empleado1.getSalario());

    
        Programador programador1 = new Programador("Fabio", 129931, 28, true, 28900, 40, "java");
        System.out.println("\n" + programador1.toString());
        System.out.println("Clasificación: " + programador1.clasifica());
        System.out.println("Salario calculado: " + programador1.calculaSalario());

    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}


