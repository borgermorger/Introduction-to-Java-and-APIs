// Задача 5*. Удаление слова из очереди
// Реализуйте метод removeAllOccurrences в классе DequeTasks, который
// принимает Deque<String> и строку value. Метод должен удалить все
// вхождения строки value из очереди.


package specialization_programmer.intruduction_to_java.seminar.seminar_4.practice;

import java.util.Deque;
import java.util.LinkedList;

public class task5 {
        public static void main(String[] args) {
            Deque<String> deque = new LinkedList<>();
            String value;
            deque.add("apple");
            deque.add("banana");
            deque.add("apple");
            deque.add("pear");
            deque.add("banana");
            value = "apple";

            DequeTasks.removeAllOccurrences(deque, value);
        }
}
