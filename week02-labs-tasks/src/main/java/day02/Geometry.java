package day02;

public class Geometry {

    public static void main(String[] args) {
        Rectangle rct1 = new Rectangle(3.5, 7);
        Rectangle rct2 = new Rectangle(2.8, 4.2);
        Rectangle rct3 = new Rectangle(6.3,6.3);

        System.out.println(rct1.calculateArea() + ", " + rct2.calculateArea() + ", " + rct3.calculateArea());

    }
}
