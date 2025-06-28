// Задание 1. Удаление нечетных строк
// Дан LinkedList с несколькими элементами. В методе
// removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
// которых нечетная. Используйте LinkedList и стандартные методы.

package specialization_programmer.intruduction_to_java.seminar.seminar_4.practice;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("apple");
        ll.add("banana");
        ll.add("pear");
        ll.add("grape");
        
        System.out.println(ll);
        removeOddLengthStrings(ll);
        System.out.println(ll);
    }
    public static void removeOddLengthStrings(LinkedList<String> ll) {
        LinkedList<String> toRemove = new LinkedList<>();
        for (String s : ll) {
            if (s.length() % 2 != 0) {
                toRemove.add(s);
            }
        }
        ll.removeAll(toRemove);
    }
}
