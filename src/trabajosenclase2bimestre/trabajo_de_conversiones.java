package trabajosenclase2bimestre;

import java.util.Scanner;

public class trabajo_de_conversiones {
    public static void main(String[] args) {
            int interruptor = 1;
            System.out.println("Elija una opcion");
            System.out.println("OPCION 1: MB A KB");
            System.out.println("OPCION 2: KB A MB");
            System.out.println("OPCION 3 MB A BITS");
            System.out.println("OPCION 4: SALIR");
        Scanner teclado = new Scanner(System.in);
        int OPCION = teclado.nextInt();
        while (interruptor ==1);

            switch (OPCION) {
                case 1:
                    System.out.println("OPCION 1: MB A KB");
                    System.out.println("Ingrese un valor");
                    int MB =teclado.nextInt();
                    int KB = MB * 1024;
                    System.out.println("El valor de KB: "+KB);
                case 2:
                    System.out.println("OPCION 2: KB A MB");
                    System.out.println("Ingrese un valor");
                     KB = teclado.nextInt();
                     MB = KB/1024;
                    System.out.println("El valor de MB: "+MB);
                case 3:
                    System.out.println("OPCION 3: MB A BITS");
                    System.out.println("Ingrese un valor");
                    MB = teclado.nextInt();
                    int BITS = MB * 1024;
                    System.out.println("El valor de BITS: "+BITS);
                case 4:
                    System.out.println("CERRANDO PROGRAMA");
                    interruptor = 0;
                    break;
                default:
                    System.out.println("LA OPCION INGRESADA ES INCORRECTA");
                    interruptor = 0;
                    break;
            }

        }
    }







