package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> System.out.println("W was pressed");
            case KeyEvent.VK_A -> System.out.println("A was pressed");
            case KeyEvent.VK_S -> System.out.println("S was pressed");
            case KeyEvent.VK_D -> System.out.println("D was pressed");
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