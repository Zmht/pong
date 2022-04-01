public class Game {

    static Paddle pad = new Paddle();
    static Ball ball = new Ball();
    public static void main(String args[]){
        while(true){
            update();
            render();
        }
    }

    public static void update(){
        pad.update();
        ball.update();
    }

    public static void render() {
        pad.render();
        ball.render();
    }

}
