package main;
/**
 * Purpose: Store our JPanel, where we will do our drawing
 */

import inputs.KeyboardInputs;
import inputs.MouseInputs;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel{

    private MouseInputs mouseInputs;
    private KeyboardInputs keyboardInputs;

    public GamePanel() {
        mouseInputs = new MouseInputs();
        keyboardInputs = new KeyboardInputs();

        addKeyListener(keyboardInputs);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void paintComponent(Graphics graphics) {
        // Cleans the surface of the JPanel and allows us to paint without anything carrying over from the previous frame
        super.paintComponent(graphics);

        graphics.fillRect(100,100,200,50);
    }
}