package semana_4;

public class Matriz_transpuesta {
    /**
     *
     * Programa para generar la transpuesta de una matriz
     */
    public static void main(String[] args) {
        char letra [][] = {
                {'a','b','c'},
                {'d','r','f'}
        };
        int filas = letra.length;
        int columnas = letra[0].length;
        char transupuesta [][] = new char [columnas][filas];
        for (int fila = 0; fila < columnas ; fila++) {
            for (int columna = 0; columna < fila ; columna++) {
                transupuesta[fila][columnas] = letra[columnas][filas];
                System.out.println(transupuesta[fila][columna]+"\t");
            }
            System.out.println();
        }
    }
}
