package specialization_programmer.intruduction_to_java.seminar.seminar_5.practice;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while(i < left.length) {
            result[k++] = left[i++];
        }
        while(j < right.length) {
            result[k++] = right[j++];
        }
    }

    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, array);
    }
}
