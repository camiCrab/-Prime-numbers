package test;

import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero para saber si es primo");
        Scanner scanner = new Scanner(System.in); 
        int numero = scanner.nextInt();

        if (numerosprimos(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
    }

    public static boolean numerosprimos(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}

 