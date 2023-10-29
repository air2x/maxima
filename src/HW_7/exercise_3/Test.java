package HW_7.exercise_3;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Иван Иванов", 35);
        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}
