package semana_4;

public class promedio_matriz {
    public static void main(String[] args) {
        int numeros [][] = {
                {5,6},
                {2,7},
                {7,1},
                {3,4}
        };
        int suma_total = 0;
        for (int fila = 0; fila < numeros.length ; fila++) {
            for (int columnas = 0; columnas < numeros[0].length; columnas++) {
                //suma_total = suma:total + numeros[filas][col]
                suma_total += numeros[fila][columnas];
            }
        }
        int numero_elementos = numeros.length + numeros[0].length;
        double prom = (double) suma_total / (double) numero_elementos;
        System.out.println("suma: "+ suma_total);
        System.out.println("promedio: "+ prom);
    }
}
