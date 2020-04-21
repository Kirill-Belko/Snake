package snake;

import java.awt.*;
import javax.swing.*;

public class Window {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(1, 1));

        Canvas canvas = new Canvas(frame);
        frame.add(canvas);
        frame.setVisible(true);
    }

}
