import javax.swing.*;
import java.awt.*;

public class Window {
    public Window(int width, int height, String name, Game game, Menu menu){
        JFrame frame = new JFrame(name);
        frame.setPreferredSize(new Dimension(width, height ));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height ));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(menu);
        frame.add(game);
        frame.setVisible(true);
        game.start();
    }

}
