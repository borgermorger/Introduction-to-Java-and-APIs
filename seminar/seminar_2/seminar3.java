// Задание №3
// Посчитайте сколько "драгоценных камней" в куче "обычных камней"

// пример: jewels ="aB", stones = "aaaAbbbB"
// результат: "a3B1"

package specialization_programmer.intruduction_to_java.seminar.seminar_2;

import java.util.Scanner;
import java.util.logging.Logger;

public class seminar3 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("seminar3");
        logger.info("ВВедите значение драгоценных камней");
        String jewels = scanner.next();
        logger.info("Введите строку содержащую обычные камни");
        String stones = scanner.next();
        if (jewels.length() == 0) {
            throw new Exception("Не введен ни один символ соответсвующий драгоценностям");
        }
        if (stones.length() == 0) {
            throw new Exception("Не введен ни один символ соотвествующий куче обычных камней");
        }

        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (char c1: jewels.toCharArray()) {
            for (char c2: stones.toCharArray()) {
                if (c1 == c2) {
                    counter ++;
                }
            }
            sb.append(c1)
                .append(":")
                .append(counter)
                .append(" ");
            counter = 0;
        }
        logger.info(sb.toString());
    }
}
