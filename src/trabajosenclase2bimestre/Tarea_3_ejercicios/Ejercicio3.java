package Tarea_3_ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] cedulas = new int[1][5];
        Scanner sc = new Scanner(System.in);

        // Ingreso de cédulas
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese cédula " + (i + 1) + ": ");
            cedulas[0][i] = sc.nextInt();
        }

        // Validación de cédulas
        for (int i = 0; i < 5; i++) {
            if (validarCedula(cedulas[0][i])) {
                System.out.println("La cédula " + cedulas[0][i] + " es válida.");
            } else {
                System.out.println("La cédula " + cedulas[0][i] + " no es válida.");
            }
        }
    }

    public static boolean validarCedula(int cedula) {
        return true;
    }
}

