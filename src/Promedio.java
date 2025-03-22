import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int aprobados = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("ingrese la primera nota del estudiante " + i);
            float primeraNota = input.nextFloat();
            System.out.println("ingrese la segunda nota del estudiante " + i);
            float segundaNota = input.nextFloat();
            System.out.println("ingrese la tercera nota del estudiante " + i);
            float terceraNota = input.nextFloat();

            float promedio = (primeraNota + segundaNota + terceraNota) / 3;
             if (promedio >= 3.0) {
                aprobados ++;
             }
        } 
        System.out.println("de los 4 estudiantes, " + aprobados + " aprobaron");
        input.close();
    }
}
