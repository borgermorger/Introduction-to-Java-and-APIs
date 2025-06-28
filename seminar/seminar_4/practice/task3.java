// Задача 3. Количество вхождений слова
// Реализуйте метод countOccurrences в классе ListUtils, который
// принимает LinkedList<String> и строку, и возвращает количество
// вхождений строки в список.

package specialization_programmer.intruduction_to_java.seminar.seminar_4.practice;

import java.util.LinkedList;

public class task3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        String value = "apple";

            list.add("apple");
            list.add("banana");
            list.add("apple");
            list.add("pear");
            list.add("banana");

        ListUtilstask3 utils = new ListUtilstask3();
        System.out.println("Occurrences of \"" + value + "\": " + utils.countOccurrences(list, value));
    }
}
