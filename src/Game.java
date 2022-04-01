import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game extends Canvas implements Runnable{
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 600;
    static Paddle pad = new Paddle(100, 100, 50, 50);
    static Ball ball = new Ball(400, 600, 30, 30);
    Image i = null;
    Thread thread;
    boolean running;

    public Game(){
        thread = new Thread();
        new Window(WIDTH, HEIGHT, "Pong", this);
    }

    public void init(){
        pad.init();
        ball.init();
    }

    public void update(){
        pad.update();
        ball.update();
    }

    public void render() {
        i = createImage(WIDTH, HEIGHT);
        Graphics g = this.getGraphics();

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.RED);
        g.fillOval(100, 100, 32, 32);

        pad.render(g);
        ball.render(g);
    }

    public static void main(String[] args) {
        new Game();
    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    @Override
    public void run() {
        this.requestFocus();
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while(running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1) {
                update();
                delta--;
            }
            if (running)
                render();
            frames++;

            if(System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames);
                frames = 0;
            }
        }
    }
}
