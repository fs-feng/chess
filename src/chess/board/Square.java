package chess.board;

import chess.pieces.Piece;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Square {
    private int x;
    private int y;
    private String squareName;
    private JButton square;
    private Piece currentPiece;
    private String background;


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getSquareName() {
        return squareName;
    }

    public JButton getSquare() {
        return square;
    }

    public void setSquare(JButton square) {
        this.square = square;
    }

    public Piece getCurrentPiece() {
        return currentPiece;
    }

    public void setCurrentPiece(Piece currentPiece) {
        this.currentPiece = currentPiece;
    }


    public Square(int y, int x) {
        this.y = y;
        this.x = x;

        setCurrentPiece(null);
        defineSquareName();
        createButton();
        createButtonBorder();
        createButtonColor();
        actionListener();
    }


    public void createButton() {
        square = new JButton();
        square.setMargin(new Insets(0,0,0,0));
    }

    public void createButtonBorder() {
        switch (y) {
            case 0 -> square.setBorder(BorderFactory.createMatteBorder(1,0,0,0, Color.black));
            case 7 -> square.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.black));
            default -> square.setBorder(BorderFactory.createEmptyBorder());
        }
        switch (x) {
            case 0 -> square.setBorder(BorderFactory.createMatteBorder(0,1,0,0, Color.black));
            case 7 -> square.setBorder(BorderFactory.createMatteBorder(0,0,0,1, Color.black));
        }

        if (y == 0 && x == 0)
            square.setBorder(BorderFactory.createMatteBorder(1,1,0,0, Color.black));
        else if ( y== 7 && x == 0)
            square.setBorder(BorderFactory.createMatteBorder(0,1,1,0, Color.black));
        else if (y == 0 && x == 7)
            square.setBorder(BorderFactory.createMatteBorder(1,0,0,1, Color.black));
        else if (y == 7 && x == 7)
            square.setBorder(BorderFactory.createMatteBorder(0,0,1,1, Color.black));
        //square.setIcon(new ImageIcon(new BufferedImage(60, 60, BufferedImage.TYPE_INT_ARGB)));
    }

    public void createButtonColor() {
        if ((y % 2 == 1 && x % 2 == 1) || (y % 2 == 0 && x % 2 == 0))
            background = "#eeeed2";
        else
            background = "#769656";
        square.setBackground(Color.decode(background));
    }


    private void defineSquareName() {
        switch (x) {
            case 0 -> squareName = "A" + (8 - y);
            case 1 -> squareName = "B" + (8 - y);
            case 2 -> squareName = "C" + (8 - y);
            case 3 -> squareName = "D" + (8 - y);
            case 4 -> squareName = "E" + (8 - y);
            case 5 -> squareName = "F" + (8 - y);
            case 6 -> squareName = "G" + (8 - y);
            case 7 -> squareName = "H" + (8 - y);
            default -> System.out.println("Error in Name Creation");
        }
    }


    public void actionListener() {
        square.addActionListener(new ActionListener() {
            @Override
            public Piece actionPerformed(ActionEvent e) {

            }
        });
    }
}
