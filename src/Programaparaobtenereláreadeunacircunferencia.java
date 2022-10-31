import java.util.Scanner;

public class Programaparaobtenereláreadeunacircunferencia {
    private static Scanner entrada;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double area, radio;
        System.out.println("Ingrese el valor del radio: ");

        radio = entrada.nextDouble();


        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area es: " + area);

    }
}
