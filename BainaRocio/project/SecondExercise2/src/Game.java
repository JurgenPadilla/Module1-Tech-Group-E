import java.util.Scanner;

public class Game {
 String rules="1.A movie is selected randomly\n2.You have to provide one by one letter.\n3.you have 10 attempts to guess the movie name.";
 RandomMovie guessMovie;
 String attempts;
 String wrongLetters;
 String[] movieLetters;
 String[] letterMask;
 int numberAttempts;

 public Game(){
   guessMovie= new RandomMovie();
   numberAttempts = 10;
   wrongLetters = "";
  try{
   guessMovie.importScanner();
   guessMovie.getMovie();
  }
  catch (Exception exception){
   System.out.println("Error- "+exception.getMessage ());
  }
  guessMovie.convertUnderscore();
  movieLetters = guessMovie.nameMovie.split("");
  letterMask= guessMovie.maskMovie.split("");
 }

 public void startGame (){
     System.out.println(rules);
     System.out.println("You are guessing: "+ guessMovie.maskMovie);

 }
 public void requestAttempt(){
  boolean match= false;
    System.out.println("Insert a letter");
    Scanner scanner =new Scanner(System.in);
    attempts = scanner.nextLine();
    for (int i =0 ; i < movieLetters.length ; i++ ){
     if (attempts.equals(movieLetters[i])){
      letterMask[i]= attempts;
      match=true;
     }
    }
  if(!match){
   wrongLetters=wrongLetters+ " "+ attempts;
   numberAttempts = numberAttempts - 1;
   System.out.println("You have guessed ("+wrongLetters.length()+") wrong letters: " + wrongLetters);
  }
  String findLetters = String.join("",letterMask);
  if (numberAttempts ==0){
   System.out.println("You reach maximum of attempts\n You loose!!!");
  } else if(!findLetters.contains("_")){
   System.out.println("You Win!!!\nYou have guessed '"+findLetters+"' correctly");
  } else if (userCanStillPlay()){
   System.out.println("You are guessing: "+findLetters);
  }
 }
 public boolean userCanStillPlay(){
  boolean canPlay = false;
  String findLetters = String.join("",letterMask);
  if (numberAttempts > 0 && findLetters.contains("_")){
   canPlay=true;
  }
  return canPlay;
 }
}
