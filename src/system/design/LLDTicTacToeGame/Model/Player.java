package system.design.LLDTicTacToeGame.Model;

public class Player {
    String name;
    PlayingPiece playingPiece;

    public Player(PlayingPiece playingPiece, String name){
        this.playingPiece = playingPiece;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }
}
