// Задание 1. Нахождение факториала числа
// Напишите метод factorial, который принимает число n и возвращает его
// факториал. Если число n < 0, метод должен вернуть -1.

package practice;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = factorial(n);
        System.out.println(res);
    } 
    
    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        int result =1;
        for (int i = 2; i <=n; i++) {
            result *=i;
        }
        return result;
    }
}
