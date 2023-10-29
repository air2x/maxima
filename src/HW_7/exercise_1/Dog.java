package HW_7.exercise_1;

public class Dog extends Animal {

    private int biteForce;

    public Dog() {
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    public int getBiteForce() {
        return biteForce;
    }

    public void setBiteForce(int biteForce) {
        this.biteForce = biteForce;
    }

    @Override
    public void makeNoise() {
        System.out.print("Собака");
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }
}
