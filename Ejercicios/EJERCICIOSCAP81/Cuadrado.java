package EJERCICIOSCAP81;

public class Cuadrado extends Forma1 {
  private double lado;

public Cuadrado(String nombre, double posicionX, double posicionY, String color, double lado) {
    super(nombre, posicionX, posicionY, color);
    this.lado = lado;
}

  public double calcularArea(){
  
  return (lado*lado);

 }

 public double calcularPerimetro(){
 
 return (lado*4);
  }

public double getLado() {
    return lado;
}

public void setLado(double lado) {
    this.lado = lado;
}

  
}
