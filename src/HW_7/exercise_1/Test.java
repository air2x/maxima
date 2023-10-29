package HW_7.exercise_1;

public class Test {
    public static void main(String[] args) {
        Animal[] animals;
        Cat cat1 = new Cat("Рыба", "Казань");
        Dog dog1 = new Dog("Мясо", "Москва");
        Horse horse1 = new Horse("Морковь", "Самара");
        Animal cat2 = new Cat("Молоко", "Нижний Новгород");
        Animal dog2 = new Dog("Кость", "Тольятти");
        Animal horse2 = new Horse("Сено", "Уфа");
        animals = new Animal[]{cat1, dog1, horse1, cat2, dog2, horse2};

        dog1.makeNoise();
        dog1.eat();
        dog2.makeNoise();
        dog2.eat();

        Veterinarian vet = new Veterinarian();
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
