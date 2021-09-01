package tms.homeworkten;

import tms.homeworkten.abstraction.Animal;

public class Herbivor extends Animal {

    @Override
    public void eat() {
        System.out.println("Eat herb");
    }

    @Override
    public void sleep() {
        System.out.println("Im sleep in herbal");
    }

    public void findFood() {
        System.out.println("Food is finding");
    }
}
