public class OurStringArrayList {
    private String[] collection;
    private Integer position;

    public OurStringArrayList(Integer size) {
        collection = new String[size];
        this.position = 0;
    }

    public void add(String name) {
        collection[position] = name;
        position++;
    }

    public void remove() {
        collection[position - 1] = null;
        position--;
    }

    public Integer size() {
        return position;
    }

    public String get(Integer position) {
        if (position <= this.position) {
            return collection[position];
        }
        return null;

    }

    public Boolean contains(String searchTerm) {
        for (int i = 0; i < position - 1; i++) {
            if (collection[i].equals(searchTerm)) {
                return true;
            }
        }

        return false;
    }

    public String toString() {
        String result = collection[0];
        for (int i = 1; i < position; i++) {

            result = result + " " + collection[i];
        }

        return "["+result+"]";
    }

}
