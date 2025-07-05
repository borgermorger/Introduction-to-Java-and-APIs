package specialization_programmer.intruduction_to_java.seminar.seminar_4.practice;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTasks {
    public static void rotateDeque(Deque<Integer> deque, int n) {
        if (deque.isEmpty()) return;
        int size = deque.size();
        n = n % size;
        if (n < 0) {
            n += size;
        }
        for (int i = 0; i < n; i++) {
            deque.addLast(deque.removeFirst());
        } 
        System.out.println(deque);
    }

    public static void removeAllOccurrences(Deque<String> deque, String value) {
        deque.removeIf(element -> element.equals(value));
        System.out.println(deque);
    }
}
