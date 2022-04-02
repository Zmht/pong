import java.awt.*;

public class Paddle extends Entity{

    public Paddle(int x, int y, int w, int h){
        super(x, y, w, h);
        yVel = 3;
    }

    @Override
    public void init() {

    }

    @Override
    public void update() {
        if(Keyboard.up) {yPos -= yVel;}
        if(Keyboard.down) {yPos += yVel;}
    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.GREEN);
        g.fillRect(xPos, yPos, width, height);
    }
}
