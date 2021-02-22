import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String isJ = scanner.nextLine();
        scanner.close();
        System.out.println(isJ.toUpperCase().startsWith("J"));
    }
}