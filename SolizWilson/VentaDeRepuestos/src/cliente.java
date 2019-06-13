import java.util.Scanner;

public class cliente {
    public static void main(String[] args) {


        System.out.printf("BIENVENIDO AL SISTEMA DE REGISTRO DE NUEVO CLIENTE \n");

        Scanner objeto_aceptar= new Scanner((System.in));
        System.out.println("Si Desea continuar con su registro introdusca la palabra (SI) \n");
        String aceptar=objeto_aceptar.nextLine();

        System.out.println("Introdusca los campos requeridos para su correcto registro");

        Scanner objeto_cliente=new Scanner(System.in);
        System.out.println("Introdusca nombre completo");
        String nombres =objeto_cliente.nextLine();
        System.out.println("Su nombre es Sr(a)" + nombres);

        System.out.println("Introdusca telefono de referencia");
        int celular=objeto_cliente.nextInt();
        System.out.println("Su num de celular es \n" + celular);

        System.out.println("Introdusca su direccion");
        String direccion=objeto_cliente.nextLine();
        System.out.println("Su direccion de referencia \n" + direccion);

        System.out.println("Introdusca algunas referencias mas");
        String descripcion=objeto_cliente.nextLine();
        System.out.println("\n"+ direccion);

    }
}
