package HW_7.exercise_1;

public class Cat extends Animal {

    private int lengthOfClaws;

    public Cat() {
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    public int getLengthOfClaws() {
        return lengthOfClaws;
    }

    public void setLengthOfClaws(int lengthOfClaws) {
        this.lengthOfClaws = lengthOfClaws;
    }

    @Override
    public void makeNoise() {
        System.out.print("Кошка");
        super.makeNoise();
    }
}
