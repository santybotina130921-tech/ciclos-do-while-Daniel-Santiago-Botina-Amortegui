import java.util.Scanner;

public class Ejercicios1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Saludar");
            System.out.println("2. Ver fecha aproximada");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("¡Hola! Bienvenido al programa.");
            } else if (opcion == 2) {
                System.out.println("Hoy es un excelente día para programar.");
            } else if (opcion == 3) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}
//Presenta un menú numerado al usuario y procesa la selección usando solo if y else if. Se repite hasta que el usuario
// elija la opción de salir (número 3).