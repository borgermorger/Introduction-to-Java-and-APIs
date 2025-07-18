// Задание 1. Студенческий справочник
// Реализуйте программу для работы с простым справочником студентов.
// Программа должна иметь следующие функции:
// ● addStudent(String name, Integer grade): Добавляет или
// обновляет запись о студенте с именем name и оценкой grade. Если
// студент уже существует, обновляет его оценку.
// ● findStudent(String name): Находит оценки студента по его имени.
// Если студент существует, возвращает список его оценок. Если нет —
// пустой список.
// ● getAllStudents(): Возвращает весь справочник студентов в виде
// HashMap, где ключи — имена студентов, а значения — списки их оценок.
// ● removeStudent(String name): Удаляет запись о студенте по имени
// из справочника. Если запись не существует, ничего не происходит.


package specialization_programmer.intruduction_to_java.seminar.seminar_5.practice;

public class task1 {
    public static void main(String[] args) {
        StudentDirectory directory = new StudentDirectory();
        directory.addStudent("Alice", 90);
        directory.addStudent("Bob", 85);
        directory.addStudent("Alice", 95);
        
        System.out.println("Before removal:");
        System.out.println(directory.findStudent("Alice"));
        System.out.println(directory.getAllStudents());
        directory.removeStudent("Alice");
        System.out.println("After removal:");
        System.out.println(directory.findStudent("Alice"));
        System.out.println(directory.getAllStudents());
    }    
}
