package arreglo_bidimencional;

public class Matriz {
    public static void main(String[] args) {
        int matriz[][] = new int[2][3];
        System.out.println(matriz[1][2]);
        //creacion de una matriz con valores predefinidos
        String univ[][] = {
                {"utpl","ucuenca","espol"},
                {"unl","uazuay","uide"}
        };
        int filas = univ.length;
        int columnas = univ[1].length;
        for (int fila = 0; fila <=1 ; fila++) {
            for (int col = 0; col <= 2 ; col++) {
                System.out.println(univ[fila][col]);
            }
            System.out.println();
        }

    }
}

