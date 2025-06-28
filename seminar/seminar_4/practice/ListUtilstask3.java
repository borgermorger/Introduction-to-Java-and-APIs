package specialization_programmer.intruduction_to_java.seminar.seminar_4.practice;

import java.util.LinkedList;

class ListUtilstask3 {
    public static int countOccurrences(LinkedList<String> list, String value) {
        int count = 0;
        for (String s : list) {
            if (s.equals(value)) {
                count ++;
            }
        }
        return count;
    }
}
