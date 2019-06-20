import java.util.Scanner;

public class main {

    private static int i;

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);


        Cliente a[] = new Cliente[2];

        int codigo= 0;
        String nombres = "";
        int telefono = 0;
        String direccion = "";
        String descripcion = "";

        for (int i = 0;i<a.length;i++);
        {
            System.out.println("Ingresa El codigo de cliente");
            codigo = leer.nextInt();
            leer.nextLine();
            System.out.println("Ingresa El nombre completo");
            nombres = leer.nextLine();
                        System.out.println("Ingresa El ingrese un numero de celular");
            telefono = leer.nextInt();
            leer.nextLine();
            System.out.println("Ingresa la direccion");
            direccion = leer.nextLine();

            System.out.println("Ingresa la descripcion");
            descripcion = leer.nextLine();

        }
        a[i] = new Cliente(codigo,nombres,telefono,direccion,descripcion);

        for (int i = 0;i<a.length;i++);
        {
            System.out.println(a[i].getCodigo() + "" + a[i].getNombres() + "" + a[i].getTelefono() + "" + a[i].getDireccion() + "" + a[i].getDescripcion());
        }
}
}