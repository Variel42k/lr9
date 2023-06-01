import java.util.InputMismatchException;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                int num = scanner.nextInt();
                if (num > 0) {
                    sum += num;
                    count++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода данных. Введите число.");
                scanner.nextLine();
            }
        }
        if (count == 0) {
            System.out.println("Положительные элементы отсутствуют.");
        } else {
            double avg = (double) sum / count;
            System.out.println("Среднее значение среди положительных элементов: " + avg);
        }
    }
}
