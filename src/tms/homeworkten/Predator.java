package tms.homeworkten;

import tms.homeworkten.abstraction.Animal;

public class Predator extends Animal {

    @Override
    public void eat() {
        System.out.println("Eat meat");
    }

    public void sleep(){
        System.out.println("Im sleep in shelter");
    }
    public void attackEat() {
        System.out.println("Eating attacked");
    }
}
