// Задание №1
// Даны два Deque представляющие два неотрицательнеых целых числа. Цифры хранятся в обратном порядке, и каждый из их узлов содержит одну цифрую Сложите два числа и верните сумму в виде связанного списка.

package specialization_programmer.intruduction_to_java.seminar.seminar_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class seminar2 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        seminar2 task2 = new seminar2();
        System.out.println(task2.sum(d1, d2).toString());
    }
    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        if (d1 == null || d2 == null) {
            throw new IllegalStateException();
        }
        Deque<Integer> result = new ArrayDeque<>();
        int digit = 0;
        while (d1.size() > 0 || d2.size() > 0) {
            int sum = 0 + digit;
            digit = 0;
            if (d1.size() > 0) {
                sum += d1.poll();
            }
            if (d2.size() > 0) {
                sum += d2.poll();
            }
            if (sum > 9) {
                digit = 1;
                sum -= 10;
            }
            result.offer(sum);
        }
        if (digit != 0) {
            result.offer(digit);
        }
        return result;
    }
}
