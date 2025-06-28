// Задание №1
// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на
// экран.

package specialization_programmer.intruduction_to_java.seminar.seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class seminar2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        seminar2 task2 = new seminar2();
        System.out.println(task2.sortByCollections(list).toString());
        System.out.println(task2.sortByComparator(list).toString());
    }    
    public List<Integer> sortByCollections(List<Integer> list) {
        Collections.sort(list);
        return list;
    }
    public List<Integer> sortByComparator(List<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}
