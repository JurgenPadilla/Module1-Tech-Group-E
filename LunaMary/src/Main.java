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
        //registrarListQuiz(iQuestionsMath1);
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
            Integer option = readInteger("Option Selected: ");


            System.out.println();
            if (option == 1) {
                print("Register yourself");

            } else {

                if (option == 2) {
                    print("Please select a type Quiz");

                } else {
                    print("see you soon!");
                    exit = true;
                }


            }

            switch (option) {
                case 1:
                    registerPerson(personList, answers);
                    print(personList.size() + " You registration was successfully completed!");


                    for (QuizLibrary p : quizLibraryList) {
                        String res = p.getType();
                        // areaQuiz.add(res);
                    }
                    print("");
                    Integer optionQuiz = new Integer(0);
                    while (optionQuiz == 0) {
                        print("**** Please select a new Quiz ****");
                        for (int i = 0; i < areaQuiz.size(); i++) {
                            print("" + (i + 1) + ". " + areaQuiz.get(i));
                        }

                        print("" + (areaQuiz.size() + 1) + ". " + "Exit");

                        optionQuiz = readInteger("Option Selected: ");
                    }
                    String optionSelect1 = areaQuiz.get(optionQuiz - 1);

                    for (QuizLibrary p : quizLibraryList) {
                        String res = p.getType();
                        if (res == optionSelect1) {
                            quizListSelected = p.getQuizList();
                        }
                    }


                    if (optionQuiz == Integer.valueOf(String.valueOf((areaQuiz.size() + 1)))) {
                        print("Thanks,  see you next oportunity");

                    } else {
                        String optionSelect = areaQuiz.get(optionQuiz - 1);
                        print("");
                        print("---- Please read the questions carefully ----");
                        print("");
                        showQuiz(optionSelect, quizLibraryList, answers);
                    }


                    break;
                case 2:
                    Integer typeQuiz = new Integer(0);
                    while (typeQuiz == 0) {
                        for (int i = 0; i < areaQuiz.size(); i++) {
                            print("" + (i + 1) + ". " + areaQuiz.get(i));
                        }

                        Integer lastOption = Integer.valueOf(String.valueOf((areaQuiz.size() + 1)));
                        print(lastOption + ". " + "New Type");
                        typeQuiz = readInteger("Option Selected: "); //Integer.valueOf(scanner.nextLine());
                        if (typeQuiz == lastOption) {
                            print("Enter new type example: English");
                            String newTypeQuiz = scanner.nextLine();
                            createNewCollectionQuiz(newTypeQuiz, areaQuiz, quizLibraryList);
                        } else if (typeQuiz != 0) {
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


                    }
                    break;

                case 0:
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
        Integer age = new Integer(0);
        while (age == 0) {
            age = readInteger("Age: ");
        }
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
                    String optionAnswer = "";
                    while (optionAnswer.isEmpty()) {
                        System.out.print(i.display());
                        System.out.print("Answer: ");
                        optionAnswer = util.validateAnswerChar(scanner.nextLine(), iQuestionList.size());
                        System.out.println();
                        answerPersonList.get(answerPersonList.size() - 1).saveNota(i.getNotaAnswer(optionAnswer));
                    }
                }
                print("*****************************************");
                print("Score: " + answerPersonList.get(answerPersonList.size() - 1).getNota());
                print("*****************************************");
            }

        }


        System.out.println();
    }

    private static Quiz createNewQuiz(Integer limit) {

        Integer countQuestions = readInteger("Enter the number of questions you want to add: ");
        List<IQuestion> iQuestionsList = new ArrayList<IQuestion>();
        for (int j = 0; j < countQuestions; j++) {
            String newOptionAnswer = readString("Add question No. " + (j + 1) + " to this Quiz.");

            Map<String, Option> mapOption = new HashMap<String, Option>();
            Integer countOptions = readInteger("Enter the number of options for this question that you want to add: ");
            for (int h = 0; h < countOptions; h++) {

                Option option = new Option(readString("Add a option: "), readInteger("Add score to this option: "));
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


    private static void createNewCollectionQuiz(String type, List<String> listsAreaQuiz, List<QuizLibrary> listLibrary) {
        print("");
        print("You will create new collection to area " + type);
        Integer limit = new Integer(0);
        while (limit == 0) {
            limit = readInteger("Enter a minimum age required for this quiz: ");
        }
        Quiz quizNew = createNewQuiz(limit);

        List<Quiz> quizListNew = new ArrayList<Quiz>();
        quizListNew.add(quizNew);


        QuizLibrary newQuizLibrary = new QuizLibrary(quizListNew, type);

        listLibrary.add(newQuizLibrary);
        listsAreaQuiz.add(type);


    }

    private static void AddNewQuizToCollection(List<Quiz> list) {
        print("adding new quiz to existing collection");
        List<Quiz> quizList = list;
        Integer limit = readInteger("Enter a minimum age required for this quiz: ");
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
        System.out.print(text);
        Integer dateNumeric = new Integer(0);
        String response = scanner.nextLine();
        try {
            dateNumeric = Integer.parseInt(response);
        } catch (Exception e) {
            print("Data incorrect, please insert an number correct .... ");
            print("");
        }

        //Integer score = Integer.valueOf(scanner.nextLine());
        return dateNumeric;


    }

    static MultipleChoiceQuestion registerMultipleChoiceQuestion() {
        print("Enter the title of the question: ");
        String title = scanner.nextLine();
        Boolean quit = new Boolean("true");
        print("Enter the answer options for the question: ");
        Integer i = new Integer(0);
        Map<String, Option> mapOptions = new HashMap<String, Option>();
        while (quit) {
            System.out.print("Enter the option " + util.generateSigla(i) + " : ");
            String op = scanner.nextLine();
            System.out.print("Enter score: ");
            Integer value = new Integer((int) (scanner.nextInt()));
            Option option = new Option(op, value);
            mapOptions.put(util.generateSigla(i) + "", option);
            i++;
            System.out.print("Do you want to exit the option log(yes(y)/no(n))? ");
            String resp = scanner.nextLine();
            quit = ("y".equalsIgnoreCase(resp)) ? true : false;

        }
        MultipleChoiceQuestion question = new MultipleChoiceQuestion(title, mapOptions);
        System.out.println();
        return question;
    }

    public static void registrarListQuiz(List<IQuestion> listQ) {
        Boolean respList = new Boolean("true");
        while (respList) {
            listQ.add(registerMultipleChoiceQuestion());
            // System.out.print("Desea salir del registro de preguntas(si(s)/no(n))? ");
            // String resp = scanner.nextLine();
            // respList= ("s".equalsIgnoreCase(resp))?true:false;
        }
    }


}
