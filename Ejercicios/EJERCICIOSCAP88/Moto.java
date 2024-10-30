package EJERCICIOSCAP88;

public class Moto extends Veiculo {
   private boolean tienesSidecar;

public Moto(String marca, double precio, int cilindrada, boolean tienesSidecar) {
    super(marca, precio, cilindrada);
    this.tienesSidecar = tienesSidecar;

    if( tienesSidecar){
        setCoutaMesgaraje(getCoutaMesgaraje()  *  1.5 );
      }
}

   public void calcularImpuestoCirculacion(){
    super.calcularImpuestoCirculacion();
    if( tienesSidecar){
      setCoutaMesgaraje(getCoutaMesgaraje() * 1.1);
    }
}

public boolean isTienesSidecar() {
    return tienesSidecar;
}

public void setTienesSidecar(boolean tienesSidecar) {
    this.tienesSidecar = tienesSidecar;
}
   
}
