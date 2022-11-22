package estructura_for;

import java.util.Scanner;

public class fatorial_for {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int factorial = 1;
        for (int contador = 1; contador <=numero ;contador++){
            factorial = factorial*contador;
        }
        System.out.println("El factorial es: "+factorial);
    }
}
