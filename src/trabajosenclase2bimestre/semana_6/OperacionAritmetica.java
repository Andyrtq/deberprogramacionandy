package semana_6;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Programa para crear un metodo para realizar operaciones matematicas
 */
public class OperacionAritmetica {
    //creacion de variables locales
    int n1;
    int n2;

    /**
     * Metodo para realizar la suma de dos numeros enteros
     * @param n1
     * @param n2
     * @return n1 + n2
     */
    public int sumar(int n1, int n2){
        return (n1 + n2);
    }

    /**
     * Metodo para realizar una resta de dos numeros enteros
     * @param n1
     * @param n2
     * @return n1 - n2
     */
    public int restar(int n1, int n2){
        return (n1 - n2);
    }

    /**
     * Metodo para multiplicar dos numeros enteros. No retorna valor
     * @param n1
     * @param n2
     */
    public void multiplicar(int n1, int n2){
        System.out.println("La multiplicacion es: " +(n1*n2));
    }

    public void dividir(){
        if (n2 > 0) {
            System.out.println("La divison es: "+((double)n1 / (double)n2));
        } else {
        System.out.println("La division creada no existe");
    }
}
    public void ejecutar(){
        Scanner tecaldo = new Scanner(System.in);
        boolean interruptor = true;
        while(interruptor){
            System.out.println("Digite 0 para salir");
            System.out.println("Digite 1 para sumar ");
            System.out.println("Digite 2 para restar");
            System.out.println("Digite 3 para multiplicar");
            System.out.println("Digite 4 para dividir");
            int opcion = tecaldo.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("SALIR");
                    interruptor = false;
                    break;
                case 1:
                    ingresar_numeros();
                    System.out.println("La suma es: "+ sumar(n1,n2));
                    break;
                case 2:
                    ingresar_numeros();
                    System.out.println("La resta es:" + restar(n1,n2));
                    break;
                case 3:
                    ingresar_numeros();
                    multiplicar(n1,n2);
                    break;
                case 4:
                    ingresar_numeros();
                    dividir();
                    break;
                default:
                    System.out.println("opcion invalida");

            }
        }
    }
    public void ingresar_numeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = teclado.nextInt();
    }
    public static void main(String[] args) {
        OperacionAritmetica mivariable = new OperacionAritmetica();
        mivariable.ejecutar();
    }
}

