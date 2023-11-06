package HW_9.exercise_1;

//Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить
// WrongLoginException.
//Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20 символов.
// Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить
// WrongPasswordException.
//WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
// второй принимает сообщение исключения и передает его в конструктор класса Exception.
//Обработка исключений проводится внутри метода.
//Используем multi-catch block. Спросите мня в чате, если не удастся нагуглить.
//Метод возвращает true, если значения верны или false в другом случае.

import HW_9.exercise_1.exception.WrongLoginException;
import HW_9.exercise_1.exception.WrongPasswordException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин. Только латинские буквы, цифры и знак подчеркивания не более 20 знаков");
        String login = sc.nextLine();
        System.out.println("Введите пароль. Только латинские буквы, цифры и знак подчеркивания не более 20 знаков");
        String password = sc.nextLine();
        System.out.println("Повторите пароль.");
        String confirmPassword = sc.nextLine();

        if (checksLogPas(login, password, confirmPassword)) {
            System.out.println("Успешно");
        } else {
            System.out.println("Повторите попытку");
        }
    }

    public static boolean checksLogPas(String login, String password, String confirmPassword) {
        try {
            if (!login.matches(".*[a-z].*") || !login.matches(".*[A-Z].*") || !login.matches(".*[0-9].*")
                    || !login.matches(".*[_].*") || login.length() > 20) {
                throw new WrongLoginException("ОШИБКА. Неверный логин");
            }
            if (!password.matches(".*[a-z].*") || !password.matches(".*[A-Z].*") || !password.matches(".*[0-9].*")
                    || !password.matches(".*[_].*") || password.length() > 20) {
                throw new WrongPasswordException("ОШИБКА. Неверный пароль");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("ОШИБКА. Неверный повтор пароля");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

