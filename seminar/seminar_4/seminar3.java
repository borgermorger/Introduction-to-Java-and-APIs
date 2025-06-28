// Задание №2 
// Дана строка содержащая только символы '(', ')', '{', '}', '[', ']', определите, является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) открытые скобки должны быть закрыты скобками того же типа.
// 2) открытые скобки должны быть закрыты в правильном порядке. Каждый закрывающая скобка имеет соответсвующую открытую скобку того же типа.

// Пример: 
// 1) ()[] = true
// 2) () = true
// 3) {[()]} = true
// 4) ()() = true
// 5) )()( = false

package specialization_programmer.intruduction_to_java.seminar.seminar_4;

import java.util.Stack;

public class seminar3 {
    public static void main(String[] args) {
        String s = "{[())}";
        seminar3 t = new seminar3();
        System.out.println(t.validate(s));
    }

    public boolean validate(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else if (c == ')' && stack.pop() != '(') {
                return false;
            } else if (c == ']' && stack.pop() != '[') {
                return false;
            } else if (c == '}' && stack.pop() != '{') {
                return false;
            }
            }
        return stack.isEmpty();
    }
}
