package HW_9.exercise_2;

//Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
//NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.
//Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
//ArithmeticException и URISyntaxException.

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Test {
    public static void main(String[] args) throws Exception {

        try {
            method1();
        } catch (NullPointerException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new NullPointerException();
        } else if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}
