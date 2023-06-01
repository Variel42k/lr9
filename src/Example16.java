import java.util.InputMismatchException;
import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("Введите номер столбца: ");
        try {
            int column = scanner.nextInt();
            for (int i = 0; i < matrix.length; i++) {
                if (column >= matrix[i].length) {
                    System.out.println("Нет столбца с таким номером.");
                    break;
                }
                System.out.println(matrix[i][column]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных. Введите число.");
        }

    }
}
