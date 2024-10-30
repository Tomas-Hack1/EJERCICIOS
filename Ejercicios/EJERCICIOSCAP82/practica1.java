package EJERCICIOSCAP82;

public class practica1 {
    public static void main(String[] args) {
        AlfombraRedonda alfombraRedonda = new AlfombraRedonda("azul", 200, 4);
        AlfombraCuadrada alfombraCuadrada = new AlfombraCuadrada("Verde", 400, 6);
       
       
        System.out.println("La alfombra redonda");
        System.out.println("La superficie es: "+ alfombraRedonda.calcularSuperficie());
        System.out.println("El precio de la alfombra es: "+ alfombraRedonda.calcularPrecio());
    
        System.out.println("La alfombra cuadrada");
        System.out.println(" La superficie es: "+ alfombraCuadrada.calcularSuperficie());
        System.out.println("El precio de la alfombra es: "+ alfombraCuadrada.calcularPrecio());
    
      }
    }
    

