package HW_8.exercise_2;

public class Aspirant extends Student {

    private String scientificWorkName;

    @Override
    public int getScholarship() {
        return getAverageMark() == 5 ? 2500 : 2200;
    }
}
