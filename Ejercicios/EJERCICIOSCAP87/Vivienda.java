package EJERCICIOSCAP87;

public class Vivienda {
   private String calle;
   private double precio;
   private int superficieEnMetros;
public Vivienda(String calle, int superficieEnMetros) {
    this.calle = calle;
    this.superficieEnMetros = superficieEnMetros;
}

   public double calcularPrecio() {
   
        return (superficieEnMetros*1000);
}

public String getCalle() {
    return calle;
}

public void setCalle(String calle) {
    this.calle = calle;
}

public double getPrecio() {
    return precio;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

public int getSuperficieEnMetros() {
    return superficieEnMetros;
}

public void setSuperficieEnMetros(int superficieEnMetros) {
    this.superficieEnMetros = superficieEnMetros;
}

  
}