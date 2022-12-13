package segundo_bimestre_semana2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

/**
 * programa que solicite el nombre de n marcas de vehiculos y este la almacene en un arreglo
 * finalmente el programa debe mostrar el nombre de las marcas almacenadas en el aareglo
 */
public class arreglo_marca {
    public static void main(String[] args) {
        String marcas [] ;
        System.out.println("Cuantas marcas de vehiculo va a ingresar");
        Scanner teclado = new Scanner(System.in); //para el numero ingresado de marcas por teclado
        int n = teclado.nextInt();// leer el numero de marcas
        teclado.nextLine(); //esto se lo póne para el valor de tipo entero y esperar un enter
        marcas = new String[n]; // esto lo hacemos cuando no conoscamos cuantos elementos de entrada se conoce para el arreglo
        for (int indice = 0; indice < n; indice++) {
            System.out.println("Ingrese el nombre de la marca "+(indice+1));// para que se vea ingrese numero de marca 1 2 y 3
            String marca = teclado.nextLine();
            marcas [indice] = marca. toUpperCase(); // se pone indice por el valor que tiene de 0

        }
        System.out.println("Lista de marcas ingresadas: ");
        //operacion lectura de un arreglo
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.print(marcas[indice]+ "\t");
        }
        //OPERACION DE BUSQUEDAD
        System.out.println("Que marca desea buscar: ");
        //toUpperCase() es una funcion que onvierte un texto en mayusculas
        String marca_busquedad = teclado.next().toUpperCase(); //se recepta el nombre de la marca que el usuario dese buscar
        System.out.println("Marca_buscadad en mayuscula: "+marca_busquedad);
        for (int indice = 0; indice < n ; indice++) {
            if (marca_busquedad.equals(marcas[indice] ) ){
                System.out.println("Marca encontrada");
                System.out.println("Se encuentra en el indice: "+indice);
                break;
            }
        }
    }
}
