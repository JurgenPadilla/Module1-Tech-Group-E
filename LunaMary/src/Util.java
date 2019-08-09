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

    // public Boolean validateNumbers()

}

