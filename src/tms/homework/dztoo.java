package tms.homework;

import java.util.Scanner;

public class dztoo {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner inData = new Scanner(System.in);
        int getData = inData.nextInt();
        System.out.println(getData % 10 != 3 ? "Ваше число не заканчивается 3" : "Ваше число заканчивается 3");
    }
}
