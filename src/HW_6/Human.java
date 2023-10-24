package HW_6;

public class Human {
    private String name;
    private boolean gender;
    private int age;
    private Human dad;
    private Human mom;

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Human(String name, boolean gender, int age, Human dad, Human mom) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.dad = dad;
        this.mom = mom;
    }

    @Override
    public String toString() {
        String text = "";
        text += "Имя: " + this.name;
        text += ", пол: " + (this.gender ? "мужской" : "женский");
        text += ", возраст: " + this.age;

        if (this.dad != null) {
            text += ", отец: " + this.dad.name;
        }
        if (this.mom != null) {
            text += ", мать: " + this.mom.name;
        }
        return text;
    }
}
