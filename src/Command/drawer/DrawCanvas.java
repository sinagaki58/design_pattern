package Command.drawer;

import Command.command.MacroCommand;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class DrawCanvas implements Drawable {
    private Color color = Color.red;
    private int radius = 6;
    protected MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    public void Paint(Graphics g) {
        history.execute();
    }

    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

}
