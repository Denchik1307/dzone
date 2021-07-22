package tms.homework;

import java.util.Scanner;

public class dzone {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Введите число:");
        Scanner inData = new Scanner(System.in);
        int getData = inData.nextInt();
        System.out.println("Ваше число " + getData + " в кубе = " + Math.pow(getData, 3));
    }
}
