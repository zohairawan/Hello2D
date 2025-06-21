package inputs;
/**
 * Purpose: Responsible for implementing and handling keyboard inputs
 */

import main.GamePanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> gamePanel.changeYDelta(-5);
            case KeyEvent.VK_A -> gamePanel.changeXDelta(-5);
            case KeyEvent.VK_S -> gamePanel.changeYDelta(5);
            case KeyEvent.VK_D -> gamePanel.changeXDelta(5);
            default -> System.out.println("Some other key was pressed");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}