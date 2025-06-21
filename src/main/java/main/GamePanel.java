package main;
/**
 * Purpose: Store our JPanel, where we will do our drawing
 */

import inputs.KeyboardInputs;
import inputs.MouseInputs;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private KeyboardInputs keyboardInputs;
    private int xDelta = 100;
    private int yDelta = 100;

    public GamePanel() {
        mouseInputs = new MouseInputs(this);
        keyboardInputs = new KeyboardInputs(this);

        addKeyListener(keyboardInputs);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta(int value) {
        this.xDelta += value;
        repaint();
    }

    public void changeYDelta(int value) {
        this.yDelta += value;
        repaint();
    }

    public void setRectanglePos(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    public void paintComponent(Graphics graphics) {
        // Cleans the surface of the JPanel and allows us to paint without anything carrying over from the previous frame
        super.paintComponent(graphics);

        graphics.fillRect(xDelta, yDelta, 200, 50);
    }
}