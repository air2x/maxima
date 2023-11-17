package HW_7.exercise_1;

public class Horse extends Animal {

    private int horseshoeWeight;

    public Horse() {
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    public int getHorseshoeWeight() {
        return horseshoeWeight;
    }

    public void setHorseshoeWeight(int horseshoeWeight) {
        this.horseshoeWeight = horseshoeWeight;
    }

    @Override
    public void makeNoise() {
        System.out.print("Лошадь");
        super.makeNoise();
    }
}
