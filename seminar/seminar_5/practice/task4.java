// Задача 4. Сортировка слиянием
// Напишите программу, которая реализует сортировку слиянием. Программа
// должна содержать два основных метода: merge для объединения двух
// отсортированных массивов в один отсортированный, и mergeSort для
// сортировки массива с использованием сортировки слиянием.

package specialization_programmer.intruduction_to_java.seminar.seminar_5.practice;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] initArray;

        initArray = new int[] {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        MergeSort.mergeSort(initArray);
        System.out.println("sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
