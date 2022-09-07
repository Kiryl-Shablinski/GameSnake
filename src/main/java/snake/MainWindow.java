package snake;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Snake Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 342);
        setLocation(900, 0);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow window = new MainWindow();
    }
}
