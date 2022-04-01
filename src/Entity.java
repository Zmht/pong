public abstract class Entity {
    private double xPos;
    private double yPos;

    public void setYPos(double val){
        yPos = val;
    }

    public void setXPos(double val){
        xPos = val;
    }

    public double getYPos(){
        return yPos;
    }

    public double getXPos(){
        return xPos;
    }

    public void update(){}
    public void render(){}

}
