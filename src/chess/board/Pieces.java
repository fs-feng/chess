package chess.board;

import chess.pieces.*;

public class Pieces {
    //all the white pieces
    private Rook w_rook_1;
    private Rook w_rook_2;
    private Knight w_knight_1;
    private Knight w_knight_2;
    private Bishop w_bishop_1;
    private Bishop w_bishop_2;
    private King w_king;
    private Queen w_queen;
    private Pawn[] w_pawns;

    //all the black pieces
    private Rook b_rook_1;
    private Rook b_rook_2;
    private Knight b_knight_1;
    private Knight b_knight_2;
    private Bishop b_bishop_1;
    private Bishop b_bishop_2;
    private King b_king;
    private Queen b_queen;
    private Pawn[] b_pawns;

    //getter white pieces
    public Rook getW_rook_1() {
        return w_rook_1;
    }

    public Rook getW_rook_2() {
        return w_rook_2;
    }

    public Knight getW_knight_1() {
        return w_knight_1;
    }

    public Knight getW_knight_2() {
        return w_knight_2;
    }

    public Bishop getW_bishop_1() {
        return w_bishop_1;
    }

    public Bishop getW_bishop_2() {
        return w_bishop_2;
    }

    public King getW_king() {
        return w_king;
    }

    public Queen getW_queen() {
        return w_queen;
    }

    public Pawn[] getW_pawns() {
        return w_pawns;
    }

    //getter black pieces
    public Rook getB_rook_1() {
        return b_rook_1;
    }

    public Rook getB_rook_2() {
        return b_rook_2;
    }

    public Knight getB_knight_1() {
        return b_knight_1;
    }

    public Knight getB_knight_2() {
        return b_knight_2;
    }

    public Bishop getB_bishop_1() {
        return b_bishop_1;
    }

    public Bishop getB_bishop_2() {
        return b_bishop_2;
    }

    public King getB_king() {
        return b_king;
    }

    public Queen getB_queen() {
        return b_queen;
    }

    public Pawn[] getB_pawns() {
        return b_pawns;
    }

    //create pieces in the chess field
    //with black the options for black top or white top
    public void createPieces(Square[][] chessField, boolean playerIsWhite) {
        if (!playerIsWhite) {
            whiteTop(chessField);
            blackBottom(chessField);
        } else {
            whiteBottom(chessField);
            blackTop(chessField);
        }
    }

    //create white pieces on bottom side
    public void whiteBottom(Square[][] chessField) {
        w_rook_1 = new Rook(chessField[7][0], PieceColor.white, "rook");
        w_rook_2 = new Rook(chessField[7][7], PieceColor.white, "rook");
        w_knight_1 = new Knight(chessField[7][1], PieceColor.white, "knight");
        w_knight_2 = new Knight(chessField[7][6], PieceColor.white, "knight");
        w_bishop_1 = new Bishop(chessField[7][2], PieceColor.white, "bishop");
        w_bishop_2 = new Bishop(chessField[7][5], PieceColor.white, "bishop");
        w_king = new King(chessField[7][4], PieceColor.white, "king");
        w_queen = new Queen(chessField[7][3], PieceColor.white, "queen");

        w_pawns = new Pawn[8];
        for (int i = 0; i < 8; i++)
            w_pawns[i] = new Pawn(chessField[6][i], PieceColor.white, "pawn");

    }

    //create white pieces on top side
    public void whiteTop(Square[][] chessField) {
        w_rook_1 = new Rook(chessField[0][0], PieceColor.white, "rook");
        w_rook_2 = new Rook(chessField[0][7], PieceColor.white, "rook");
        w_knight_1 = new Knight(chessField[0][1], PieceColor.white, "knight");
        w_knight_2 = new Knight(chessField[0][6], PieceColor.white, "knight");
        w_bishop_1 = new Bishop(chessField[0][2], PieceColor.white, "bishop");
        w_bishop_2 = new Bishop(chessField[0][5], PieceColor.white, "bishop");
        w_king = new King(chessField[0][3], PieceColor.white, "king");
        w_queen = new Queen(chessField[0][4], PieceColor.white, "queen");

        w_pawns = new Pawn[8];
        for (int i = 0; i < 8; i++)
            w_pawns[i] = new Pawn(chessField[1][i], PieceColor.white, "pawn");

    }

    //create black pieces on top side
    public void blackTop(Square[][] chessField) {
        b_rook_1 = new Rook(chessField[0][0], PieceColor.black, "rook");
        b_rook_2 = new Rook(chessField[0][7], PieceColor.black, "rook");
        b_knight_1 = new Knight(chessField[0][6], PieceColor.black, "knight");
        b_knight_2 = new Knight(chessField[0][1], PieceColor.black, "knight");
        b_bishop_1 = new Bishop(chessField[0][2], PieceColor.black, "bishop");
        b_bishop_2 = new Bishop(chessField[0][5], PieceColor.black, "bishop");
        b_king = new King(chessField[0][4], PieceColor.black, "king");
        b_queen = new Queen(chessField[0][3], PieceColor.black, "queen");

        b_pawns = new Pawn[8];
        for (int i = 0; i < 8; i++)
            b_pawns[i] = new Pawn(chessField[1][i], PieceColor.black, "pawn");

    }

    //create black pieces on bottom side
    public void blackBottom(Square[][] chessField) {
        b_rook_1 = new Rook(chessField[7][0], PieceColor.black, "rook");
        b_rook_2 = new Rook(chessField[7][7], PieceColor.black, "rook");
        b_knight_1 = new Knight(chessField[7][1], PieceColor.black, "knight");
        b_knight_2 = new Knight(chessField[7][6], PieceColor.black, "knight");
        b_bishop_1 = new Bishop(chessField[7][2], PieceColor.black, "bishop");
        b_bishop_2 = new Bishop(chessField[7][5], PieceColor.black, "bishop");
        b_king = new King(chessField[7][3], PieceColor.black, "king");
        b_queen = new Queen(chessField[7][4], PieceColor.black, "queen");

        b_pawns = new Pawn[8];
        for (int i = 0; i < 8; i++)
            b_pawns[i] = new Pawn(chessField[6][i], PieceColor.black, "pawn");


    }
}
