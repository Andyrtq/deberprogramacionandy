package condicional_tarea;

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el timpo");
        int tiempo = teclado.nextInt();
        if (tiempo <= 35){
            double presion = 0.46 * tiempo;
            System.out.println("Presion es: "+ presion);
        } else if (tiempo > 35) {
            double presion = 0.19 * tiempo + 9.45;
            System.out.println("La presion es: "+ presion);
        }
    }
}