import java.util.Scanner;

public class Ejercicio4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int claveCorrecta = 1234;
            int claveIngresada;
            int intentos = 0;
            int maxIntentos = 3;

            do {
                System.out.print("Ingrese su clave (4 dígitos): ");
                claveIngresada = scanner.nextInt();
                intentos = intentos + 1;

                if (claveIngresada == claveCorrecta) {
                    System.out.println("¡Acceso concedido!");
                } else {
                    System.out.println("Clave incorrecta. Intentos usados: " + intentos + " de " + maxIntentos);
                }

            } while (claveIngresada != claveCorrecta && intentos < maxIntentos);

            if (claveIngresada != claveCorrecta) {
                System.out.println("Su cuenta ha sido bloqueada temporalmente.");
            }

            scanner.close();
        }
    }
}
//Permite ingresar una clave numérica de 4 dígitos. Controla los intentos directamente
// en la condición del while mediante una variable contadora.