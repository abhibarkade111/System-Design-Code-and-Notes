package system.design.LLDTicTacToeGame.Model;

public class Board {
    public int size;
    public PlayingPiece board[][];
    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]!=null){
                    System.out.print(board[i][j].pieceType.name());
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public boolean noCellLeft(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null) return false;
            }
        }
        return true;
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece){
        if(board[row][col]==null){
            board[row][col] = playingPiece;
            return true;
        }
        return false;
    }

    public boolean isThereWinner(int row, int col, PieceType pieceType){
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;
        for(int j=0;j< size;j++){
            if(board[row][j]==null || board[row][j].pieceType!=pieceType){
                rowMatch = false;
            }
        }

        for(int i=0;i< size;i++){
            if(board[i][col]==null || board[i][col].pieceType!=pieceType){
                columnMatch = false;
            }
        }

        for(int i=0,j=0;j< size;i++,j++){
            if(board[i][j]==null || board[i][j].pieceType!=pieceType){
                diagonalMatch = false;
            }
        }

        for(int i=size-1,j=size-1;j>=0;i--,j--){
            if(board[i][j]==null || board[i][j].pieceType!=pieceType){
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}
