package second;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int firstInt = console.nextInt();
        int secondInt = console.nextInt();

        if (firstInt > secondInt) {
            System.out.println(firstInt);
        } else {
            System.out.println(secondInt);
        }
    }
}
