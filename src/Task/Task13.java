package Task;

import Data.ProgrammerBook;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        ProgrammerBook book1 = new ProgrammerBook("Voina_i_mir", "Tolstoy", 1, 2, "Russian", 3);
        ProgrammerBook book2 = new ProgrammerBook("Voina_i_mir", "Tolstoy", 1, 2, "Russian", 3);
        System.out.println("книга 1: " + book1.toString());
        System.out.println("книга 2: " + book2.toString());
        System.out.println("Результат сравнения книг: " + book1.equals(book2));
        System.out.println("Хэш-код книги 1: " + book1.hashCode());
        System.out.println("Хэш-код книги 2: " + book2.hashCode());

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }
}
