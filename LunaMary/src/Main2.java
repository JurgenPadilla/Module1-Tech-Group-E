import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void print(String something) {
        System.out.println(something);
    }

    public static void main(String[] args) {

        TypeQuiz typeQuizPsic = new TypeQuiz("Psicologico");
        TypeQuiz typeQuizMath = new TypeQuiz("Matematico");


        Option option1 = new Option("Haces pasar a una chica que crees que baja después que tú…", 10, Sigla.A, false);
        Option option2 = new Option("Te pones en un rincón", 10, Sigla.B, false);

        Option option3 = new Option("Llamas a emergencias y procuras que la gente no se le agolpe", 10, Sigla.A, false);
        Option option4 = new Option("Le preguntas lo que ha pasado", 10, Sigla.B, false);


        List<Option> optionList1 = new ArrayList<Option>();
        optionList1.add(option1);
        optionList1.add(option2);

        List<Option> optionList2 = new ArrayList<Option>();
        optionList2.add(option3);
        optionList2.add(option4);


        MultipleChoiceQuestion multipleChoiceQuestion1 = new MultipleChoiceQuestion("COMO TE COMPORTAS CUANDO ENTRAS EN UN ASCENSOR?", optionList1);
        MultipleChoiceQuestion multipleChoiceQuestion2 = new MultipleChoiceQuestion("COMO TE COMPORTAS CUANDO TE ENCUENTRAS CON UNA PERSONA QUE SE HA ACCIDENTADO EN LA CALLE?", optionList2);

        LiteralQuestion literalQuestion = new LiteralQuestion("Que opinas sobre la tecnologia");

        List<IQuestion> iQuestions1 = new ArrayList<IQuestion>();
        iQuestions1.add(multipleChoiceQuestion1);

        List<IQuestion> iQuestions2 = new ArrayList<IQuestion>();
        iQuestions2.add(multipleChoiceQuestion2);

        Quiz quiz1 = new Quiz(iQuestions1, typeQuizPsic);
        Quiz quiz2 = new Quiz(iQuestions2, typeQuizPsic);

        List<Quiz> quizList = new ArrayList<Quiz>();
        quizList.add(quiz1);
        quizList.add(quiz2);

        List<AnswerPerson> answerPeople = new ArrayList<AnswerPerson>();

        QuizLibrary quizLibrary1 = new QuizLibrary(quizList, answerPeople, "Psicologico");
        QuizLibrary quizLibrary2 = new QuizLibrary(quizList, answerPeople, "Matematico");

        List<QuizLibrary> quizLibraryList = new ArrayList<QuizLibrary>();
        quizLibraryList.add(quizLibrary1);
        quizLibraryList.add(quizLibrary2);


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
                    print("The size Person is: " + personList.size());
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
                        showQuiz("Psicologico", quizLibraryList);
                        break;
                    case "2":
                        showQuiz("Psicologico", quizLibraryList);
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

    private static void showQuiz(String type, List<QuizLibrary> quizLibraryList) {

        List<Quiz> quizListRes;
        Quiz quiz;
        for (QuizLibrary p : quizLibraryList) {

            if (type.equals(p.getType())) {
                quizListRes = p.getQuizList();
                quiz = selectRandomQuiz(quizListRes);
                List<IQuestion> lisIQuiz = quiz.getiQuestions();
                for (IQuestion i : lisIQuiz) {
                    print(i.display());
                    String optionAnswer = scanner.nextLine();
                    i.saveAnswer(optionAnswer);
                }
            }

        }

        print("mostradndo pregunstas");
    }

    private static Quiz selectRandomQuiz(List<Quiz> quizList) {

        return quizList.get(quizList.size() - 1);

    }


}
