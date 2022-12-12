package chess.view;

import chess.board.ChessBoard;

import javax.swing.*;
import java.awt.*;

public class GUI {
    private JPanel gui;
    private ChessBoard chessBoard;
    private Toolbar toolbar;

    //getter and setter
    public JPanel getGui() {
        return gui;
    }

    public void setGui(JPanel gui) {
        this.gui = gui;
    }

    //constructor
    public GUI() {
        guiBorderLayout();
        createToolbar();
    }

    //create GUI with Borderlayout and add the chessboard
    public void guiBorderLayout() {
        gui = new JPanel(new BorderLayout(3,3));
        chessBoard = new ChessBoard();
        gui.add(chessBoard.getChessBoard(), BorderLayout.CENTER);
    }

    //create the Toolbar and add it to the gui
    public void createToolbar() {
        toolbar = new Toolbar();
        toolbar.fillToolbar(chessBoard);
        gui.add(toolbar.getToolbar(), BorderLayout.WEST);
    }
}
