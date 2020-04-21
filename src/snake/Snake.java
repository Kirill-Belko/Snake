package snake;

import javafx.scene.control.skin.TextInputControlSkin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Snake extends JComponent {
    private int x;
    private int y;
    private int width = 8;
    private int height = 8;
    private int speed = 2;
    private TextInputControlSkin.Direction direction = TextInputControlSkin.Direction.RIGHT;
    List<Dot> dotList = new ArrayList<>();

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public TextInputControlSkin.Direction getDirection() {
        return direction;
    }

    public void setDirection(TextInputControlSkin.Direction direction) {
        this.direction = direction;
    }

    public void move() {
        switch (direction) {
            case UP:
                int prevY = y;
                y-=speed;
                if(prevY - y == height) {
                    for (int i = 0; i < this.dotList.size(); i++) {
                        this.dotList.get(i).setX(this.getX() + this.dotList.get(i).getWidth() * (i + 1));
                        this.dotList.get(i).setY(this.getY());
                    }
                }
            break;
            case DOWN: y+=speed; break;
            case LEFT: x-=speed; break;
            case RIGHT: x+=speed; break;
        }
    }

    public void keyPressed(KeyEvent event) {
        int keyCode = event.getKeyCode();
        if(keyCode == KeyEvent.VK_W) {
            direction = TextInputControlSkin.Direction.UP;
        } else if(keyCode == KeyEvent.VK_S) {
            direction = TextInputControlSkin.Direction.DOWN;
        } else if(keyCode == KeyEvent.VK_A) {
            direction = TextInputControlSkin.Direction.LEFT;
        } else if(keyCode == KeyEvent.VK_D) {
            direction = TextInputControlSkin.Direction.RIGHT;
        }
    }
}
