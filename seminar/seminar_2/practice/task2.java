// Задача 2. Создание CSV-строки из массива объектов
// Дан массив объектов, где каждый объект представляет собой строку данных, и
// массив заголовков. Создайте строку CSV, где строки данных разделяются новой
// строкой, а значения в строках разделяются запятыми.
// Пример:
// String[] headers = {"Name", "Age", "City"};
// String[][] data = {
// {"John", "30", "New York"},
// {"Alice", "25", "Los Angeles"},
// {"Bob", "35", "Chicago"}
// };
// Результат:
// Name,Age,City
// John,30,New York
// Alice,25,Los Angeles
// Bob,35,Chicago

package specialization_programmer.intruduction_to_java.seminar.seminar_2.practice;

public class task2 {
    public static void main(String[] args) {
        String[] headers = {"Name", "Age", "City"};
        String[][] data = {
            {"John", "30", "New York"},
            {"Alice", "25", "Los Angeles"},
            {"Bob", "35", "Chicago"}
        };
        System.out.println(generateCSV(headers, data));
    }
    public static String generateCSV(String[] headers, String[][] data) {
        StringBuilder csv = new StringBuilder();
        csv.append(String.join(",", headers)).append("\n");
        for (String[] row : data) {
            csv.append(String.join(",", row)).append("\n");
        }
        return csv.toString();
    }
}
