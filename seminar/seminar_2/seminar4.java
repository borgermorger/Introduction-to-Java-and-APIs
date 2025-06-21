// Задание №4 
// Вам дается строка S и целочисленнеый массив индексов int index[s.length]. Напишите программу, которая перетасует символы в S таким образом, что символ с i-й позиции переместиться на индекс index[i] в результирующей строке.
// пример: "cba", index = [3, 2, 1]
// результат "abc"

package specialization_programmer.intruduction_to_java.seminar.seminar_2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class seminar4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("seminar4");
        logger.info("Введите исходную строку");
        String s = scanner.next();
        int[] array = new int[s.length()];
        for (int i = 0; i < s.length(); i ++) {
            logger.info("Введите значение индекса массива");
            array[i] = scanner.nextInt();
        }
        char[] result = new char[s.length()];
        for (int i = 0; i < array.length; i ++) {
            char temp = s.charAt(i);
            int tempIndex = array[i];
            result[tempIndex - 1] = temp;
        }
        logger.info(Arrays.toString(result));
    }
}
