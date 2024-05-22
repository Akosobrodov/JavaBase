package third;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое значение");
        int firstInt = console.nextInt();
        System.out.println("Введите второе значение");
        int secondInt = console.nextInt();

        for (int i = firstInt; i < secondInt; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
