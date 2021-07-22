package tms.homeworkone;

import java.util.Scanner;

public class DzFourExemple {
    public static void main(String[] args) {
        System.out.println("Введите первую переменную:");
        Scanner inData = new Scanner(System.in);
        int getA = inData.nextInt();
        System.out.println("Введите вторую переменную:");
        int getB = inData.nextInt();
        System.out.println("значение 1 = " + getA + " ,а значение 2 = " + getB);
        getB = getA + getB;
        getA = getB - getA;
        getB = getB - getA;
        System.out.println("Теперь значение 1 = " + getA + " ,а значение 2 = " + getB);
    }
}
