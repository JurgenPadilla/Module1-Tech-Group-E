import AdditionalClasses.OurStringArrayList;

public class Main {

    public static void main(String[] args) {
        /**
         * Instructions.
         * Add the necessary classes and methods to compile and run the project.
         * This file cannot be changed, not a single word or symbol. If you do, don't worry I'll notice.
         * You are not allowed to use ArrayList<> class.
         * Tip: Use String[] and create a wrapper for it.
         * Ask your classmates or me, if you have any question, doubt or need any help.
         *
         * You must send a pull request to the repository with your solution until Wednesday morning.
         * Good luck and don't forget to have fun!
         */

        OurStringArrayList myList = new OurStringArrayList(12);
        myList.add("around");
        myList.add("the");
        myList.add("world");
        myList.add("!");

        myList.remove(3);

        // region evaluation
        Integer accumulator = 0;
        if (myList.size() == 3) accumulator += 10;
        if (myList.get(2).equals("world")) accumulator += 10;
        if (myList.get(3) == null) accumulator += 10;
        if (myList.toString().equals("[around the world]") ) accumulator += 10;
        if (!myList.contains("hello") && myList.contains("the")) accumulator += 10;

        System.out.println((accumulator*2) + "/100");
        // endregion
    }
}
