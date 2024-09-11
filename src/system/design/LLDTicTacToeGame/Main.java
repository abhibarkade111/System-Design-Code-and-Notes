package system.design.LLDTicTacToeGame;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's start the game");
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        System.out.println("Winner is "+game.startGame());
    }
}
