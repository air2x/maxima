package HW_6.Exercise_2;

public class Cat {
    String name;
    String address;
    int weight = 4;
    int age = 5;
    String color;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat(String address, String color, int weight) {
        this.address = address;
        this.weight = weight;
        this.color = color;
    }

    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Address: " + address + ", Weight: " + weight + ", Age: " + age;
    }
}
