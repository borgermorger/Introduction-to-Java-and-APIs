// Задание №1
// Вам дан массив путей, где пути[i] = ["Город А", "Город Б"] означают, что существует прямой путь, идущий от "Город А" до "Город Б". Верните город назначения, то есть город без какого-либо пути, ведущено в другой город.
// Пример [["Москва", "Самара"], ["Курск", "Пенза"], ["Самара", "Курск"]]
// результат Пенза

package specialization_programmer.intruduction_to_java.seminar.seminar_5;

import java.util.HashMap;
import java.util.Map;

public class seminar2 {
    public static void main(String[] args) {
        Map<String, String> path = new HashMap<>(); 
        path.put("Москва", "Самара");
        path.put("Курск", "Пенза");
        path.put("Самара", "Курск");
        seminar2 t = new seminar2();
        System.out.println(t.getFinalCity(path));
    }
    public String getFinalCity(Map<String, String> path) {
        for (String end: path.values()) {
            if (!path.containsKey(end)) {
                return end;
            }
        }
        return null;
    }
}
