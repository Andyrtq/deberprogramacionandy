package semana_4;

import java.util.Scanner;

public class matriz_potencia {
    public static void main(String[] args) {
        int numeros [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int filas = numeros.length;
        int columnas = numeros[0].length;
        int mat_potencia [][] = new int[filas][columnas];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese valor de la potencia: ");
        int potencia = teclado.nextInt();
        for (int fila = 0; fila < filas ; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                mat_potencia[fila][columna] = (int) Math.pow(numeros[fila][columna],potencia);
                System.out.println(mat_potencia[fila][columna]+"\t");
            }
            System.out.println("\n");
        }
    }
}
