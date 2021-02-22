import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();

        System.out.println(string.substring(number1, number2 + 1));
    }
}