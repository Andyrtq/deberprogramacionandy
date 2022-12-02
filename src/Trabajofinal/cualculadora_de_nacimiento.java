package Trabajofinal;

import java.time.LocalTime;
import java.util.Scanner;

public class cualculadora_de_nacimiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE SU FECHA DE NACIMIENTO");

        System.out.println("Ingrese lo solicitado en numeros");

        System.out.println("Año");
        int ano = teclado.nextInt();
        System.out.println("Mes");
        int mes = teclado.nextInt();
        System.out.println("Dia");
        int dia = teclado.nextInt();




        if (ano >= 1990 && ano <= 2022) {
            if (mes >= 01 && mes <= 12) {

                LocalTime horactual = LocalTime.now();

                switch (mes) {
                    case 1:
                        if (dia >= 01 && dia <= 31) {
                            int dias31 = 31-dia;
                            int meses1 = 12-mes;
                            int anos1 = 2022-ano;
                            System.out.println("Tienes "+anos1+" con "+ meses1+" meses " +dias31+" dias "+horactual +"horas");
                        } else {
                            System.out.println("Fecha invalida");
                        }

                        break;
                    case 2:
                        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)
                            if (dia >= 01 && dia <= 29) {
                                int dias29 = 29-dia;
                                int meses1 = 12-mes;
                                int anos1 = 2022-ano;
                                System.out.println("Tienes "+anos1+" con "+ meses1+" meses "+" y "+dias29+" dias "+horactual+"horas");
                            } else {
                                System.out.println("Fecha Invalida");
                            }


                        break;
                    case 3:
                        if (dia >= 01 && dia <= 31) {
                            int dias = 31-dia;
                            int meses = 12-mes;
                            int anos = 2022-ano;
                            System.out.println("Tienes "+anos+" con "+ meses+" meses "+" y "+dias+" dias "+horactual+"horas");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;
                    case 4:
                        if (dia >= 01 && dia <= 30) {
                            int dias = 30-dia;
                            int meses = 12-mes;
                            int anos = 2022-ano;
                            System.out.println("Tienes "+anos+" con "+ meses+" meses "+" y "+dias+" dias "+horactual+"horas");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;


                    case 5:
                        if (dia >= 01 && dia <= 31) {
                            int dias = 31-dia;
                            int meses = 12-mes;
                            int anos = 2022-ano;
                            System.out.println("Tienes "+anos+" con "+ meses+" meses "+" y "+dias+" dias "+horactual+"horas");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                    case 6:
                        if (dia >= 01 && dia <= 30) {
                            int dias = 30-dia;
                            int meses = 12-mes;
                            int anos = 2022-ano;
                            System.out.println("Tienes "+anos+" con "+ meses+" meses "+" y "+dias+" dias "+horactual+"horas");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                    case 7:
                        if (dia >= 01 && dia <= 31) {
                            int dias = 31-dia;
                            int meses = 12-mes;
                            int anos = 2022-ano;
                            System.out.println("Tienes "+anos+" con "+ meses+" meses "+" y "+dias+" dias "+horactual+"horas");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                    case 8:
                        if (dia >= 01 && dia <= 31) {
                            int dias = 31-dia;
                            int meses = 12-mes;
                            int anos = 2022-ano;
                            System.out.println("Tienes "+anos+" con "+ meses+" meses "+" y "+dias+" dias "+horactual+"horas");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                    case 9:
                        if (dia >= 01 && dia <= 30) {
                            int dias = 30-dia;
                            int meses = 12-mes;
                            int anos = 2022-ano;
                            System.out.println("Tienes "+anos+" con "+ meses+" meses "+" y "+dias+" dias "+horactual+"horas");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                    case 10:
                        if (dia >= 01 && dia <= 31) {
                            int dias = 31-dia;
                            int meses = 12-mes;
                            int anos = 2022-ano;
                            System.out.println("Tienes "+anos+" años con "+ meses+" meses "+" y "+dias+" dias "+horactual+"horas");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                    case 11:
                        if (dia >= 01 && dia <= 31) {
                            int dias = 31-dia;
                            int meses = 12-mes;
                            int anos = 2022-ano;
                            System.out.println("Tienes "+anos+" años con "+ meses+" meses "+" y "+dias+" dias "+horactual+"horas");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                    case 12:
                        if (dia >= 01 && dia <= 31) {
                            int dias = 31-dia;
                            int meses = 12-mes;
                            int anos = 2022-ano;
                            System.out.println("Tienes "+anos+" con "+ meses+" meses "+" y "+dias+" dias "+horactual+"horas");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;
                }

            }
        }
        else{
            System.out.println("Fecha invalida");
        }
    }
}


