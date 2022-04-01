import java.awt.*;

public class Ball extends Entity {

    public Ball(int x, int y, int w, int h){
        super(x, y, w, h);
    }

    @Override
    public void init() {
        yVel = 5;
        xVel = 3;
    }

    @Override
    public void update() {
        xPos += xVel;
        yPos += yVel;

    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.fillOval(xPos, yPos, width, height);
    }
}
