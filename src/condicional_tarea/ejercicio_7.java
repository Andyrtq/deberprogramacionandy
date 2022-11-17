package condicional_tarea;

import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar un primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingresar un segundo numero");
        int num2 = teclado.nextInt();
        if ( num1 > num2){
            System.out.println("El num1 es mayor");
        }else{
            System.out.println("El num1 es menor");
        }
    }
}