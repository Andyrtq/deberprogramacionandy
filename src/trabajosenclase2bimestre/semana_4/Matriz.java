public class Matriz {
    public static void main(String[] args) {
        //Creación de una matriz con valores predefinidos
        String univ [][]={
                {"utpl","ucuenca","espol"},
                {"unl","uzuay","uide"},
                {"unach","usfq","salesiana"}
        };
        //System.out.println("Dimensión de la matriz: ");
        //System.out.println("filas= "+univ.length);
        //System.out.println("columnas= "+univ[0].length);
        int filas=univ.length;
        int columnas=univ[1].length;
        for (int fila = 0; fila <filas ; fila++) {
            for (int col = 0; col<columnas ; col++) {
                System.out.print(univ[fila][col]+ "\t");
            }
            System.out.println();

        }
    }
}
