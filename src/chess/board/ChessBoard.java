package chess.board;

import javax.swing.*;
import java.awt.*;

public class ChessBoard {
    private JPanel chessBoard;
    private ChessField chessField;
    private Pieces pieces;
    private int numerical = 8;

    //getter and setter
    public JPanel getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(JPanel chessBoard) {
        this.chessBoard = chessBoard;
    }

    public ChessField getChessField() {
        return chessField;
    }

    public void setChessField(ChessField chessField) {
        this.chessField = chessField;
    }


    //constructor
    public ChessBoard() {
        chessBoardGrid();
        createBoardLetters();
        fillChessField();
    }


    //clear all the pieces and set null for the chess field
    public void clearPieces() {
        pieces = null;
        for (int y = 0; y < chessField.getChessField().length; y++) {
            for (int x = 0; x < chessField.getChessField()[y].length; x++) {
                chessField.getChessField()[y][x].getSquare().setIcon(null);
                chessField.getChessField()[y][x].setCurrentPiece(null);
            }
        }
    }

    //create the pieces
    public void fillPieces(Boolean playerIsWhite) {
        pieces = new Pieces();
        pieces.createPieces(chessField.getChessField(), playerIsWhite);
    }

    //create new JPanel with Gridlayout;
    public void chessBoardGrid() {
        chessBoard = new JPanel(new GridLayout(0,9));
        chessField = new ChessField();
    }

    //create the Chessfield out of Squares
    public void fillChessField() {
        for (int y = 0; y < chessField.getChessField().length; y++) {
            for (int x = 0; x < chessField.getChessField()[y].length; x++) {
                chessField.createSquare(y, x);
                if (x == 0) {
                    chessBoard.add(new JLabel(String.valueOf(numerical), SwingConstants.CENTER));
                    numerical--;
                }

                chessBoard.add(chessField.getChessField()[y][x].getSquare());
            }
        }
    }

    //first column of the Grid with the alphabet
    public void createBoardLetters() {
        for (char text : " ABCDEFGH".toCharArray()) {
            JLabel label = new JLabel(String.valueOf(text), SwingConstants.CENTER);
            label.setPreferredSize(new Dimension(60, 60));
            chessBoard.add(label);
        }
    }
}
