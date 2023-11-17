package HW_7.exercise_3;

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        setFullName(fullName);
        setAge(age);
    }

    public void move() {
        System.out.println(getFullName() + " идет");
    }

    public void talk() {
        System.out.println(getFullName() + " говорит");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (!fullName.isBlank()) {
            this.fullName = fullName;
        } else {
            System.out.println("Error");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Error");
        }
    }
}
