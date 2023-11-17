package HW_7.exercise_4;

public class Human {
    private String name;
    private boolean gender;
    private int age;
    private Human dad;
    private Human mom;

    public Human(String name, boolean gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    public Human(String name, boolean gender, int age, Human dad, Human mom) {
        this(name, gender, age);
        setDad(dad);
        setMom(mom);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getDad() {
        return dad;
    }

    public void setDad(Human dad) {
        this.dad = dad;
    }

    public Human getMom() {
        return mom;
    }

    public void setMom(Human mom) {
        this.mom = mom;
    }

    @Override
    public String toString() {
        String text = "";
        text += "Имя: " + getName();
        text += ", пол: " + (isGender() ? "мужской" : "женский");
        text += ", возраст: " + getAge();

        if (getDad() != null) {
            text += ", отец: " + getDad().getName();
        }
        if (this.mom != null) {
            text += ", мать: " + getMom().getName();
        }
        return text;
    }
}
