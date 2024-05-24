package fifth;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String pass = console.nextLine();
        System.out.println("повторите пароль:");
        while (true) {
            System.out.println();
            String password = console.nextLine();
            if (!Objects.equals(password, pass)) {
                System.out.println("Пароль не верный, повторите ввод:");
                continue;
            } else {
                System.out.println("Успешно");
                break;
            }
        }
    }
}
