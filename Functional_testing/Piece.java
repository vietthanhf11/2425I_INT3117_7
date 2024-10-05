public class Piece {
    private int x;
    private int y;
    private int moves;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
        this.moves = 0;
    }

    public int posX() {
        return x;
    }

    public int posY() {
        return y;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }
}
