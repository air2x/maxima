package HW_6.Exercise_3;

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Albert", 35, "Kremlevskaya 25");
        Man man2 = new Man("Nikita", 89, "Petrova 150");
        Woman woman1 = new Woman("Diana", 28, "Lenina 89");
        Woman woman2 = new Woman("Alina", 15, "Korolenko 287");

        System.out.println(man1.toString() + "\n" + man2.toString() + "\n" + woman1.toString() + "\n"
                    + woman2.toString());

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
            return name + ", " + age + ", " + address;
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
            return name + ", " + age + ", " + address;
        }
    }
}
