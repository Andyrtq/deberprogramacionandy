package semana_4;

import java.util.Scanner;

public class matriz_marcas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ijgrese el numero de filas de la matriz");
        int filas = teclado.nextInt();
        System.out.println("Ingrese el numerp de columnas");
        int cols = teclado.nextInt();
        teclado.nextLine();
        String marcas [][] = new String[filas][cols];
        for (int fila = 0; fila < filas ; fila++) {
            for (int col = 0; col < cols ; col++) {
                System.out.println("Ingrese valor poscicion ["+fila+"]["+col+"]");
                marcas[fila][col] = teclado.nextLine().toLowerCase();
            }
        }
        boolean salir = false;
        while(!salir){
            System.out.println("Digite opcion 1 para realizar una busquedad: ");
            System.out.println("Digite opcion 2 para modificar un valor: ");
            System.out.println("Digite opcion 3 paraeliminar un valor: ");
            System.out.println("Digite opcion 4 para vizualizar la matriz: ");
            System.out.println("Digite opcion 5 para salir: ");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                System.out.println("Opcion busquedad seleccionada");
                System.out.println("Que marca busca: ");
                String marca_busqueda = teclado.nextLine().toLowerCase();
                boolean encontrado = false;
                    for (int fila = 0; fila < filas ; fila++) {
                        for (int col = 0; col < cols ; col++) {
                            if(marcas[fila][col].equals(marca_busqueda) ){
                                System.out.println("Marca encontrada: " +marca_busqueda);
                                System.out.println("En la poscicion: ["+fila+"]["+col+"]");
                                encontrado = true;
                                break;
                            }
                        }
                    }
                    if (encontrado == false)
                        System.out.println("Marca no encontrada");
                    break;
                case 2:
                    System.out.println("Opcion modificar seleccionada");
                    System.out.println("Ingrese que fila desea modificar: ");
                    int fila = teclado.nextInt();
                    System.out.println("Ingrese que columna desea modificar: ");
                    int col = teclado.nextInt();
                    System.out.println("Cuañ es la nueva marca que desea ingresar: ");
                    String nueva_marca = teclado.nextLine();
                    marcas[fila][col] = nueva_marca;
                    break;
                case 3:
                    System.out.println("Opcion eliminar selleccionada");
                    System.out.println("Que marca desea eliminar");
                    String marca_a_eliminar = teclado.nextLine().toLowerCase();
                    for (int fils = 0; fils < filas ; fils++) {
                        for (int colu = 0; colu < cols ; colu++) {
                            if(marcas[fils][colu].equals(marca_a_eliminar)){
                                marcas[fils][colu] = "";
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Opcion lectura seleccionada");
                    for (int fil = 0; fil < filas ; fil++) {
                        for (int coll = 0; coll < cols ; coll++) {
                        }
                    }
                    break;
                case 5:
                    System.out.println("TOPAMOS MI LLAVE");
                    salir = true;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}

