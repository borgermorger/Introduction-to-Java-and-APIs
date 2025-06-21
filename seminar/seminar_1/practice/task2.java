// Задача 2. Вывод всех четных чисел от 1 до 100
// Напишите метод printEvenNums, который выведет на экран все четные числа
// в промежутке от 1 до 100, каждое на новой строке.

package practice;

public class task2 {
    public static void main(String[] args) {
        printEvenNums(1, 100);
    }
    public static void printEvenNums(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
