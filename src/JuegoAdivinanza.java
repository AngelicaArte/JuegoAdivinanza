import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {

        // Crear el generador de números aleatorios
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 y 100

        // Crear el lector de datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Variable para contar intentos
        int intentos = 1;

        System.out.println("¡Hola! Vamos a jugar a adivinar el número.");
        System.out.println("Se me ocurrió un número entre 1 y 100.");
        System.out.println("Tienes 5 intentos para adivinarlo.");

        // Usamos un bucle while para dar 5 oportunidades
        while (intentos <= 5) {
            System.out.print("Intento " + intentos + ": Ingresa tu número: ");
            int numeroUsuario = scanner.nextInt(); // Leer número del usuario

            // Verificamos si el número es mayor, menor o igual
            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número secreto es MAYOR.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número secreto es MENOR.");
            } else {
                System.out.println(" Adivinaste el número.");
                break; // Salimos del bucle si adivina
            }

            intentos = intentos + 1; // Aumentar contador de intentos
        }

        // Si no lo adivinó en 5 intentos
        if (intentos > 5) {
            System.out.println("Lo siento, ya no tienes más intentos.");
            System.out.println("El número secreto era: " + numeroSecreto);
        }

        // Cerramos el escáner
        scanner.close();
    }
}