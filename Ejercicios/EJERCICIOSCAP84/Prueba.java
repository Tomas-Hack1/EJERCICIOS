package EJERCICIOSCAP84;

public class Prueba {
   public static void main(String[] args) {
    Coche c1 = new Coche("Susuki", "rojo", 10000, 1.0, 2022);
    c1.setDnititular("467733");
    c1.setMatricula("2245555");

    CocheMatriculado c1m = new CocheMatriculado("Ferrari", "rojo", 50000, 1.2, 2023, "PQE123", "128384", 2023, 6);
    System.out.println("coche 1 - marca : "+ c1.getMarca() + " " + "Matricula : " + c1.getMatricula());
    System.out.println("coche matriculado - Marca :  "+ c1m.getMarca()+  " Impuesto de matriculacion : " + c1m.getImpuestomatriculacion());


    
   }
}
