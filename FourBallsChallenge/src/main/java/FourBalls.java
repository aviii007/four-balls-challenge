
import processing.core.PApplet;
public class FourBalls extends PApplet{

    public static final int WIDTH = 700;
    public static final int HEIGHT = 500;
    public static final int diameter = 10;
    int speed1=1;
    int speed2=1;
    int speed3=1;
    int speed4=1;
    public static void main(String args[]) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        //paintwhite();
    }

    @Override
    public void draw() {
        drawBall1();
        drawBall2();
        drawBall3();
        drawBall4();
    }

    private void drawBall4() {
        ellipse(speed4, HEIGHT * 4 / 5, diameter, diameter);
        speed4+=4;
    }

    private void drawBall3() {
        ellipse(speed3, HEIGHT * 3 / 5, diameter, diameter);
        speed3+=3;
    }

    private void drawBall2() {
        ellipse(speed2,HEIGHT*2/5,diameter,diameter);
        speed2+=2;
    }

    private void drawBall1() {
        ellipse(speed1, HEIGHT / 5, diameter, diameter);
        speed1++;
    }

    private void paintwhite() {
        background(255);
    }
}