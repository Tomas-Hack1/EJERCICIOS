package EJERCICIOSCAP88;

public class Coche extends Veiculo{
  private boolean TieneRadio;
  private boolean TieneNavegador;
public Coche(String marca, double precio, int cilindrada, boolean tieneRadio, boolean tieneNavegador) {
    super(marca, precio, cilindrada);
    TieneRadio = tieneRadio;
    TieneNavegador = tieneNavegador;

}

public void calcularImpuestoCirculacion(){
    super.calcularImpuestoCirculacion();

    if(TieneRadio){
        setCoutaMesgaraje(getCoutaMesgaraje() * 1.01 );
    }

    if( TieneNavegador){

        setCoutaMesgaraje(getCoutaMesgaraje() * 1.02);
    }

    if(getCilindrada() > 2999) {

        setCoutaMesgaraje(getCoutaMesgaraje() * 1.2);
    }
}

public boolean isTieneRadio() {
    return TieneRadio;
}

public void setTieneRadio(boolean tieneRadio) {
    TieneRadio = tieneRadio;
}

public boolean isTieneNavegador() {
    return TieneNavegador;
}

public void setTieneNavegador(boolean tieneNavegador) {
    TieneNavegador = tieneNavegador;
}

 
}
