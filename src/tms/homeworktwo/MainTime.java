package tms.homeworktwo;

import java.util.Scanner;

public class MainTime {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner inData = new Scanner(System.in);
        int getTime = inData.nextInt();
        TimePeriod timePeriod = new TimePeriod(getTime);


    }
}
