package semana_5;

public class ClaseConMetodoSinRetornoDeValor {
    public static void main(String[] args) {
        //Crear una variable a partir de nuestra clase
        //ClaseConMetodoSinRetornoDeValor llamado = new ClseConMetodoSInRetornoDeValor();
        //llamada.saludar();
        //saludar_con_nombre("Andy");
        saludar( "Andy", 12  );
    }
    public static void saludar(){
        System.out.println("Bien Venido a la creacion de metdodos");
        System.out.println("metodo creado en java");
    }
    public static void saludar_con_nombres(String nombre){
        System.out.println("Bien venid@"+nombre.toUpperCase()+"A la creacion de metodos");
        System.out.println("Metodo creado en java");
    }
    public static void saludar(String nombre, int edad){
        System.out.println("Bien venid@"+nombre.toUpperCase()+"A la creacion de metodos");
        System.out.println("Metodo creado en java");
    }
}
