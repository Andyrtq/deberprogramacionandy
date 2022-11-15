/**
 *  Generar la tabla de multiplicar hasta el 10 de un numero ingresado por el teclado
 */
package repeticion_while;

import javax.swing.JOptionPane;
import java.sql.SQLOutput;

public class TablaMultiplicacion {

  public static void main(String[] args) {
      System.out.println("Programa para generear la tabla de multiplicar");
      System.out.println("Ingrese un numero");
      JOptionPane.showMessageDialog(null, "PROGRAMA PARA GENERAR UNA TABLA DE MULTIPLICAR" );
      //System.out.println("Ingrese un numero");
      String num = JOptionPane.showInputDialog("Ingrese un numero: ");
      int contador = 1;
      String acumulador = "";
      while (contador <= 10){
          int mult = Integer.parseInt(num) * contador;
         String salida = num + " X " + String.valueOf(contador) +"=" + String.valueOf(mult) + "\n";
         acumulador = acumulador +salida;
         contador = contador +1;
      }
      JOptionPane.showMessageDialog( null, acumulador);
    }
}
