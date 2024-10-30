package EJERCICIOSCAP87;

public class chalet extends Vivienda {
   private int NumParcela;
   private boolean conPiscina;
public chalet(String calle, int superficieEnMetros, int numParcela, boolean conPiscina) {
    super(calle, superficieEnMetros);
    NumParcela = numParcela;
    this.conPiscina = conPiscina;
}
    
    public double calcularPrecio(){
    
     return (getSuperficieEnMetros()*1300);
    }

    public int getNumParcela() {
        return NumParcela;
    }

    public void setNumParcela(int numParcela) {
        NumParcela = numParcela;
    }

    public boolean isConPiscina() {
        return conPiscina;
    }

    public void setConPiscina(boolean conPiscina) {
        this.conPiscina = conPiscina;
    }

    
}
