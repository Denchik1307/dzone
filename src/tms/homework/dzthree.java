package tms.homework;

import java.util.Scanner;

public class dzthree {
    public static void main(String[] args) {
        System.out.println("Введите размер первой стороны прямоугольика:");
        Scanner inData = new Scanner(System.in);
        int getA = inData.nextInt();
        System.out.println("Введите размер второй стороны прямоугольика:");
        int getB = inData.nextInt();
        System.out.println("Площадь = " + getA * getB + " ,а периметр = " + (getA + getB) * 2);
    }
}
