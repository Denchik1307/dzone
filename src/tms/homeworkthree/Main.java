package tms.homeworkthree;

public class Main {
    public static void main(String[] args) {
        Point topLeft = new Point(4, 3);
        Point bottomRight = new Point(1, 1);

        bottomRight.setX(0);
        bottomRight.setY(0);

        Rectangle rectangle = new Rectangle(topLeft, bottomRight);
        Point distance = new Point(4, 5);

        System.out.println("Площадь прямоугольника = " + rectangle.getArea());
        System.out.println("Периметр прямоугольника = " + rectangle.getPerimeter());
        System.out.println("Диагональ прямоугольника = " + rectangle.getDiagonalLength());
    }
}
