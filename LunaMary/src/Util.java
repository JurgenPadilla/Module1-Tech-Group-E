public class Util {


    public Util() {

    }

    public Boolean validateSexo(String data) {
        boolean textValid = false;

        if (!data.isEmpty() && data.replace(" ", "").length() == 1 && textValid == false) {

            textValid = true;
        } else {

            textValid = false;
        }

        return textValid;
    }

}
