package tms.homeworkone;

import java.util.Scanner;

public class DzSix {
    public static void main(String[] args) {
        System.out.println("Введите трёхзначное число:");
        Scanner inData = new Scanner(System.in);
        int getNumber = inData.nextInt();
        int a, b, c;
        a = getNumber % 10;
        b = (getNumber / 10) % 10;
        c = (getNumber / 100) % 10;
        System.out.print(c + "*" + b + "*" + a + "=" + a * b * c);
    }
}
