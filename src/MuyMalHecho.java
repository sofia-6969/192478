import java.util.Scanner;

public class MuyMalHecho {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int contador = 0;

        System.out.println("Número de usuarios a ingresar:");
        byte numUsuarios = input.nextByte();
        input.nextLine();

        byte primeraEdad = 0, segundaEdad = 0, terceraEdad = 0;
        String primerNombre = "", segundoNombre = "", tercerNombre = "";

        while (contador < numUsuarios) {
            System.out.println("Nombre del usuario:");
            String nombreUsuario = input.nextLine();

            System.out.println("Edad del usuario:");
            byte edadUsuario = input.nextByte();
            input.nextLine();
   
            if (contador == 0) {
                primerNombre = nombreUsuario;
                primeraEdad = edadUsuario;
            } else if (contador == 1) {
                segundoNombre = nombreUsuario;
                segundaEdad = edadUsuario;
            } else if (contador == 2) {
                tercerNombre = nombreUsuario;
                terceraEdad = edadUsuario;
            }

            if (edadUsuario >= 18) {
                System.out.println(nombreUsuario + " es mayor de edad.");
            } else {
                System.out.println(nombreUsuario + " es menor de edad.");
            }

            if (edadUsuario > 120 || edadUsuario < 1) {
                System.out.println("Edad no válida.");
            }

            contador = contador + 1;
        }

        System.out.println("Resumen:");
        System.out.println("Usuario 1: " + primerNombre + " - Edad: " + primeraEdad);
        System.out.println("Usuario 2: " + segundoNombre + " - Edad: " + segundaEdad);
        System.out.println("Usuario 3: " + tercerNombre + " - Edad: " + terceraEdad);
    }
}
