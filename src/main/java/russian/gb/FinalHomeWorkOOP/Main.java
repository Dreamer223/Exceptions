package russian.gb.FinalHomeWorkOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float userInput = getInputFloat();
        System.out.println("Вы ввели число: " + userInput);
    }

    public static float getInputFloat() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Введите дробное число (типа float): ");
            String input = scanner.nextLine();

            try {
                result = Float.parseFloat(input);
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Некорректный формат числа. Попробуйте еще раз.");
            }
        }

        return result;
    }
}
