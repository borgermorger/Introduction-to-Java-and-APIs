// Задача 4*. Среднее значение массива
// Напишите метод, который принимает массив целых чисел и возвращает
// среднее значение элементов массива, округленное до ближайшего целого
// числа.
// Пример:
// [4, 2, 7, 5, 1]
// Результат:
// 4


package specialization_programmer.intruduction_to_java.seminar.seminar_3.practice;

public class task4 {
    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 7, 5, 1};
        int res = calculateAverage(a);
        System.out.println(res);
    }
    public static int calculateAverage(int[] a) {
        if (a.length == 0) return 0;
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return (int) Math.round((double) sum / a.length);
    }
}
