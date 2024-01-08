

import processing.core.PApplet;

//Inheritance
public class ProcessingFourBalls extends PApplet implements Drawing {
    //Encapsulation
    private final int WIDTH = 640;
    private final int HEIGHT = 480;
    private final int DIAMETER = 20;
    private static int[] speed = {0,0,0,0};

    //Runtime Polymorphism
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    //Runtime Polymorphism
    @Override
    public void setup() {
        background(255);
    }

    //Runtime Polymorphism
    @Override
    public void draw() {
        drawCircle(0, 1, 1);
        drawCircle(1, 2, 2);
        drawCircle(2, 3, 3);
        drawCircle(3, 4, 4);
    }

    //Runtime Polymorphism

    //Runtime Polymorphism
    @Override
    public void drawCircle(int ind, int times, int inc) {
        ellipse(speed[ind], times*(HEIGHT/5), DIAMETER, DIAMETER);
        speed[ind]+=inc;
    }

    public static void main (String... args) {
        ProcessingFourBalls pt = new ProcessingFourBalls();
        PApplet.runSketch(new String[]{"ProcessingFourBalls"}, pt);
    }
}