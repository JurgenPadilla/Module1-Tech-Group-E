import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void print(String something) {
        System.out.println(something);
    }

    public static void main(String[] args) {

        TypeQuiz typeQuizPsic = new TypeQuiz("Psicologico");
        TypeQuiz typeQuizMath = new TypeQuiz("Matematico");


        Option option1 = new Option("Haces pasar a una chica que crees que baja después que tú…", 10, "A", false);
        Option option2 = new Option("Te pones en un rincón", 10, "B", false);

        Option option3 = new Option("Llamas a emergencias y procuras que la gente no se le agolpe", 10, "A", false);
        Option option4 = new Option("Le preguntas lo que ha pasado", 10, "B", false);


        List<Option> optionList1 = new ArrayList<Option>();
        optionList1.add(option1);
        optionList1.add(option2);

        List<Option> optionList2 = new ArrayList<Option>();
        optionList2.add(option3);
        optionList2.add(option4);


        SelectedQuiz selectedQuiz1 = new SelectedQuiz("COMO TE COMPORTAS CUANDO ENTRAS EN UN ASCENSOR?", optionList1);
        SelectedQuiz selectedQuiz2 = new SelectedQuiz("COMO TE COMPORTAS CUANDO TE ENCUENTRAS CON UNA PERSONA QUE SE HA ACCIDENTADO EN LA CALLE?", optionList2);

        LiteralQuiz literalQuiz = new LiteralQuiz("Que opinas sobre la tecnologia");



        //Lista para Personas
        List<Person> personList = new ArrayList<Person>();

        boolean exit = false;
        print("Welcome to your Quiz");

        while (!exit) {

            print("Please enter an option");
            print("1. Register yourself");
            print("2. Exit");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    registerPerson(personList);
                    print("The size of your dex is: " + personList.size());
                    break;
                default:
                    exit = true;
            }


            while (!exit) {
                print("Please select a new Quiz");
                print("1. Psicologico");
                print("2. Matematico");
                print("2. Exit");
                String optionQuiz = scanner.nextLine();
                switch (optionQuiz) {
                    case "1":
                        showQuiz(typeQuizPsic);
                        break;
                    case "2":
                        showQuiz(typeQuizMath);
                        break;
                    default:
                        exit = true;
                }


            }
        }


    }


    private static void registerPerson(List<Person> personList) {
        print("Ingresa tu nombre? ");
        String name = scanner.nextLine();
        print("Ingresa tu edad? ");
        String age = scanner.nextLine();
        print("Ingresa tu sexo  Ejemplo: F  o  M ? ");
        String sex = scanner.nextLine();

        Person person = new Person();
        person.setNamePerson(name);
        person.setAgePerson(age);
        person.setSexPerson(sex);
        personList.add(person);

    }

    private static void showQuiz(TypeQuiz typeQuiz) {

        print("mostradndo pregunstas");
    }


}
