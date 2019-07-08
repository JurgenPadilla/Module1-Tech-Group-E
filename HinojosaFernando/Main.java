public class Main {

    public static void main(String[] args) {
        OurStringArrayList myList = new OurStringArrayList(12);
        myList.add("around");
        myList.add("the");
        myList.add("world");
        myList.add("!");

        myList.remove();
        // region evaluation
        Integer accumulator = 0;
        if (myList.size() == 3) accumulator += 10;
        if (myList.get(2).equals("world")) accumulator += 10;
        if (myList.get(3) == null) accumulator += 10;
        if (!myList.contains("hello") && myList.contains("the")) accumulator += 10;
        if (myList.toString().equals("[around the world]") ) accumulator += 10;

        System.out.println(myList.toString());
        System.out.println((accumulator*2) + "/100");
        // endregion
    }
}

