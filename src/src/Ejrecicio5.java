import java.util.Scanner;

public class Ejrecicio5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int respuesta;
            int contadorOperaciones = 0;

            do {
                contadorOperaciones = contadorOperaciones + 1;
                System.out.println("\nProcesando operación número: " + contadorOperaciones);
                System.out.println("Operación completada exitosamente.");

                System.out.print("¿Desea realizar otra operación? (1 = Sí / 2 = No): ");
                respuesta = scanner.nextInt();

                if (respuesta != 1 && respuesta != 2) {
                    System.out.println("Respuesta no válida, el programa finalizará por seguridad.");
                }

            } while (respuesta == 1);

            System.out.println("Gracias por usar el sistema. Se realizaron " + contadorOperaciones + " operación(es).");
            scanner.close();
        }
    }
}
//Pide al usuario si desea realizar otra operación contestando con un número (1 para Sí, 2 para No),
// repitiendo la instrucción mientras el usuario presione 1.