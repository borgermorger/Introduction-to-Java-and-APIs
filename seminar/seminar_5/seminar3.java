// Задание №2
// Дана строка. Необходимо написать метод, который отсортирует слова в строке по длине с помощью TreeMap. Строки с одинковой длинной не должны "потеряться". 
// Пример строки: Я помню чудное мгновенье Передо мной явилась ты Как мимолетное виденье Как гений чистой красоты

package specialization_programmer.intruduction_to_java.seminar.seminar_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class seminar3 {
    public static void main(final String[] args) {
        String s = "Я помню чудное мгновенье Передо мной явилась ты Как мимолетное виденье Как гений чистой красоты";
        seminar3 t = new seminar3();
        System.out.println(t.getSortedIncludesWords(s));
    }
    public String getSortedIncludesWords(final String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        Map<Integer, List<String>> result = new TreeMap<>();
        List<String> tempList;
        for(String subwords: s.split(" ")) {
            int size = subwords.length();
            if (result.containsKey(size) && ! result.get(size).contains(subwords)) {
                tempList = result.get(size);
            } else {
                tempList = new ArrayList<>();
            }
            tempList.add(subwords);
            result.put(size, tempList);
        }
        return result.toString();
    }
}
