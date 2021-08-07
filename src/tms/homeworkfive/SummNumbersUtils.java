package tms.homeworkfive;

public final class SummNumbersUtils {

    static int val = 0;

    private SummNumbersUtils(int numberInput) {
    }

    public static int resultSumm(int numberInput) {
        while (numberInput > 0) {
            val += numberInput % 10;
            numberInput = numberInput / 10;
        }
        return val;
    }
}
