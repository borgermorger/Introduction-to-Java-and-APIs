package specialization_programmer.intruduction_to_java.seminar.seminar_5.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentDirectory {
    private HashMap<String, ArrayList<Integer>> studentMap = new HashMap<>();
    public void addStudent(String name, Integer grade) {
        studentMap.computeIfAbsent(name, k -> new ArrayList<>()).add(grade);
    }
    public ArrayList<Integer> findStudent(String name) {
        return studentMap.getOrDefault(name, new ArrayList<>());
    }
    public HashMap<String, ArrayList<Integer>> getAllStudents() {
        return studentMap;
    }
    public void removeStudent(String name) {
        studentMap.remove(name);
    }
}
