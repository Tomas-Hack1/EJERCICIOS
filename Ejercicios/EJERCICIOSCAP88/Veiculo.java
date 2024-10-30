package EJERCICIOSCAP88;

public class Veiculo {
  String matricula;
  String marca;
  double precio;
  int cilindrada;
  double impuestoCirculacion;
  double coutaMesgaraje;

  private static  final double cuotaEstandar = 100.0;
public Veiculo(String marca, double precio, int cilindrada) {
    this.marca = marca;
    this.precio = precio;
    this.cilindrada = cilindrada;
    this.matricula = null;
    this.coutaMesgaraje = cuotaEstandar;


}
public String getMatricula() {
    return matricula;
}
public void setMatricula(String matricula) {
    this.matricula = matricula;
}
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public double getPrecio() {
    return precio;
}
public void setPrecio(double precio) {
    this.precio = precio;
}
public int getCilindrada() {
    return cilindrada;
}
public void setCilindrada(int cilindrada) {
    this.cilindrada = cilindrada;
}
public double getImpuestoCirculacion() {
    return impuestoCirculacion;
}
public void setImpuestoCirculacion(double impuestoCirculacion) {
    this.impuestoCirculacion = impuestoCirculacion;
}
public double getCoutaMesgaraje() {
    return coutaMesgaraje;
}
public void setCoutaMesgaraje(double coutaMesgaraje) {
    if( coutaMesgaraje >= 0) {
    this.coutaMesgaraje = coutaMesgaraje;
    }

     else {
        System.out.println("No se puede debido a que es negativo");
     }
}
public static double getCuotaestandar() {
    return cuotaEstandar;
}

public void calcularImpuestoCirculacion(){
    this.impuestoCirculacion = this.precio*0.02;
}

public boolean matricular(String matricula){

    if(matricula.length() == 7 ){
        this.matricula = matricula;
        return true;
    }
    else { 
        return false;
    }
}





  

}
