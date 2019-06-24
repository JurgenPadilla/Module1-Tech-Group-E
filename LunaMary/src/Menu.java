import java.util.List;
import java.util.Scanner;


class Menu {

    List<Ask> askList;
    Person person;
    Scanner teclado = new Scanner(System.in);
    private String nombre;
    private Integer edad;
    private String sexo;


    public Menu(List<Ask> askList) {
        this.askList = askList;

    }

    public void registerPerson() {

        System.out.println("Para iniciar el test responde las siguientes preguntas");
        System.out.println("Ingresa tu nombre completo? ");
        nombre = teclado.nextLine();
        System.out.println("¡Hola " + nombre + "!");
        System.out.println("Ingresa tu edad? ");
        edad = teclado.nextInt();
        System.out.println("Ingresa tu sexo  F  o  M ? ");
        sexo = teclado.nextLine();
        person = new Person();
        person.setNamePerson(nombre);
        person.setAgePerson(edad);
        person.setSexPerson(sexo);

    }

    public void showPerson() {

        System.out.println("Nombre: " + person.retrieveNamePerson());
        System.out.println("Edad: " + person.getAgePerson());

    }

    public void showAsks() {


    }


}

