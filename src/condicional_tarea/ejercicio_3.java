package condicional_tarea;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingresar segundo numero");
        int num2 = teclado.nextInt();
        if (num1 % num2 == 0){
            System.out.println("El num1 es divisible para num2");
        }else
            System.out.println("El num1 no es divisible para num2");
    }
}