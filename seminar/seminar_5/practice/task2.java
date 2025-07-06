// Задача 2. История посещения веб-сайтов
// Реализуйте программу для хранения и анализа историй посещений веб-сайтов.
// Используйте Deque для хранения истории.
// ● visitSite(String site): Добавляет сайт в историю посещений.
// ● back(int steps): Возвращает название сайта, который был посещен
// steps назад, или null, если таких шагов нет.
// ● getHistory(): Возвращает список сайтов в истории посещений, от
// последнего посещенного к первому.

package specialization_programmer.intruduction_to_java.seminar.seminar_5.practice;

public class task2 {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("stackoverflow.com");
        browserHistory.visitSite("github.com");

        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.getHistory());
    }
}
