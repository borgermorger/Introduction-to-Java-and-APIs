// Задача 3. Длина слов
// Реализуйте метод, который принимает на вход массив строк и возвращает
// новый массив, содержащий только строки, длина которых больше 3 символов.
// Пример:
// ["cat", "elephant", "dog", "giraffe"]
// Результат:
// ["elephant", "giraffe"]

package specialization_programmer.intruduction_to_java.seminar.seminar_3.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        String[] arr = new String[]{"cat", "elephant", "dog", "giraffe"};
        String res = Arrays.toString(filterShortStrings(arr));
        System.out.println(res);
    }
    public static String[] filterShortStrings(String[] arr) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : arr) {
            if (s.length() > 3) {
                result.add(s);
            }
        }
        String[] resultStrings = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultStrings[i] = result.get(i);
        }
        return resultStrings;
    }
}
