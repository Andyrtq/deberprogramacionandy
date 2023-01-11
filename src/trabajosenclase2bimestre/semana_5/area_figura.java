package semana_5;

import java.util.Scanner;

public class area_figura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        System.out.println("Programa para obtener area de figuras geometricas");
        System.out.println("Digite 1 para obtener el area de una circunferencia");
        System.out.println("Digite 2 para obtener el area de un cuadrado");
        System.out.println("Digite 3 para el area de un cilindro");
        seleccionar_figura(opcion);
    }
    public static void seleccionar_figura(int opcion){
        Scanner teclado = new Scanner(System.in);
        switch (opcion){
            case 1:
                System.out.println("Area de una circunferencia");
                System.out.println("Ingrese el radio");
                double radio = teclado.nextInt();
                double area = obtener_area_circunferencia(radio);
                System.out.println("El area es: "+area);
            case 2:
                System.out.println("Area de un cuadrado");
                System.out.println("Ingrese el lado");
                double lado = teclado.nextInt();
                double areaa = obtener_area_cuadrado(lado);
                System.out.println("El area del cuadrado es: "+ areaa);
            case  3:
                System.out.println("Area de un cilindro");
                System.out.println("Ingrese el perimetro");
                double perimetro = teclado.nextInt();
                System.out.println("Ingrese la altura");
                double altura = teclado.nextInt();
                double areaaa = obtener_area_cilindro(perimetro, altura);
                System.out.println("El area del cilindr0 es: "+areaaa);
        }
    }
    public static double obtener_area_circunferencia(double radio){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    public static double obtener_area_cuadrado(double lado){
        double areaa = lado * lado;
        return areaa;
    }
    public static double obtener_area_cilindro(double perimetro, double altura){
        double areaaa = (2*Math.PI*perimetro*altura);
        return areaaa;
    }
}
