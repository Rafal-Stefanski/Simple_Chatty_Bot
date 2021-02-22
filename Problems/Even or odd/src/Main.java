import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num1 = scanner.nextInt();

        while (true) {
            if (num1 != 0) {
                if (num1 % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
                num1 = scanner.nextInt();
            } else {
                break;
            }
        }
    }
}