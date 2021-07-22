package tms.homeworkone;

import java.util.Scanner;

public class dztoo {
    public static void main(String[] args) {
        System.out.println("Введите число с тройкой в конце:");
        Scanner inData = new Scanner(System.in);
        int getData = inData.nextInt();
        int val = getData % 10;
        System.out.println(val != 3 ? "Ваше число заканчивается на " + val : "То что нужно )))");
    }
}
