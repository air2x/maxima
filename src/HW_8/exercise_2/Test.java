package HW_8.exercise_2;

public class Test {
    public static void main(String[] args) {
        Student[] students;

        Student student1 = new Student();
        Student student2 = new Student(4.9);
        Aspirant aspirant1 = new Aspirant();
        Aspirant aspirant2 = new Aspirant(5.0);
        Student student3 = new Aspirant();
        Student student4 = new Aspirant(3.2);
        student1.setFirstName("");
        student1.setLastName("");

        students = new Student[]{student1, student2, aspirant1, aspirant2, student3, student4};

        for (Student s : students) {
            System.out.println(s.getScholarship());
        }
    }
}
