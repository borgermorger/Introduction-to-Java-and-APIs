// Задача 3. Удаление пустых строк из текста
// Дана строка с несколькими строками текста, разделенными переводами строки.
// Напишите метод, который удаляет все пустые строки из текста.
// Пример:
// line1


// line2


// line3


// Результат:
// line1
// line2
// line3
package specialization_programmer.intruduction_to_java.seminar.seminar_2.practice;

public class task3 {
    public static void main(String[] args) {
        String text = "line1\n\nline2\n\nline3";

        System.out.println(removeEmptyLines(text));
    }
    public static String removeEmptyLines(String text) {
        String[] lines = text.split("\n");
        StringBuilder cleanedText = new StringBuilder();

        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                if (cleanedText.length() > 0) {
                    cleanedText.append("\n");
                }
                cleanedText.append(line);
            }
        }
        return cleanedText.toString();
    }
}
