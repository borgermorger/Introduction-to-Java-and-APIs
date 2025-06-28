// Задание 1. Удаление отрицательных значений из массива
// Реализуйте метод, который принимает на вход целочисленный массив и
// удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
// только неотрицательные числа.
// Пример:
// [-1, 2, -3, 4, -5, 6]
// Результат:
// [2, 4, 6]

package specialization_programmer.intruduction_to_java.seminar.seminar_3.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] a = new int[]{-1, 2, -3, 4, -5, 6};
        String res = Arrays.toString(filterNegetive(a));
        System.out.println(res);
    }
    public static int[] filterNegetive(int[] a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (num >= 0) {
                result.add(num);
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
