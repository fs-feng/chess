package chess.game;

import chess.view.Window;

public class Engine {

    public Engine() {
        createWindow();
    }

    public void createWindow() {
        Window window = new Window();
    }

    public static void main(String[] args) {
        Engine engine = new Engine();
    }

}
