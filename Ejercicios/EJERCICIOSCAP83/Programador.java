package EJERCICIOSCAP83;

public class Programador extends Empleado{
    private int lineasdecodigoporhora;
   private String lenguajedominante;
public Programador(String nombre, int dni, int edad, boolean casado, double salario, int lineasdecodigoporhora,
        String lenguajedominante) {
    super(nombre, dni, edad, casado, salario);
    this.lineasdecodigoporhora = lineasdecodigoporhora;
    this.lenguajedominante = lenguajedominante;
}
public Programador() {
}

public double calculaSalario(){
    return (10*lineasdecodigoporhora);
}
public int getLineasdecodigoporhora() {
    return lineasdecodigoporhora;
}
public void setLineasdecodigoporhora(int lineasdecodigoporhora) {
    this.lineasdecodigoporhora = lineasdecodigoporhora;
}
public String getLenguajedominante() {
    return lenguajedominante;
}
public void setLenguajedominante(String lenguajedominante) {
    this.lenguajedominante = lenguajedominante;
}


}
