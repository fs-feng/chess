package chess.view;

import chess.board.ChessBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar {
    private JToolBar toolbar;
    private JButton newGameWhite;
    private JButton newGameBlack;
    private JButton clearGame;


    //getter
    public JToolBar getToolbar() {
        return toolbar;
    }

    //constructor
    public Toolbar() {
        toolbar = new JToolBar();
        toolbar.setLayout(new GridLayout(3,1));
    }

    //create the buttons for the toolbar with action listeners
    public void fillToolbar(ChessBoard chessBoard) {
        newGameBlack = new JButton("Play as black");
        newGameWhite = new JButton("Play as white");
        clearGame = new JButton("Clear");

        toolbar.add(newGameWhite);
        toolbar.add(newGameBlack);
        toolbar.add(clearGame);

        newGameBlack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chessBoard.fillPieces(false);
            }
        });

        newGameWhite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chessBoard.fillPieces(true);
            }
        });

        clearGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chessBoard.clearPieces();
            }
        });
    }
}
