public class MovieGame {
    public static void main (String arg[]){
        Game game;
        game = new Game();
        game.startGame();
        while(game.userCanStillPlay()){
            game.requestAttempt();
        }

    }
}
