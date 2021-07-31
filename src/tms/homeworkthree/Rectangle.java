package tms.homeworkthree;

public class Rectangle {
    private final Point topLeft;
    private final Point bottomRight;

    public Rectangle() {
        this.topLeft = new Point(0, 0);
        this.bottomRight = new Point(0, 0);
    }

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getArea() {
        return Math.abs(this.bottomRight.getX() - this.topLeft.getX() *
                Math.abs(this.topLeft.getY() - this.bottomRight.getY()));
    }

    public double getPerimeter() {
        return Math.abs(this.bottomRight.getX() - this.topLeft.getX()) * 2
                + Math.abs(this.topLeft.getY() - this.bottomRight.getY()) * 2;
    }

    public double getDiagonalLength() {
        return this.topLeft.distance(this.bottomRight);
    }
}
