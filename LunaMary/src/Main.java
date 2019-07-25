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



        // SelectedQuiz selectedQuiz1 = new SelectedQuiz("Haces pasar a una chica que crees que baja después que tú…", 10, "A", false);
//        SelectedQuiz selectedQuiz2 = new SelectedQuiz("Te pones en un rincón", 10, "B", false);
//        SelectedQuiz selectedQuiz3 = new SelectedQuiz("Saludas a todo el mundo y te pones a hablar", 10, "C", false);
//        SelectedQuiz selectedQuiz4 = new SelectedQuiz("Te das cuenta de que una persona anda algo tocada", 10, "D", false);
//
//        SelectedQuiz selectedQuiz5 = new SelectedQuiz("Llamas a emergencias y procuras que la gente no se le agolpe", 10, "A", false);
//        SelectedQuiz selectedQuiz6 = new SelectedQuiz("Le preguntas lo que ha pasado", 10, "B", false);
//        SelectedQuiz selectedQuiz7 = new SelectedQuiz("Le das la mano hasta que llega ayuda", 10, "C", false);
//        SelectedQuiz selectedQuiz8 = new SelectedQuiz("Te interesas por cómo se siente y procuras arroparla", 10, "D", false);
//
//        List<SelectedQuiz> selectedQuizList1 = null;
//        selectedQuizList1.add(selectedQuiz1);
//        selectedQuizList1.add(selectedQuiz2);
//        selectedQuizList1.add(selectedQuiz3);
//        selectedQuizList1.add(selectedQuiz4);
//
//        List<SelectedQuiz> selectedQuizList2 = null;
//        selectedQuizList2.add(selectedQuiz5);
//        selectedQuizList2.add(selectedQuiz6);
//        selectedQuizList2.add(selectedQuiz7);
//        selectedQuizList2.add(selectedQuiz8);
//
//
//        Quiz quiz1 = new Quiz(selectedQuizList1, "COMO TE COMPORTAS CUANDO ENTRAS EN UN ASCENSOR?", "P1");
//        Quiz quiz2 = new Quiz(selectedQuizList1, "COMO TE COMPORTAS CUANDO TE ENCUENTRAS CON UNA PERSONA QUE SE HA ACCIDENTADO EN LA CALLE?", "P1");
//        List<Quiz> quizList = null;
//        quizList.add(quiz1);
//        quizList.add(quiz2);


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
