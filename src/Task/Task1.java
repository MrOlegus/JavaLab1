package Task;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x: ");
        double x = in.nextDouble();
        System.out.print("y: ");
        double y = in.nextDouble();

        System.out.println("Результат: " + Data.Task1.f(x, y));

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }
}
