package semana_3;

import java.util.Scanner;

public class ficha_dato {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre[] = new String[100];
        int edad[] = new int[100];
        String uni[] = new String[100];
        Boolean interruptor = true;
        int indice = 0;
        while (interruptor) {
            System.out.println("Ingrese datos del estudiante");
            System.out.println("Ingrese nombres: ");
            nombre[indice] = teclado.nextLine();
            System.out.println("Ingrese edad: ");
            edad[indice] = teclado.nextInt();
            System.out.println("Ingrese uni: ");
            uni[indice] = teclado.nextLine();
            indice++;
            System.out.println("Desea ingresar nuevo estudiante si/no");
            String resp = teclado.nextLine().toLowerCase();
            if (resp.equals("no")) ;
            interruptor = false;
        }
        //ordenamiento por edad
        System.out.println("ORDENAR ARREGLO");
        for (int indice2 = 1; indice <= edad.length-1 ; indice++) {
            for (int elemento = 0; elemento <= edad.length ; elemento++) {
                if (edad[elemento]>edad[elemento+1]);{
                    int aux = edad[elemento];
                    edad[elemento]= edad[elemento+1];
                    edad[elemento+1] = aux;
                    //proceso de intercambio nombres
                    String aux_n = nombre[elemento];
                    nombre[elemento] = nombre[elemento+1];
                    nombre [elemento+1] = aux_n;
                    //proceso intercambio arreglo uni
                    String aux_u = uni[elemento];
                    uni[elemento] = uni[elemento+1];
                    uni [elemento+1] = aux_u;
                }

            }

        }
        //presentar datos de los estudiantes
        for (int pos = 0; pos < nombre.length ; pos++) {
            if(nombre [pos]!=null){
                System.out.println("Nombre : "+nombre[pos]);
                System.out.println("Edad : "+edad[pos]);
                System.out.println("Universidades : "+uni[pos]);
            }

        }
    }


}
