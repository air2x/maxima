package HW_8.exercise_2;

public class Test {
    public static void main(String[] args) {
        Student[] students;

        Student student1 = new Student();
        Student student2 = new Student(5.0);
        Aspirant aspirant1 = new Aspirant();
        Aspirant aspirant2 = new Aspirant(5.0);

        students = new Student[]{student1, student2, aspirant1, aspirant2};

        for (Student s : students) {
            System.out.println(s.getScholarship());
        }
    }
}
