// Задача 4. Сдвиг очереди
// Реализуйте метод rotateDeque в классе DequeTasks, который принимает
// Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
// позиций. Если n отрицательное, повернуть влево.

package specialization_programmer.intruduction_to_java.seminar.seminar_4.practice;

import java.util.Deque;
import java.util.LinkedList;

public class task4 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        int n;
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        n = 3;

        DequeTasks.rotateDeque(deque, n);
    }
}
