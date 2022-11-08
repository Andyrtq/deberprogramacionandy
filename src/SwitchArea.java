/**
 * Programa para el area de un cuadrado, circulo, triangulo
 */

import java.util.Scanner;

public class SwitchArea {
    private static Scanner entrada;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese valores");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Encontrar el area de un circulo");
                double area, radio;
                System.out.println("Ingrese el valor del radio: ");

                radio = entrada.nextDouble();


                area = Math.PI * Math.pow(radio, 2);
                System.out.println("El area es: " + area);
                break;
            case 2:
                System.out.println("Encontrar area de un cuadrado");
                int lado = teclado.nextInt();
                area = teclado.nextInt();
                lado=4;

                area=lado*lado;
                System.out.println(area);
                break;
            case 3:
                System.out.println("Encontrar el area de un triangulo");
                int base = teclado.nextInt();
                int altura = teclado.nextInt();

                area=(base * altura)/2;
                System.out.println("area");
                break;

            default:
                System.out.println("Valores ingresados incorrectos");
        }
        System.out.println("fin del switck");
    }
}
