package tms.homeworkone;

import java.util.Scanner;

public class DzFiveExemple {
    public static void main(String[] args) {
        System.out.println("Введите какую-нибудь сумму:");
        Scanner inData = new Scanner(System.in);
        int getCost = inData.nextInt();
        String cost = "Спасибо, с вашего счета будет списано: ";
        cost = cost.concat(getCost + " ");
        boolean validate = false;
        if (getCost % 10 == 1) {
            cost = cost.concat("рубль.");
        } else if (getCost % 10 == 0 || (getCost % 10 > 4 && getCost % 10 < 9)) {
            cost = cost.concat("рублей.");
        } else if (getCost % 10 > 1 && getCost % 10 < 5) {
            cost = cost.concat("рубля.");
        } else {
            System.out.println("Что-то пошло не так");   //на всякий случай
        }
        System.out.println(cost);
    }
}
