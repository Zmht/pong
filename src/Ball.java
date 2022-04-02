import javax.swing.*;
import java.awt.*;

public class Ball extends Entity {

    public Ball(int x, int y, int w, int h){
        super(x, y, w, h);
    }

    @Override
    public void init() {
        yVel = 0;
        xVel = 4;
    }

    private void collision() {
        // Collision with paddle
        if(xPos + width >= Game.pad.xPos && yPos + height > Game.pad.yPos && yPos < Game.pad.yPos + Game.pad.height){
            xVel *= -1;
            int offset = (Game.pad.yPos + Game.pad.height) - (yPos + (height / 2)) - 45;
            if(offset > 0){
                yVel = -offset / 11;
            } else if(offset < 0){
                yVel = -offset / 11;
            }

            System.out.println("Paddle Collision!");
            System.out.println("offset: " + offset);
            System.out.println("Force: " + yVel);
        }

        // Collision with enemy
        if(xPos <= Game.enemy.xPos && yPos + height > Game.enemy.yPos && yPos < Game.enemy.yPos + Game.enemy.height){
            xVel *= -1;
            int offset = (Game.enemy.yPos + Game.enemy.height) - (yPos + (height / 2)) - 45;
            if(offset > 0){
                yVel = -offset / 11;
            } else if(offset < 0){
                yVel = -offset / 11;
            }

            System.out.println("Enemy Collision!");
            System.out.println("offset: " + offset);
            System.out.println("Force: " + yVel);
        }


        //collision with walls
        if(yPos <= 0 || yPos + 100 >= 600){
            yVel *= -1;
            System.out.println("Wall Collision!");
        }
        // Out of bound collision
        if(xPos >= 1000 || xPos <= 0){
            System.exit(0);
        }
    }


    @Override
    public void update() {
        collision();
        xPos += xVel;
        yPos += yVel;
    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.fillOval(xPos, yPos, width, height);
    }
}
