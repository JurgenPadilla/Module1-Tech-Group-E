package hanged;


import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;

public class hanged {

    public static void main(String[] args) {

        // create array of words
        String [] words = {"Sing","Dance","Drink"};

        // We need a random location

        int randomLocation = (int)Math.floor(Math.random()*(words.length - 1));

        // Find the secret word
        String word = words [randomLocation];


        // create an array de letters  , this convert a string to array of letters

        System.out.println(word);

        char [] letters = word.toCharArray();
        char [] lettersWithScripts = new char [letters.length];
        // Palabra a mostrar sera en guiones usaremos ciclos para poder eso en este caso FOR

        for(int i = 0; i<letters.length; i++) {
            lettersWithScripts[i] = '_';
            System.out.println(lettersWithScripts);

            // using booleans
        //    boolean Win = false;

            //    while (Win == false) {
                    // creating a cycle with while
                System.out.println("Insert a letter"); // we need insert a letter
                Scanner reader = new Scanner(System.in);
                char insertedLetter = reader.next().charAt(0);  // of the string catch the first letter

                // we use a cycle and verify if the letter inserted appears in letters
                for (int i1 = 0; i1 < letters.length; i1++) {
                    if (letters[i1] == insertedLetter) {
                        lettersWithScripts[i] = insertedLetter;
                    }
                }

       //       if  (Arrays.equals(letters = lettersWithScripts )){
        //            System.out.println("Victory");

                }
                System.out.println("lettersWithScripts");
            }
        }




