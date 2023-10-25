package HW_6.Exercise_1;

public class HumanTest {
    public static void main(String[] args) {
        Human stas = new Human("Stas", true, 43);
        Human julia = new Human("Julia", false, 38);
        Human albert = new Human("Albert", true, 55);
        Human tatiana = new Human("Tatiana", false, 42);
        Human ivan = new Human("Ivan", true, 21, stas, julia);
        Human vika = new Human("Vika", false, 20, albert, tatiana);
        Human lusa = new Human("Lusa", false, 2, ivan, vika);
        Human ahmet = new Human("Ahmet", true, 18, stas, julia);
        Human lilia = new Human("Lilia", false, 15, albert, tatiana);

        System.out.println(stas.toString());
        System.out.println(albert.toString());
        System.out.println(julia.toString());
        System.out.println(tatiana.toString());
        System.out.println(ivan.toString());
        System.out.println(vika.toString());
        System.out.println(lusa.toString());
        System.out.println(ahmet.toString());
        System.out.println(lilia.toString());
    }
}
