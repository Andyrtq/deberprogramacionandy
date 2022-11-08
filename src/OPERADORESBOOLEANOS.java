public class OPERADORESBOOLEANOS {
    public static void main(String[] args) {
        System.out.println("PRUEBA DE OPERADORES LOGICOS O BOOLEANOS");
        boolean valor = (5 == 5); //Operador reacional
        boolean valor_logico = ( (5 == 5) || (4  >= 3) );// V or v - > V
        boolean valor_logico_and = !( !(5 == 5) && (4  >= 3) ); // V and v - V
        System.out.println("valor: "+ valor );
        System.out.println("valor: "+ valor );
        System.out.println("valor_logico: "+valor_logico);
        System.out.println("negacion de valor logico: "+ !valor_logico);

    }
}
