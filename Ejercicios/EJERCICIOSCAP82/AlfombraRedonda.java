package EJERCICIOSCAP82;

public class AlfombraRedonda extends Alfombra {
  private int radio;

public AlfombraRedonda(String color, int precioMetro, int radio) {
    super(color, precioMetro);
    this.radio = radio;
}

public int getRadio() {
    return radio;
}

public void setRadio(int radio) {
    this.radio = radio;
}

  public double calcularSuperficie(){
  
   return (3.1416 * Math.pow(radio, 2));

 }

 public double calcularPrecio(){
 
 return (calcularSuperficie() * getPrecioMetro());

 }

 
}
