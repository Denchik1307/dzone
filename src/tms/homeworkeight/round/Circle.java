package tms.homeworkeight.round;

public class Circle implements Round {

    private float radiusOne;
    private float radiusTwo;
    private double result;

    private Circle(float radiusOne, float radiusTwo) {
        this.radiusOne = radiusOne;
        this.radiusTwo = radiusTwo;
    }

    @Override
    public double square(float radiusOne) {
        this.result = 2 * Math.PI * radiusOne;
        System.out.println(result);
        return this.result;
    }

    @Override
    public double square(float radiusOne, float radiusTwo) {
        this.result = Math.PI * radiusOne * radiusTwo;
        System.out.println(result);
        return this.result;
    }
}
