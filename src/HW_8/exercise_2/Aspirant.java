package HW_8.exercise_2;

public class Aspirant extends Student {

    private String scientificWorkName;

    public Aspirant() {
    }

    public Aspirant(double averageMark) {
        super(averageMark);
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWorkName) {
        super(firstName, lastName, group, averageMark);
        setScientificWorkName(scientificWorkName);
    }

    public String getScientificWorkName() {
        return scientificWorkName;
    }


    public void setScientificWorkName(String scientificWorkName) {
        this.scientificWorkName = scientificWorkName;
    }

    @Override
    public int getScholarship() {
        return getAverageMark() == 5 ? 2500 : 2200;
    }
}
