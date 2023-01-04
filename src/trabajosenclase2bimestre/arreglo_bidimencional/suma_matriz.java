package arreglo_bidimencional;

public class suma_matriz {
    public static void main(String[] args) {
        int a[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int b[][] = {
                {9,3,7},
                {6,5,4},
                {3,2,1},
        };
        int filas = a.length;
        int cols = a[0].length;
        int c[][] = new int [filas][cols];
        //suma de matrizes a+b = c
        for (int fila = 0; fila < filas ; fila++) {
            for (int col = 0; col < cols ; col++) {
                c[fila][col] = c[fila][col] +b[fila][col];
            }
        }
        for (int fila = 0; fila < filas ; fila++) {
            for (int col = 0; col <cols ; col++) {
                System.out.println(c[fila][col]+"\t");
            }
            System.out.println("\n");
        }
    }
}
