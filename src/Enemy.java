import java.awt.*;

public class Enemy extends Entity{
    int tolerance = 100;
    public Enemy(int x, int y, int w, int h) {
        super(x, y, w, h);
        yVel = 0;
        xVel = 0;
    }

    @Override
    public void update() {
        if(yPos < Game.ball.yPos){
            yVel = 10;
        }
        if(yPos > Game.ball.yPos){
            yVel = -10;
        }
        xPos += xVel;
        yPos += yVel;
    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillRect(xPos, yPos, width, height);
    }
}
