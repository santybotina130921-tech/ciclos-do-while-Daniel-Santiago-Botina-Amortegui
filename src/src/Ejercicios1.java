//Garantiza la visualización del menú al menos una vez y se mantiene activo
// hasta que el usuario elija la opción de salida.

import java.util.Scanner;
public class Ejercicios1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\n=== SISTEMA DE VENTAS POS ===");
                System.out.println("1. Registrar nueva venta");
                System.out.println("2. Consultar inventario");
                System.out.println("3. Generar reporte diario");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción (1-4): ");

                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("-> Módulo de registro de ventas iniciado.");
                        break;
                    case 2:
                        System.out.println("-> Consultando inventario actual...");
                        break;
                    case 3:
                        System.out.println("-> Generando reporte en PDF...");
                        break;
                    case 4:
                        System.out.println("Saliendo del sistema. ¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } while (opcion != 4);

            scanner.close();
        }
    }

