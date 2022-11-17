package condicional_tarea;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar tres numeros");
        System.out.println("Primer numero entero");
        int num1 = teclado.nextInt();
        System.out.println("Segundo numero entero");
        int num2 = teclado.nextInt();
        System.out.println("Tercer numero entero");
        int num3 = teclado.nextInt();
        int hipotenusa = (num1 * num1)+(num2 * num2);
        int numm3 = (num3 * num3);
        if (hipotenusa == numm3){
            System.out.println("Son los lados de un triangulo rectangulo");
        }else
            System.out.println("No son los lados de un triangulo rectangulo");
        }

    }
