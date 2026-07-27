import java.util.Scanner;

public class Ejercicio3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double total = 0.0;
            double precio;

            System.out.println("=== REGISTRO DE VENTAS ===");
            System.out.println("Ingrese el precio de cada producto (Ingrese 0 para terminar):");

            do {
                System.out.print("Precio del producto: $");
                precio = scanner.nextDouble();

                if (precio > 0) {
                    total = total + precio;
                } else if (precio < 0) {
                    System.out.println("Los precios no pueden ser negativos.");
                }

            } while (precio != 0);

            System.out.println("El total a pagar es: $" + total);
            scanner.close();
        }
    }

//Suma los precios de los productos que ingresa el usuario. El ciclo termina únicamente cuando
// el usuario ingresa un número menor o igual a cero (0).