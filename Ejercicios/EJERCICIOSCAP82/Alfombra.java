package EJERCICIOSCAP82;

public abstract class Alfombra implements IALfombras {
  public String color;
  public  int precioMetro;
public Alfombra(String color, int precioMetro) {
    this.color = color;
    this.precioMetro = precioMetro;
}
public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}
public int getPrecioMetro() {
    return precioMetro;
}
public void setPrecioMetro(int precioMetro) {
    this.precioMetro = precioMetro;
}

 public abstract double calcularSuperficie();
 public abstract double calcularPrecio();
 
 

}
