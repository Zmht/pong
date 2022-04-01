import java.awt.*;

public abstract class Entity {
    protected int xPos, yPos;
    protected int width, height;

    public Entity(int x, int y, int width, int height){
        xPos = x;
        yPos = y;
        this.width = width;
        this.height = height;
    }


    public void setYPos(int val){
        yPos = val;
    }

    public void setXPos(int val){
        xPos = val;
    }

    public int getYPos(){
        return yPos;
    }

    public int getXPos(){
        return xPos;
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
    public void render(Graphics g){}

}
