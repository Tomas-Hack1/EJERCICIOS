package EJERCICIOSCAP81;

public class Trianulo extends Forma1{
  private double base;
  private double altura;
public Trianulo(String nombre, double posicionX, double posicionY, String color, double base, double altura) {
    super(nombre, posicionX, posicionY, color);
    this.base = base;
    this.altura = altura;
}

public double calcularArea(){

    return (base * altura )/2.0 ;


}

public double getBase() {
    return base;
}

public void setBase(double base) {
    this.base = base;
}

public double getAltura() {
    return altura;
}

public void setAltura(double altura) {
    this.altura = altura;
}


  
}
