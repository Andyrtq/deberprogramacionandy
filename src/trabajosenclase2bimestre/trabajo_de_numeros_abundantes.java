package trabajosenclase2bimestre;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class trabajo_de_numeros_abundantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma_divisores = 0;
        int contador = 1;
        System.out.println("Ingrese un numero");
        int numero = teclado.nextInt();
        while (contador < numero ){
            if (numero % contador == 0){
                int division = numero / contador;
                System.out.println(division);
                suma_divisores = suma_divisores +1;
            }
            contador = contador + 1;
        }
            if ( suma_divisores < numero)
                System.out.println("no es  un numero abundante");
            else if (suma_divisores > numero)
                System.out.println(" es un numero abundante");
        }
    }

