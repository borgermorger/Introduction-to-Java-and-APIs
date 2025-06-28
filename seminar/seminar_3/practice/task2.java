// Задача 2. Уникальные числа
// Напишите метод, который принимает целочисленный массив и возвращает
// новый массив, содержащий только уникальные элементы из исходного
// массива.
// Пример:
// [1, 2, 2, 3, 4, 4, 5]
// Результат:
// [1, 2, 3, 4, 5]

package specialization_programmer.intruduction_to_java.seminar.seminar_3.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 2, 3, 4, 4, 5};
        String res = Arrays.toString(getUniqueElements(a));
        System.out.println(res);
    }
    public static int[] getUniqueElements(int[] a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (!result.contains(num)) {
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
