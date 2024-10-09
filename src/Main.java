import javax.swing.*;

public class Main extends JFrame {
    Main() {
        int boardWidth = 360;
        int boardHeight = 640;
        // This will set the size of the window
        setSize(boardWidth, boardHeight);
        // This will place the window at center
        setLocationRelativeTo(null);
        // This will not resize the frame
        setResizable(false);
        // Whenever a user will click the exit button it will close the Window
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        FlappyBird flappy = new FlappyBird();
        add(flappy);
        // This will include the size of window excluding the title bar
        pack();
        requestFocus();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}