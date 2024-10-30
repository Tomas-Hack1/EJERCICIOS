package EJERCICIOSCAP84;

public class Coche {
  private final String marca;
  private String color;
  private int km = 0;
  private double precio;
  private final double factor_contaminacion;
  private final int año;
  private String matricula;
  private String dnititular;
  public Coche(String marca, String color, double precio, double factor_contaminacion, int año) {
    this.marca = marca;
    this.color = color;
    this.precio = precio;
    this.factor_contaminacion = factor_contaminacion;
    this.año = año;
    this.km = 0;
  }
   
  public void incrementarKM(int km){
  
  this.km += km;
  
  }

  public void comprarCoche(Coche otroCoche){
  
    if (this.dnititular != null && otroCoche.dnititular != null) {
      this.dnititular = otroCoche.dnititular;
    }
  }

  public String getMarca() {
    return marca;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getKm() {
    return km;
  }

  public void setKm(int km) {
    this.km = km;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public double getFactor_contaminacion() {
    return factor_contaminacion;
  }

  public int getAño() {
    return año;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getDnititular() {
    return dnititular;
  }

  public void setDnititular(String dnititular) {
    this.dnititular = dnititular;
  }
}
