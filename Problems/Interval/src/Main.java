import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();

        if (-15 < inputValue && inputValue <= 12 || 14 < inputValue && inputValue < 17 || 19 <= inputValue) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}