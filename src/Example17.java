import java.util.InputMismatchException;
import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        byte[] array = new byte[size];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.print("Введите элемент массива: ");
                array[i] = scanner.nextByte();
                sum += array[i];
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода данных. Введите число.");
                scanner.nextLine();
                i--;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка. Выход за границы массива.");
                break;
            }
        }
        System.out.println("Сумма элементов массива: " + sum);

    }
}
