package snake;

import javafx.scene.control.skin.TextInputControlSkin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Canvas extends JComponent implements ActionListener {

    JFrame jFrame;
    Snake snake;
    Dot dot;
    Timer timer = new Timer(20, this);
    Rectangle bounds;

    public Canvas(JFrame jFrame) {
        this.jFrame = jFrame;
        this.bounds = this.jFrame.getBounds();
        this.snake = new Snake();
        this.dot = new Dot(bounds);
        this.snake.setX(10);
        this.snake.setY(10);

        this.jFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                snake.keyPressed(e);
            }
        });
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.GREEN);
        g2d.fillRect(snake.getX(), snake.getY(), dot.getWidth(), dot.getHeight());

        for(int i = 0; i < snake.dotList.size(); i++) {
             //snake.dotList.get(i).setX(snake.getX() - snake.dotList.get(i).getWidth() *(i+1));
            //snake.dotList.get(i).setY(snake.getY());
            g2d.fillRect(snake.dotList.get(i).getX(), snake.dotList.get(i).getY(), snake.dotList.get(i).getWidth(), snake.dotList.get(i).getHeight());
        }

        g2d.setPaint(Color.RED);
        g2d.fillRect(dot.getX(), dot.getY(), dot.getWidth(), dot.getHeight());

        if( (dot.getX() <= snake.getX()  && dot.getX() + dot.getWidth() >= snake.getX() ) && (dot.getY() <= snake.getY() &&  dot.getY() + dot.getHeight() >= snake.getY() ) ||
            (dot.getX() <= snake.getX() + dot.getWidth() && dot.getX() >= snake.getX() ) && (dot.getY() <= snake.getY() + dot.getHeight() && dot.getY() >= snake.getY() )
        ) {
            dot = new Dot(bounds);
            snake.dotList.add(new Dot(bounds));
        }

        if( ((snake.getX() + snake.getWidth()) >= bounds.width) || (snake.getX() <= 0) || ((snake.getY() + snake.getHeight()) >= bounds.height) ||  (snake.getY() <= 0)) {
            System.exit(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        snake.move();
        super.repaint();
    }
}
