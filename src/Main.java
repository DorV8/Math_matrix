import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int n = scanner.nextInt();
        double[][] matrix = new double[n][n];
        double dg = 0;
        double sum = 0;
        double pr = 1;
        Instant start = Instant.now();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (10234 - 9503) + 9503);
                if (i==j) {
                    dg = dg + matrix[i][j];
                }
                sum = sum + matrix[i][j];
                pr = pr * matrix[i][j];
                System.out.printf("%10.2f",matrix[i][j]);
            }
            System.out.println();
        }
        System.out.printf("%52s","Главная диагональ матрицы: ");
        System.out.println(dg);
        System.out.printf("%52s","Сумма всех членов: ");
        System.out.println(sum);
        System.out.printf("%52s","Произведение всех членов в экспоненциальной форме: ");
        System.out.printf("%.3e", pr);
        Instant finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();
        System.out.println();
        System.out.println("Прошло времени, мс: " + elapsed);
    }
}