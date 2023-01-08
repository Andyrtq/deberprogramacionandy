import java.util.Scanner;

public class deber_multiplicacion_matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero de filas de la matriz");
        int filas = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz");
        int columnas = teclado.nextInt();
        System.out.println("ingrese numero de filas de la segunda matriz");
        int filas2 = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas de la segunda matriz");
        int columnas2 = teclado.nextInt();
        int matriz1 [][] = new int[filas][columnas];
        int matriz2 [][] = new int[filas2][columnas2];
        int mresultante [][] = new int[matriz1.length][matriz2[0].length];
        if (filas == columnas && filas2 == columnas2) {
            System.out.println("Ingrese los numeros de la primera matriz");
            for (int indice1 = 0; indice1 < filas; indice1++) {
                for (int indice2 = 0; indice2 < columnas; indice2++) {
                    matriz1[indice1][indice2] = teclado.nextInt();
                }
            }
            System.out.println("Ingrese los numero de la segunda matriz");
            for (int indice1 = 0; indice1 < filas2; indice1++) {
                for (int indice2 = 0; indice2 < columnas2; indice2++) {
                    matriz2[indice1][indice2] = teclado.nextInt();
                }
            }
            System.out.println("Matriz 1");
            for (int indice1 = 0; indice1 < matriz1.length; indice1++) {
                for (int indice2 = 0; indice2 < matriz1[0].length; indice2++) {
                    System.out.println(matriz1[indice1][indice2] + "\t");
                }
                System.out.println("\n");
            }
            System.out.println("Matriz 2");
            for (int indice1 = 0; indice1 < matriz2.length; indice1++) {
                for (int indice2 = 0; indice2 < matriz2[0].length; indice2++) {
                    System.out.println(matriz2[indice1][indice2] + "\t");
                }
                System.out.println("\n");
            }
            for (int fila = 0; fila < matriz1.length; fila++) {
                for (int columna = 0; columna < matriz2[0].length; columna++) {
                    for (int i = 0; i < matriz1.length; i++) {
                        mresultante[fila][columna] = mresultante[fila][columna] + (matriz1[fila][i] * matriz2[i][columna]);

                    }
                }
            }
            System.out.println("\t");
            System.out.println("Matriz resultante");
            for (int indice = 0; indice < mresultante.length; indice++) {
                for (int indice2 = 0; indice2 < mresultante[0].length; indice2++) {
                    System.out.print(mresultante[indice][indice2] + "\t");
                }
                System.out.println("\n");
            }

            }else{
            System.out.println("Datos ingresados incorrectos");
        }



    }
}
