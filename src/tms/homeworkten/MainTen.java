package tms.homeworkten;

public class MainTen {

    public static void main(String[] args) {

        Predator predator = new Predator();
        Herbivor herbivor = new Herbivor();

        herbivor.findFood();
        herbivor.eat();
        predator.attackEat();
        predator.eat();
    }
}
