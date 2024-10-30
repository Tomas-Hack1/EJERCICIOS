package EJERCICIOSCAP83;

public class Empleado {
   String nombre;
   int  dni;
   int edad;
   boolean casado;
   double salario;
public Empleado(String nombre, int dni, int edad, boolean casado, double salario) {
    this.nombre = nombre;
    this.dni = dni;
    this.edad = edad;
    this.casado = casado;
    this.salario = salario;
}
public Empleado() {
}

   public String clasifica(){
    if(edad<=21){
        return "Principiante";

    } else if(edad>=22 && edad<=35){
        return "intermedio";
    } else {
        return "senior";
    }
   }
   
@Override
public String toString() {
    return "Empleado [nombre=" + nombre + "\n" + ", dni=" + dni + "\n" + ", edad=" + edad + "\n" + ", casado=" + (casado?  "Si" : "No") + "\n" + ", salario="
            + salario + "]";
}
 
  public void subirSalario( int x) {
    if ( x < 0){
        System.out.println("No se puede aumentar un porcentaje negativo");
    
        }
        salario += salario*(x/100);

    }
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public int getDni() {
    return dni;
}
public void setDni(int dni) {
    this.dni = dni;
}
public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public boolean isCasado() {
    return casado;
}
public void setCasado(boolean casado) {
    this.casado = casado;
}
public double getSalario() {
    return salario;
}
public void setSalario(double salario) {
    this.salario = salario;
}

    
  }
    

