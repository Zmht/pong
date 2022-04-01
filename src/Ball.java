import java.awt.*;

public class Ball extends Entity {

    public Ball(int x, int y, int w, int h){
        super(x, y, w, h);
    }

    @Override
    public void init() {

    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(xPos, yPos, 50, 50);
    }
}
