package HW_8.exercise_1;

public class Test {
    public static void main(String[] args) {
        Reader[] readers;
        Reader reader1 = new Reader("Петров В.В.");
        Reader reader2 = new Reader("Ивано А.С.");
        Reader reader3 = new Reader("Сидоров Г.К.");
        Reader reader4 = new Reader("Быков И.Ф.");
        readers = new Reader[]{reader1, reader2, reader3, reader4};

        Book book1 = new Book("Приключения", "Петров А.А.");
        Book book2 = new Book("Словарь", "Ивано А.А.");
        Book book3 = new Book("Энциклопедия", "Быков А.А.");

        reader1.takeBook(5);
        reader1.takeBook("Словарь", "Энциклопедия", "Приключения");
        System.out.println("");
        reader1.takeBook(book1, book2, book3);
        System.out.println("");
        reader1.returnBook(5);
        reader1.returnBook("Словарь", "Энциклопедия", "Приключения");
        System.out.println("");
        reader1.returnBook(book1, book2, book3);
    }
}
