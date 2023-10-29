package HW_6.Exercise_2;

public class Cat {
    String name;
    String address;
    int weight = 4;
    int age = 5;
    String color;

    public Cat(String name) {
        setName(name);
    }

    public Cat(String name, int weight, int age) {
        this(name);
        setWeight(weight);
        setAge(age);
    }

    public Cat(String name, int age) {
        this(name);
        setAge(age);
    }

    public Cat(int weight, String color) {
        setWeight(weight);
        setColor(color);
    }

    public Cat(String address, String color, int weight) {
        this(weight, color);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Name: " + getName() + ", Color: " + getColor() + ", Address: " + getAddress() + ", Weight: " +
                    getWeight() + ", Age: " + getAge();
    }
}
