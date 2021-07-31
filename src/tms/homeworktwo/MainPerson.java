package tms.homeworktwo;

public class MainPerson {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person();
        Person person1 = new Person("Kolya", 45);
        System.out.println(person.fullName + " " + person.age);
        System.out.println(person1.fullName + " " + person1.age);
    }
}
