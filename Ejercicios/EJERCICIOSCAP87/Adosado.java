package EJERCICIOSCAP87;

public class Adosado extends Vivienda {
   private int Numplantas;

public Adosado(String calle, int superficieEnMetros, int numplantas) {
    super(calle, superficieEnMetros);
    Numplantas = numplantas;
}

 public double calcularPrecio(){
   
    return (super.calcularPrecio());

 }

public int getNumplantas() {
    return Numplantas;
}

public void setNumplantas(int numplantas) {
    Numplantas = numplantas;
}

 
}
