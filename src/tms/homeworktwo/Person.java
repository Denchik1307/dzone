package tms.homeworktwo;

public class Person {
    public String fullName;
    public int age;

    public void movie(){
        System.out.println("Какой-то Person говорит");
    }

    public void talk(){
        System.out.println("Какой-то Person идет");
    }

    public Person(){
        this("Denis", 40);
    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
}
