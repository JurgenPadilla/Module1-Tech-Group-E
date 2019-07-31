import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void print(String something) {
        System.out.println(something);
    }

    public static void main(String[] args) {


        Option option1 = new Option("11 Lados", 0);
        Option option2 = new Option("7 lados", 0);
        Option option3 = new Option("6 lados", 10);

        Option option4 = new Option("0", 0);
        Option option5 = new Option("1", 0);
        Option option6 = new Option("0,01", 10);

        Option option7 = new Option("Multiplicando por Dos", 0);
        Option option8 = new Option("Sumando los lados", 10);
        Option option9 = new Option("Lado al cuadrado", 0);


        List<Option> optionList1 = new ArrayList<Option>();
        optionList1.add(option1);
        optionList1.add(option2);
        optionList1.add(option3);

        List<Option> optionList2 = new ArrayList<Option>();
        optionList2.add(option4);
        optionList2.add(option5);
        optionList2.add(option6);

        List<Option> optionList3 = new ArrayList<Option>();
        optionList2.add(option7);
        optionList2.add(option8);
        optionList2.add(option9);

        MultipleChoiceQuestion multipleChoiceQuestion1 = new MultipleChoiceQuestion("Cuantos lados tiene un Hexagono?", optionList1);
        MultipleChoiceQuestion multipleChoiceQuestion2 = new MultipleChoiceQuestion("Todo Numero Multiplicado por 0 nos da?", optionList2);
        MultipleChoiceQuestion multipleChoiceQuestion3 = new MultipleChoiceQuestion("El perimetro de un poligono se obtiene?", optionList3);


        List<IQuestion> iQuestionsMath1 = new ArrayList<IQuestion>();
        iQuestionsMath1.add(multipleChoiceQuestion1);
        iQuestionsMath1.add(multipleChoiceQuestion2);
        iQuestionsMath1.add(multipleChoiceQuestion3);

        Quiz quizMath1 = new Quiz(iQuestionsMath1, 20);

        //Pregunta literal
        LiteralQuestion literalQuestion1 = new LiteralQuestion("cuantos lados tiene un cuadrado?");
        LiteralQuestion literalQuestion2 = new LiteralQuestion("Que figuras geometricas conoces?");

        List<IQuestion> iQuestionsMath2 = new ArrayList<IQuestion>();
        iQuestionsMath1.add(literalQuestion1);
        iQuestionsMath1.add(literalQuestion2);

        Quiz quizMath2 = new Quiz(iQuestionsMath2, 7);


        List<Quiz> quizListMath = new ArrayList<Quiz>();
        quizListMath.add(quizMath1);
        quizListMath.add(quizMath2);

        QuizLibrary quizLibraryMath = new QuizLibrary(quizListMath, "Matematico");
        QuizLibrary quizLibraryHist = new QuizLibrary();
        QuizLibrary quizLibraryBio = new QuizLibrary();

        List<QuizLibrary> quizLibraryList = new ArrayList<QuizLibrary>();
        quizLibraryList.add(quizLibraryMath);
        quizLibraryList.add(quizLibraryHist);
        quizLibraryList.add(quizLibraryBio);

        List<AnswerPerson> answerPeople = new ArrayList<AnswerPerson>();


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
