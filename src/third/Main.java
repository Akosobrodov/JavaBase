package third;

public class Main {
    public static void main(String[] args) {

        int firstInt = 1;
        int secondInt = 10;

        for (int i = firstInt; i < secondInt; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
