package chess.board;

public class ChessField {
    private Square[][] chessField;

    public Square[][] getChessField() {
        return chessField;
    }

    public void setChessField(Square[][] chessField) {
        this.chessField = chessField;
    }


    public ChessField() {
        createChessField();
    }


    public void createChessField() {
        chessField = new Square[8][8];
    }

    public void createSquare(int y, int x) {
        chessField[y][x] = new Square(y, x);
    }
}
