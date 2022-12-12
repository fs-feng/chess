package chess.pieces;

import chess.board.Square;

import javax.swing.*;
import java.awt.*;

public abstract class Piece {
    private Square currentSquare;
    private final PieceColor color;
    private final Icon pieceIcon;

    //getter and setter
    public Square getCurrentSquare() {
        return currentSquare;
    }

    public void setCurrentSquare(Square currentSquare) {
        this.currentSquare = currentSquare;
    }

    public Icon getPieceIcon() {
        return pieceIcon;
    }

    public PieceColor getColor() {
        return color;
    }

    //constructor
    //create Piece and add it into the currentSquare
    public Piece(Square currentSquare, PieceColor color, String pieceName) {
        this.currentSquare = currentSquare;
        currentSquare.setCurrentPiece(this);

        this.color = color;
        pieceIcon = createIcon(pieceName);
        currentSquare.getSquare().setIcon(pieceIcon);
    }

    //set PieceIcon
    private ImageIcon createIcon(String pieceName) {
        Image pieceImage = new ImageIcon(this.getClass().getResource("/resources/" + color + "_" + pieceName + ".png")).getImage();

        return new ImageIcon(pieceImage);
    }

    //move the chessPiece
    public void move() {
        System.out.println("Test");
    }

    public void eat() {

    }
}
