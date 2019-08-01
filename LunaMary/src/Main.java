import java.util.*;


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


        Map<String, Option> mapOption1 = new HashMap<String, Option>();
        mapOption1.put("A", option1);
        mapOption1.put("B", option2);
        mapOption1.put("C", option3);

        Map<String, Option> mapOption2 = new HashMap<String, Option>();
        mapOption2.put("A", option4);
        mapOption2.put("B", option5);
        mapOption2.put("C", option6);

        Map<String, Option> mapOption3 = new HashMap<String, Option>();
        mapOption3.put("A", option7);
        mapOption3.put("B", option8);
        mapOption3.put("C", option9);

        MultipleChoiceQuestion multipleChoiceQuestion1 = new MultipleChoiceQuestion("Cuantos lados tiene un Hexagono?", mapOption1);
        MultipleChoiceQuestion multipleChoiceQuestion2 = new MultipleChoiceQuestion("Todo Numero Multiplicado por 0 nos da?", mapOption2);
        MultipleChoiceQuestion multipleChoiceQuestion3 = new MultipleChoiceQuestion("El perimetro de un poligono se obtiene?", mapOption3);


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


        List<String> areaQuiz = new ArrayList<String>();
        for (QuizLibrary p : quizLibraryList) {
            String res = p.getType();
            areaQuiz.add(res);
        }

        boolean exit = false;
        print("Welcome to your Quiz");

        while (!exit) {

            print("Please enter an option");
            print("1. Register yourself");
            print("2. Administrar");
            print("3. Exit");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    registerPerson(personList);
                    print("The size Person is: " + personList.size());
                    break;
                case "2":
                    print("En construccion");
                    break;
                default:
                    exit = true;
            }


            while (!exit) {



                print("Please select a new Quiz");
                for (int i = 0; i < areaQuiz.size(); i++) {
                    print("" + (i + 1) + ". " + areaQuiz.get(i));
                }
                print("" + (areaQuiz.size() + 1) + ". " + "Exit");

                String optionQuiz = scanner.nextLine();
                switch (optionQuiz) {
                    case "1":
                        showQuiz("Matematico", quizLibraryList);
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
        Integer age = Integer.valueOf(scanner.nextLine());
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
                quiz = quizListRes.get(0);
                List<IQuestion> iQuestionList = quiz.getiQuestions();
                for (IQuestion i : iQuestionList) {
                    print(i.display());
                    String optionAnswer = scanner.nextLine();
                    i.saveAnswer(optionAnswer);
                }
            }

        }

        print("mostradndo pregunstas");
    }

//    private static Quiz selectRandomQuiz(List<Quiz> quizList) {
//
//        return quizList.get(quizList.size() - 1);
//
//    }


}
