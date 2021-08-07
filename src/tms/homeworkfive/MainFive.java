package tms.homeworkfive;

public class MainFive {

    public static void main(String[] args) {

        //summ numbers
        System.out.println(SummNumbersUtils.resultSumm(5555));
        //cycle metod
        FebonachiNumbersOutUtils.cycleFebonachi(125);
        //recursion metod
        int maxNumber = 12;
        for (int i = 1; i < maxNumber; i++) {
            System.out.print(FebonachiNumbersOutUtils.recusionFebonachi(i));
            System.out.print(" ");
        }
    }
}
