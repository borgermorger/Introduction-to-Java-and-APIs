// Задача 3. Подсчет суммы цифр числа
// Напишите метод sumDigits, который принимает целое число n и возвращает
// сумму его цифр.

package practice;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res = sumDigits(n);
        System.out.println(res);
    }
    public static int sumDigits(int n) {
        int sum = 0;
        while (n !=0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
