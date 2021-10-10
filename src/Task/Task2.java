package Task;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x: ");
        double x = in.nextDouble();
        System.out.print("y: ");
        double y = in.nextDouble();

        if (((x >= Data.Task2.rect1.x1) && (x <= Data.Task2.rect1.x2) && (y <= Data.Task2.rect1.y1) && (y >= Data.Task2.rect1.y2)) ||
                ((x >= Data.Task2.rect2.x1) && (x <= Data.Task2.rect2.x2) && (y <= Data.Task2.rect2.y1) && (y >= Data.Task2.rect2.y2))) {
            System.out.println("Внутри");
        } else {
            System.out.println("Снаружи");
        }

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }
}


