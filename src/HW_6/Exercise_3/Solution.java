package HW_6.Exercise_3;

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Albert", 35, "Krevlevskaya 25");
        Woman woman = new Woman("Diana", 28, "Lenina 89");

        System.out.println(man.toString());
        System.out.println(woman.toString());
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
