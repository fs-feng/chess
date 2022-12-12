package chess.game;

import chess.board.Square;
import chess.pieces.PieceColor;

public class WhitePlayer extends Player {
    public WhitePlayer(PieceColor color, Square[][] chessField) {
        super(color, chessField);
    }
}
