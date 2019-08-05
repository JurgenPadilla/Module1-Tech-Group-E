
import java.util.Scanner;
import java.io.File;

public class RandomMovie {
    File importFile;
    Scanner scanner;
    int randomMovie;
    public String nameMovie;
    public String maskMovie;
 public void importScanner ()throws Exception {
     int countLines=0;
         importFile = new File ("movies.txt" );
         scanner = new Scanner (importFile);
         while (scanner.hasNextLine()){
             String line = scanner.nextLine();
              countLines = countLines +1;
         }
     randomMovie= (int) (Math.random()*(countLines)+1) ;
 }

 public String getMovie()throws Exception {
     int countAuxMovie = 0;

     importFile = new File("movies.txt");
     Scanner scanner1 = new Scanner(importFile);
     while (scanner1.hasNextLine()) {
         String line = scanner1.nextLine();
         countAuxMovie = countAuxMovie + 1;
         if (randomMovie == countAuxMovie) {
             nameMovie = line;
             break;
         }
     }
     return nameMovie;
 }

 public String convertUnderscore(){
     maskMovie= "";
     for (int i=0 ; i< nameMovie.length(); i++){
         if (nameMovie.charAt(i) != ' ') {
             maskMovie =maskMovie +"_";
         }
         else {
             maskMovie= maskMovie + " ";

         }

     }

   return maskMovie;
 }


}
