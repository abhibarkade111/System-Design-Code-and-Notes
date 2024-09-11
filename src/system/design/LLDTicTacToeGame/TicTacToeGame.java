package system.design.LLDTicTacToeGame;

import system.design.LLDTicTacToeGame.Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;
    public void initializeGame(){
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player(crossPiece, "Player1");

        PlayingPieceO naughtPiece = new PlayingPieceO();
        Player player2 = new Player(naughtPiece, "Player2");

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();

            if(gameBoard.noCellLeft()){
                noWinner = false;
                continue;
            }

            System.out.println("Player :  "+ playerTurn.getName()+" Enter row,column ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String values[] = s.split(",");
            int row = Integer.valueOf(values[0]);
            int col = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = gameBoard.addPiece(row,col, playerTurn.getPlayingPiece());
            if(!pieceAddedSuccessfully){
                System.out.println("Already piece is present please enter other locations");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean isWinner = gameBoard.isThereWinner(row, col, playerTurn.getPlayingPiece().pieceType);
            if(isWinner){
                return playerTurn.getName();
            }
        }
        return "Tie";
    }
}
