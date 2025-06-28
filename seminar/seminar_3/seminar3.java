// Задание №3
// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку вывести информацию, какое значение строка, а какое - число.

package specialization_programmer.intruduction_to_java.seminar.seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class seminar3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        seminar3 task3 = new seminar3();
        task3.printResultofCheck(list);
    }
    
    public void printResultofCheck(List<String> list) {
        for (String s: list) {
            try {
                int i = Integer.valueOf(s);
                System.out.println(i + " - число");
            } catch (NumberFormatException e) {
                System.out.println(s + " -строка");
            }     
        }
    }
}
