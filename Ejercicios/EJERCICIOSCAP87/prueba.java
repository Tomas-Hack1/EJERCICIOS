package EJERCICIOSCAP87;

public class prueba {
  public static void main(String[] args) {
    Vivienda vivienda = new Vivienda("Calle Falsa 123", 60);
    Piso piso = new Piso("Calle Verdadera 456", 75, 3, 5);
    Adosado adosado = new Adosado("Calle Real 789", 100, 2);
    chalet chalet = new chalet("Calle de la Montaña", 120, 1, true);

    // Imprimir los precios
    System.out.println("Precio de la Vivienda: " + vivienda.getPrecio());
    System.out.println("Precio del Piso: " + piso.getPrecio());
    System.out.println("Precio del Adosado: " + adosado.getPrecio());
    System.out.println("Precio del Chalet: " + chalet.getPrecio());
}
}

