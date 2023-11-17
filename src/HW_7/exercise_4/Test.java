package HW_7.exercise_4;

import HW_6.Exercise_1.Human;

public class Test {
    public static void main(String[] args) {
        Human stas = new Human("Стас", true, 89);
        Human julia = new Human("Юлия", false, 85);
        Human albert = new Human("Альберт", true, 83);
        Human tatiana = new Human("Татьяна", false, 79);
        Human ivan = new Human("Иван", true, 45, stas, julia);
        Human viktoria = new Human("Виктория", false, 42, albert, tatiana);
        Human ludmila = new Human("Людмила", false, 2, ivan, viktoria);
        Human ahmet = new Human("Ахмет", true, 18, ivan, viktoria);
        Human lilia = new Human("Лилия", false, 15, ivan, viktoria);

        System.out.println(stas.toString());
        System.out.println(albert.toString());
        System.out.println(julia.toString());
        System.out.println(tatiana.toString());
        System.out.println(ivan.toString());
        System.out.println(viktoria.toString());
        System.out.println(ludmila.toString());
        System.out.println(ahmet.toString());
        System.out.println(lilia.toString());
    }
}
