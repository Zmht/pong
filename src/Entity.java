import java.awt.*;

public abstract class Entity {
    protected int xPos, yPos;
    protected int xVel, yVel;
    protected int width, height;

    public Entity(int x, int y, int width, int height){
        xPos = x;
        yPos = y;
        this.width = width;
        this.height = height;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getxVel() {
        return xVel;
    }

    public void setxVel(int xVel) {
        this.xVel = xVel;
    }

    public int getyVel() {
        return yVel;
    }

    public void setyVel(int yVel) {
        this.yVel = yVel;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Is run once at the beginning of the game. Override this and add your own behavior
     */
    public void init(){}

    /**
     * Is run every frame. Should contain anything not directly related to drawing. Please override
     */
    public void update(){}

    /**
     * Is run once every frame. Should contain the code to draw the object to the screen. Please override
     */
    public void render(Graphics2D g){}

    public void getBound()

}
