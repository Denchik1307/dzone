package tms.homeworkfive;

public final class FebonachiNumbersOutUtils {

    private static int firstNumber = 1, secondNumber = 1, auxiliaryVar = 1;

    public static void cycleFebonachi(int number) {
        StringBuilder result = new StringBuilder();
        result.append(firstNumber).append(" ");
        while (auxiliaryVar < number) {
            result.append(auxiliaryVar).append(" ");
            auxiliaryVar = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = auxiliaryVar;
        }
        System.out.println(result);
    }

    public static int recusionFebonachi(int numberRecursion) {
        if (numberRecursion == 0) {
            return 0;
        }
        if (numberRecursion <= 2) {
            return 1;
        }
        return (recusionFebonachi(numberRecursion - 1)
                + recusionFebonachi(numberRecursion - 2));
    }
}


