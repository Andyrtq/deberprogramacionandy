import java.util.Scanner;

public class Escritura_matriz {
    public static void main(String[] args) {
        int numeros [][]=new int [3][2];
        int filas=numeros.length;
        int columnas=numeros[1].length;
        numeros[1][1]=5;
        numeros[2][0]=9;
        //Operación escritura de una matriz
        Scanner teclado = new Scanner(System.in);
        for (int fila = 0; fila <filas ; fila++) {
            System.out.println("fila: "+fila);
            for (int col = 0; col<columnas ; col++) {
                System.out.println("Ingrese una edad para numeros ["+fila+"]["+col+"]: ");
                int edad = teclado.nextInt();
                numeros[fila][col]=edad;

            }
        }
        //Operacion lectura de una matriz
        for (int fila = 0; fila <filas ; fila++) {
            for (int col = 0; col<columnas ; col++) {
                System.out.print(numeros[fila][col]+ "\t");
            }
            System.out.println();
        }
    }
}
