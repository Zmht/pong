import java.awt.*;

public class Enemy extends Entity{

    public Enemy(int x, int y, int w, int h) {
        super(x, y, w, h);
        yVel = 0;
        xVel = 0;
    }

    long ticks = 0;
    @Override
    public void update() {
        ticks++;
        if(yPos < Game.ball.yPos && ticks % 40 == 0){
            yVel = 10;
        }
        if(yPos > Game.ball.yPos && ticks % 40 == 0){
            yVel = -10;
        }
        if(xPos < 0){
            xPos = 0;
        }
        if(xPos + height > Game.HEIGHT){
            xPos = Game.HEIGHT;
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
