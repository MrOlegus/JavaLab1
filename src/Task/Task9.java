package Task;

import Data.Ball;
import Data.Basket;
import java.util.Scanner;

import static java.lang.Math.round;

public class Task9 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add(new Ball("blue", 2));
        basket.add(new Ball("green", 3));
        basket.add(new Ball("white", 5));
        basket.add(new Ball("black", 7));
        basket.add(new Ball("blue", 11));
        System.out.println("Синих шаров: " + basket.countOf("blue"));
        System.out.println("Общий вес шаров: " + round(basket.sumWeight() * 100) / 100.0);

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }
}
