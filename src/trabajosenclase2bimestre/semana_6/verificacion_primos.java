package semana_6;

import static semana_6.ambitovariable.numero;

/**
 * Programa para verificar atraves de metodos si un numero es primo o no o si es par o impar
 */
public class verificacion_primos {
    public boolean verificar_primo(int num_a_verificar) {
        int cont_divisores = 0;
        for (int cont = 1; cont <= num_a_verificar; cont++) {
            if (num_a_verificar % cont == 0)//detectamos un nuevp divisor
                cont_divisores++;
        }
        if (cont_divisores == 2)//verificamps si es primo
            return true;
        else
            return false;
    }
    public boolean verificar_numero(int num_a_verificar){
        if (numero % 2 == 0)
        {
           return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
            verificacion_primos mivariable = new verificacion_primos();
            if (mivariable.verificar_primo(5) == true)
            System.out.println("Si es primo");
            else
            System.out.println("No es primo");

        if (mivariable.verificar_numero(2))
            System.out.println("ES PAR");
        else
            System.out.println("ES impar");
    }

}
