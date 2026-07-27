import java.util.Scanner;

public class Ejercicio2 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double nota;

            do {
                System.out.print("Ingrese la nota del estudiante (0.0 a 5.0): ");
                nota = scanner.nextDouble();

                if (nota < 0.0 || nota > 5.0) {
                    System.out.println("Error: Nota fuera de rango. Debe ser entre 0.0 y 5.0.");
                }

            } while (nota < 0.0 || nota > 5.0);

            System.out.println("Nota registrada con éxito: " + nota);
            scanner.close();
        }

}
//Garantiza que el usuario ingrese una nota válida (entre 0.0 y 5.0). Si ingresa un valor incorrecto,
// el programa vuelve a pedir la nota sin usar instrucciones de interrupción.