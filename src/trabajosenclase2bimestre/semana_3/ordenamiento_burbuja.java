package semana_3;

public class ordenamiento_burbuja {
    public static void main(String[] args) {
        int numero[] = {20,10,5,3,2,1};
        //Se controla el numero de pasadas generales
        for (int indice = 1; indice <= numero.length -1; indice++) {
            for (int elemento = 0; elemento <= numero.length -2 ; elemento++) {
                //Verifiar si realizamos Intercambio
                if (numero[elemento]>numero[elemento+1]){
                    int aux = numero[elemento];
                    numero[elemento] = numero[elemento+1];
                    numero[elemento+1]=aux;
                }

            }

        }
        //Mostrar arreglo ordenado
        for (int indice = 0; indice < numero.length ; indice++) {
            System.out.println(numero[indice]);
        }
    }
}
