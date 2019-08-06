import java.util.*;


public class Main {

    private static Util util = new Util();
    private static List<Quiz> quizListSelected;

    private static Scanner scanner = new Scanner(System.in);

    public static void print(String something) {
        System.out.println(something);
    }

    public static void main(String[] args) {


        Option option1 = new Option("11 Lados", 5);
        Option option2 = new Option("7 lados", 10);
        Option option3 = new Option("6 lados", 15);

        Option option4 = new Option("0", 20);
        Option option5 = new Option("1", 25);
        Option option6 = new Option("0,01", 30);

        Option option7 = new Option("Multiplicando por Dos", 1);
        Option option8 = new Option("Sumando los lados", 2);
        Option option9 = new Option("Lado al cuadrado", 3);


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
        iQuestionsMath2.add(literalQuestion1);
        iQuestionsMath2.add(literalQuestion2);

        Quiz quizMath2 = new Quiz(iQuestionsMath2, 7);


        List<Quiz> quizListMath = new ArrayList<Quiz>();
        quizListMath.add(quizMath1);
        quizListMath.add(quizMath2);

        QuizLibrary quizLibraryMath = new QuizLibrary(quizListMath, "Matematico");

        List<QuizLibrary> quizLibraryList = new ArrayList<QuizLibrary>();
        quizLibraryList.add(quizLibraryMath);

        List<AnswerPerson> answerPeople = new ArrayList<AnswerPerson>();


        //Lista para Personas
        List<Person> personList = new ArrayList<Person>();

        //List para respuestas
        List<AnswerPerson> answers = new ArrayList<AnswerPerson>();

        List<String> areaQuiz = new ArrayList<String>();
        for (QuizLibrary p : quizLibraryList) {
            String res = p.getType();
            areaQuiz.add(res);
        }

        boolean exit = false;
        print("Welcome to your Quiz");

        while (!exit) {

            print("Please enter an option");
            print("1. Start quiz");
            print("2. Manage");
            print("3. Exit");
            Integer option = Integer.valueOf(scanner.nextLine());
            if (option == 1) {
                print("Register yourself");

            } else {

                if (option == 2) {
                    print("Please select a type Quiz");

                }

            }

            switch (option) {
                case 1:
                    registerPerson(personList, answers);
                    print("The size Person is: " + personList.size());


                    for (QuizLibrary p : quizLibraryList) {
                        String res = p.getType();
                        areaQuiz.add(res);
                    }

                    print("Please select a new Quiz");
                    for (int i = 0; i < areaQuiz.size(); i++) {
                        print("" + (i + 1) + ". " + areaQuiz.get(i));
                    }

                    print("" + (areaQuiz.size() + 1) + ". " + "Exit");

                    Integer lastOption1 = Integer.valueOf(String.valueOf((areaQuiz.size() + 1)));
                    Integer optionQuiz = Integer.valueOf(scanner.nextLine());

                    String optionSelect1 = areaQuiz.get(optionQuiz - 1);

                    for (QuizLibrary p : quizLibraryList) {
                        String res = p.getType();
                        if (res == optionSelect1) {
                            quizListSelected = p.getQuizList();
                        }
                    }


                    if (optionQuiz == lastOption1) {
                        print("Gracias hasta la proxima!");

                    } else {
                        String optionSelect = areaQuiz.get(optionQuiz - 1);


                        showQuiz(optionSelect, quizLibraryList, answers);
                    }


                    break;
                case 2:

                    for (int i = 0; i < areaQuiz.size(); i++) {
                        print("" + (i + 1) + ". " + areaQuiz.get(i));
                    }

                    Integer lastOption = Integer.valueOf(String.valueOf((areaQuiz.size() + 1)));
                    print(lastOption + ". " + "New Type");
                    Integer typeQuiz = Integer.valueOf(scanner.nextLine());
                    if (typeQuiz == lastOption) {
                        print("Enter new type example: English");
                        String newTypeQuiz = scanner.nextLine();
                        createNewCollectionQuiz(newTypeQuiz);
                    } else {
                        String optionSelect = areaQuiz.get(typeQuiz - 1);
                        List<Quiz> quizList = null;
                        for (QuizLibrary p : quizLibraryList) {
                            String res = p.getType();
                            if (res == optionSelect) {
                                quizList = p.getQuizList();
                            }
                        }


                        AddNewQuizToCollection(quizList);
                    }


                    break;
                default:
                    exit = true;
            }


        }


    }


    private static void registerPerson(List<Person> personList, List<AnswerPerson> answerPersonList) {
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
        AnswerPerson answerPerson = new AnswerPerson(null, person);
        answerPersonList.add(answerPerson);

    }

    private static void showQuiz(String type, List<QuizLibrary> quizLibraryList, List<AnswerPerson> answerPersonList) {

        List<Quiz> quizListRes;
        Quiz quiz;
        for (QuizLibrary p : quizLibraryList) {
            if (type.equals(p.getType())) {
                quizListRes = p.getQuizList();
                quiz = selectRandomQuiz(quizListRes);
                if (null == answerPersonList.get(answerPersonList.size() - 1).getQuiz()) {
                    answerPersonList.get(answerPersonList.size() - 1).setQuiz(quiz);
                } else {
                    Person person = answerPersonList.get(answerPersonList.size() - 1).getPerson();
                    answerPersonList.add(new AnswerPerson(quiz, person));
                }

                List<IQuestion> iQuestionList = quiz.getiQuestions();
                for (IQuestion i : iQuestionList) {
                    System.out.print(i.display());
                    System.out.print("Answer: ");
                    String optionAnswer = scanner.nextLine();
                    System.out.println();
                    answerPersonList.get(answerPersonList.size() - 1).saveNota(i.getNotaAnswer(optionAnswer));
                }
                System.out.println("Nota: " + answerPersonList.get(answerPersonList.size() - 1).getNota());
            }

        }

        print("mostrando pregunstas");
        System.out.println();
    }

    private static Quiz createNewQuiz(Integer limit) {

        Integer countQuestions = readInteger("Ingrese cantidad de preguntas que desea añadir");
        List<IQuestion> iQuestionsList = new ArrayList<IQuestion>();
        for (int j = 0; j < countQuestions; j++) {
            String newOptionAnswer = readString("Añada la pregunta No. " + (j + 1) + " para este Quiz.");

            Map<String, Option> mapOption = new HashMap<String, Option>();
            Integer countOptions = readInteger("Ingrese la cantidad de opciones para esta preguntas que desea añadir");
            for (int h = 0; h < countOptions; h++) {

                Option option = new Option(readString("Añada una opcion"), readInteger("Añada un puntaje para esta opcion"));
                char sigla = util.generateSigla(h);
                mapOption.put(String.valueOf(sigla), option);


            }
            IQuestion iQuestion =
                    new MultipleChoiceQuestion(newOptionAnswer, mapOption);
            iQuestionsList.add(iQuestion);
        }
        Quiz newQuiz = new Quiz(iQuestionsList, limit);
        return newQuiz;
    }


    private static void createNewCollectionQuiz(String type) {
        print("creando nueva coleccion");
        Integer limit = readInteger("Ingrese una edad minima requerida para este quiz");
        Quiz quizNew = createNewQuiz(limit);

        List<Quiz> quizListNew = new ArrayList<Quiz>();
        quizListNew.add(quizNew);


        QuizLibrary newQuizLibrary = new QuizLibrary(quizListNew, type);

        List<QuizLibrary> quizLibraryList = new ArrayList<QuizLibrary>();
        quizLibraryList.add(newQuizLibrary);


    }

    private static void AddNewQuizToCollection(List<Quiz> list) {
        print("anadiendo nueva quiz coleccion");
        List<Quiz> quizList = list;
        Integer limit = readInteger("Ingrese una edad minima requerida para este quiz");
        Quiz quizNew = createNewQuiz(limit);
        quizList.add(quizNew);


    }

    private static Quiz selectRandomQuiz(List<Quiz> quizList) {
        Integer cant = (int) (Math.random() * quizList.size());

        return quizList.get(cant * 0);

    }

    static String readString(String text) {
        print(text);
        String option = scanner.nextLine();
        return option;
    }

    static Integer readInteger(String text) {
        print(text);
        Integer score = Integer.valueOf(scanner.nextLine());
        return score;


    }


}
