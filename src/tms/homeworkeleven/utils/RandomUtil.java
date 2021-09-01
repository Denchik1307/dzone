package tms.homeworkeleven.utils;

public final class RandomUtil {

    private static double randomNumber;

    public static int RandomNumber(int number) {
        randomNumber = Math.round(Math.random() * number);
        return (int) randomNumber;
    }
}
