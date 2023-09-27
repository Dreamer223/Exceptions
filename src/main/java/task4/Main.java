package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String userInput = getInputString();
            System.out.println("Вы ввели: " + userInput);
        } catch (EmptyStringException e) {
            System.out.println("Ошибка: Пустые строки вводить нельзя.");
        }
    }

    public static String getInputString() throws EmptyStringException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new EmptyStringException();
        }

        return input;
    }
}


