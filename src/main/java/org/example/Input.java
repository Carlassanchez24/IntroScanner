package org.example;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String user = "admin";
        String password = "1234";
        int contador = 0;
        boolean autenticado = false;

        Scanner scanner = new Scanner(System.in);

        while (contador < 3) {
            System.out.println("Nombre de usuario: ");
            String nombre = scanner.nextLine();

            System.out.println("Contraseña: ");
            String contrasenya = scanner.nextLine();

            if (nombre.equals(user) && contrasenya.equals(password)) {
                System.out.println("Se ha autenticado con éxito");
                autenticado = true;
                break;
            }

            System.out.println("Usuario y/o contraseña inválido");
            contador++;
        }

        if (!autenticado) {
            System.out.println("Has excedido el número de intentos");
        }
        scanner.close();
    }
}
