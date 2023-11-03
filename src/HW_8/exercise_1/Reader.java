package HW_8.exercise_1;

//Читатели библиотеки
//        Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//
//        ФИО,
//        номер читательского билета,
//        факультет,
//        дата рождения,
//        телефон.
//        Методы takeBook(), returnBook().
//        Разработать программу, в которой создается массив объектов данного класса.
//        Перегрузить методы takeBook(), returnBook():
//        - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//        - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
public class Reader {
    private String fullName;
    private int cardNum;
    private String department;
    private String dateOfBirth;
    private String phoneNum;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void takeBook() {

    }
}
