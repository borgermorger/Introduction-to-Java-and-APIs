// Задание №0
// Дана последовательность чисел. Необходимо вернуть сумму уникальных чисел.
// пример [1, 2, 2, 3]
// результат 4 


package specialization_programmer.intruduction_to_java.seminar.seminar_5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class seminar1 {
    public static void main(final String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3);
        seminar1 task0 = new seminar1();

        System.out.println(task0.getSumOfUniqueValues(list));
    }

public Integer getSumOfUniqueValues(final List<Integer> list) {
    if (list == null || list.isEmpty()) {
        return 0;
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (Integer num: list) {
        if (map.containsKey(num)){
            map.put(num, map.get(num) +1);
        } else {
            map.put(num, 1);
        }
    }
    int counter = 0;
    for (Integer num: map.keySet()) {
        if (map.get(num) == 1) {
            counter += 1;
        }
    }
    return counter;
}
}
