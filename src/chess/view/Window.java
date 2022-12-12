package chess.view;

import javax.swing.*;

public class Window {
    private JFrame frame;
    private GUI gui;


    public JFrame getFrame() {
        return frame;
    }

    public GUI getGui() {
        return gui;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }


    public Window() {
        frame = new JFrame("Chess");
        gui = new GUI();
        frame.add(gui.getGui());
        frame.pack();
        frame.setMinimumSize(frame.getSize());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
