package snake;

import javax.swing.*;
import java.awt.*;

public class Dot extends JComponent {
    private int x;
    private int y;
    private int width;
    private int height;

    public Dot(Rectangle bounds) {
        width = 8;
        height = 8;
        x = (int)( (bounds.width - 5*width) * Math.random());
        y = (int)( (bounds.height - 5*height) * Math.random());
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
}
