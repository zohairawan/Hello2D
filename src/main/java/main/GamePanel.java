package main;
/**
 * Purpose: Store our JPanel, where we will do our drawing
 */

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel{

    public GamePanel() {

    }

    public void paintComponent(Graphics graphics) {
        // Cleans the surface of the JPanel and allows us to paint without anything carrying over from the previous frame
        super.paintComponent(graphics);

        graphics.fillRect(100,100,200,50);
    }
}