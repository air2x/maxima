package HW_7.exercise_1;

public class Animal {
    private String food;
    private String location;

    public Animal() {
    }

    public Animal(String food, String location) {
        setFood(food);
        setLocation(location);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise(){
        sleep();
    }

    public void eat(){
        System.out.println("Ест " + getFood());
    }
    public void sleep(){
        System.out.println(" спит ");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + getFood() + '\'' +
                ", location='" + getLocation() + '\'' +
                '}';
    }
}
