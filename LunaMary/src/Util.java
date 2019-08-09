import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {


    public Util() {

    }

    public Boolean validateSexo(String data) {
        boolean textValid = false;

        if (!data.isEmpty() && data.trim().length() == 1 && textValid == false) {

            textValid = true;
        }

        return textValid;
    }

    public static char generateSigla(Integer num) {
        char sigla = 'A';
        sigla = (char) ('A' + num);
        return sigla;
    }

    public static String validateAnswerChar(String a, Integer cant) {
        String option = "";
        if (a.length() == 1) {
            Pattern p = Pattern.compile("[a-zA-Z]");
            Matcher m = p.matcher(a.trim());

            if (m.find() && validateOption(a, cant)) {
//            if( validateOption(a,cant)){
                option = a;

            } else {
                System.out.println("Please enter option validate .... ");
            }
        }
        return option;
    }

    public static boolean validateOption(String a, Integer cant) {
        boolean resp = false;
        int i = 0;
        while (i < cant) {
            char sigla = (char) ('A' + i);
            String character = (sigla + "");
            if (a.equalsIgnoreCase(character)) {
                resp = true;
                i = cant;

            } else {
                i++;
            }
        }
        return resp;
    }

    // public Boolean validateNumbers()

}

