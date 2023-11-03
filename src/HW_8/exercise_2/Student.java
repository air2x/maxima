package HW_8.exercise_2;

//Наследование Student, Aspirant
//        Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
//        Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
//        Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 2000 грн, иначе 1900. Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 2500 грн, иначе 2200.
//        Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.
public class Student {
    private String firstName = "Безымянный";
    private String lastName = "Безымянный";
    private String group;
    private double averageMark;

    public Student() {
    }

    public Student(double averageMark) {
        setAverageMark(averageMark);
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        setFirstName(firstName);
        setLastName(lastName);
        setGroup(group);
        setAverageMark(averageMark);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!firstName.isBlank()) {
            this.firstName = firstName;
        } else {
            System.out.println(getFirstName());
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!lastName.isBlank()) {
            this.lastName = firstName;
        } else {
            System.out.println(getLastName());
        }
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        return getAverageMark() == 5 ? 2000 : 1900;
    }
}
