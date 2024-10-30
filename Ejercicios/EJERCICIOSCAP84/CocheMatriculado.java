package EJERCICIOSCAP84;

public class CocheMatriculado extends Coche {
     private int añomatriculacion;
     private int mesmatriculacion;
     private double impuestomatriculacion;
     
    public CocheMatriculado(String marca, String color, double precio, double factor_contaminacion, int año,String matricula, String dnititular,
            int añomatriculacion, int mesmatriculacion) {
        super(marca, color, precio, factor_contaminacion, año);
        this.añomatriculacion = añomatriculacion;
        this.mesmatriculacion = mesmatriculacion;
        this.setMatricula(matricula);
        this.setDnititular(dnititular);
        calculaImpuestoMatriculacion();
    }

    

     public void calculaImpuestoMatriculacion(){
     
      impuestomatriculacion = getPrecio()/20;

        if(añomatriculacion - 2024 < 10) {
          impuestomatriculacion += 100;
        }
  


    }

    public int getAñomatriculacion() {
        return añomatriculacion;
    }

    public void setAñomatriculacion(int añomatriculacion) {
        this.añomatriculacion = añomatriculacion;
        calculaImpuestoMatriculacion();
    }

    public int getMesmatriculacion() {
        return mesmatriculacion;
    }

    public void setMesmatriculacion(int mesmatriculacion) {
        this.mesmatriculacion = mesmatriculacion;
    }

    public double getImpuestomatriculacion() {
        return impuestomatriculacion;
    }

    public void setImpuestomatriculacion(double impuestomatriculacion) {
        this.impuestomatriculacion = impuestomatriculacion;
        calculaImpuestoMatriculacion();
    }

    

}
