import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        OptionAsk optionAsk1 = new OptionAsk("Haces pasar a una chica que crees que baja después que tú…", 10, "A", false);
        OptionAsk optionAsk2 = new OptionAsk("Te pones en un rincón", 10, "B", false);
        OptionAsk optionAsk3 = new OptionAsk("Saludas a todo el mundo y te pones a hablar", 10, "C", false);
        OptionAsk optionAsk4 = new OptionAsk("Te das cuenta de que una persona anda algo tocada", 10, "D", false);

        OptionAsk optionAsk5 = new OptionAsk("Llamas a emergencias y procuras que la gente no se le agolpe", 10, "A", false);
        OptionAsk optionAsk6 = new OptionAsk("Le preguntas lo que ha pasado", 10, "B", false);
        OptionAsk optionAsk7 = new OptionAsk("Le das la mano hasta que llega ayuda", 10, "C", false);
        OptionAsk optionAsk8 = new OptionAsk("Te interesas por cómo se siente y procuras arroparla", 10, "D", false);

        List<OptionAsk> optionAskList1 = null;
        optionAskList1.add(optionAsk1);
        optionAskList1.add(optionAsk2);
        optionAskList1.add(optionAsk3);
        optionAskList1.add(optionAsk4);

        List<OptionAsk> optionAskList2 = null;
        optionAskList2.add(optionAsk5);
        optionAskList2.add(optionAsk6);
        optionAskList2.add(optionAsk7);
        optionAskList2.add(optionAsk8);


        Ask ask1 = new Ask(optionAskList1, "COMO TE COMPORTAS CUANDO ENTRAS EN UN ASCENSOR?", "P1");
        Ask ask2 = new Ask(optionAskList1, "COMO TE COMPORTAS CUANDO TE ENCUENTRAS CON UNA PERSONA QUE SE HA ACCIDENTADO EN LA CALLE?", "P1");
        List<Ask> askList = null;
        askList.add(ask1);
        askList.add(ask2);


        Menu menu = new Menu(askList);
        menu.registerPerson();
        menu.showAsks();


    }
}
