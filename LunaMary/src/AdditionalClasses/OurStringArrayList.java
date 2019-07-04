package AdditionalClasses;

public class OurStringArrayList {
    String[] list;
    Integer length;
    Integer position;

    public OurStringArrayList(Integer length) {
        this.length = length;
        this.list = new String[length];
        this.position = 0;

    }

    public void add(String text) {
        list[position] = text;
        position++;
    }

    public void remove(Integer position) {
        list[position] = "";
    }

    public Integer size() {
        Integer size = 0;
        for (int i = 0; i < length; i++) {
            if (list[i] != null) {
                size++;
            }

        }
        return size;

    }

    public String get(Integer position) {
        String text = "";
        text = list[position];
        return text;
    }

    public String toString() {
        String text = "";
        for (int i = 0; i < position; i++) {
            text = text + " " + list[position];
        }

        return text;
    }

    public Boolean contains(String text) {
        Boolean res = false;
        String resText;
        Integer i = 0;
        while (i < position) {
            resText = list[i];
            if (resText == text) {
                res = true;
                break;
            }
            i++;
        }
        return res;

    }
}
