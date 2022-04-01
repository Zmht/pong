import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener{
    private static int currentKey;

    public static int getCode(){
        return currentKey;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        currentKey = e.getKeyCode();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
