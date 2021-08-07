package tms.homeworkfour;

public class RomeToArabNumber {

    public enum RomeToInt {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
        private final int value;

        private RomeToInt(int value) {
            this.value = value;
        }

    }
}