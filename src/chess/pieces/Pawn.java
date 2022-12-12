package chess.pieces;

import chess.board.Square;

public class Pawn extends Piece {
    private boolean firstMove;
    public Pawn(Square currentSquare, PieceColor color, String pieceName) {
        super(currentSquare, color, pieceName);
        firstMove = true;
    }

}
