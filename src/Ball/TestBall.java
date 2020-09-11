package Ball;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        Ball b2 = new Ball();
        Ball b3 = new Ball();
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
        b2.setX(75);
        b2.setY(25);
        System.out.println("b2 X "+b2.getX());
        System.out.println("b2 Y "+b2.getY());
        b3.setXY(66, 33);
        System.out.println(b3);
    }
}
