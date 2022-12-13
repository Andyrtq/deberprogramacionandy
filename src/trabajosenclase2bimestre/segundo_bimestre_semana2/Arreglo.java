package segundo_bimestre_semana2;

public class Arreglo {
    public static void main(String[] args) {
        //creacion de arreglo con valores predefinidos
        String universidades []= {"utpl", "unl", "espol", "ucuenca", "usfq", "uide"};
        int tam = universidades.length;//se obtiene el tamaño del arreglo
        System.out.println("El tamaño del arreglo: " +tam);
        for (int indice = 0; indice < tam; indice++){
            System.out.println( universidades[indice] +"\t" );
        }
            //creacion de un arreglo de tipo entero
        int notas[] = {7,8,5,4,10};
        for (int indice = 0; indice < notas.length ; indice++){
            System.out.println(notas[indice]);
        }
        //creacion de un arreglo tipo char
        char vocales[] = {'a','e','i','o','u'};
        for (int indice = 0; indice < vocales.length; indice++){
        System.out.println(vocales[indice]);
    }
    //creacion de un arreglo de tipo boolean
    boolean valores[] = {true, false, false, true,true};
    for (int indice = 0; indice < valores.length; indice++){
        System.out.println(valores[indice]);
    }
    //creaccion de un arreglo tipo deimal
        double numeros[]= {1.1,2.1,3.1};

    }
    }