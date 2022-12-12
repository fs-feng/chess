package chess.game;

import chess.board.*;
import chess.pieces.Piece;
import chess.pieces.PieceColor;

public class Player {

    private boolean firstMove;
    private PieceColor color;
    private Piece selectedPiece;
    private Square[][] chessField;


    public Player(PieceColor color, Square[][] chessField) {
        this.chessField = chessField;
        this.color = color;
    }

    public void move(Piece currentPiece) {

    }

    public void eat() {

    }
}
