package semana_5;

import java.util.Scanner;

public class ClaseConMetodoRetornoValor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para suma de numeros");
        System.out.println("Ingrese el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = teclado.nextInt();
        int resultado = sumar(num1,num2);//llamamos al metodo y revisamos el valor
        System.out.println("La suma es: "+resultado);
        //sumar_dos_numeros(num1,num2);
        //obtener el promedio de los numeros ingresados
        double promedio = obtener_promedio(resultado,3);
        System.out.println("El promedio de los numeros es: "+promedio);
    }

    /**
     * Este metodo realiza la suma de dos numeros enteros
     * @param num1
     * @param num2
     * @return resultado
     */
     public static int sumar(int num1 , int num2){
        int resultado = num1 + num2;
        return resultado;
     }

     public static int sumar_dos_numeros(int num1 , int num2 , int num3){
        int resultado = num1 + num2 + num3;
        return resultado;
     }

    /**
     * Metodo para obtener el promedio de una suma de valores
     * @param suma_total
     * @param cantida_num
     * @return promedio
     */
     public static double obtener_promedio ( int suma_total , int cantida_num){
        double promedio = (double) suma_total/ (double) cantida_num;
        return promedio;
     }
}
