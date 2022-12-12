package chess.board;

public class ChessField {
    private Square[][] chessField;

    public Square[][] getChessField() {
        return chessField;
    }

    public void setChessField(Square[][] chessField) {
        this.chessField = chessField;
    }

    //constructor
    public ChessField() {
        createChessField();
    }

    //create board out of squares
    public void createChessField() {
        chessField = new Square[8][8];
    }

    //add coordinates to the square
    public void createSquare(int y, int x) {
        chessField[y][x] = new Square(y, x);
    }
}
