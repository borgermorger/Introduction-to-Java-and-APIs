// Задача 2. Реализация стека
// Реализуйте MyStack с использованием LinkedList с методами:
// ● push(String element) - добавляет элемент на вершину стека
// ● pop() - возвращает элемент с вершины и удаляет его
// ● peek() - возвращает элемент с вершины, не удаляя
// ● getElements() - возвращает все элементы стека

package specialization_programmer.intruduction_to_java.seminar.seminar_4.practice;

public class task2 {
    public static void main(String[] args) {
        myStacktask2 stack = new myStacktask2();

        stack.push("apple");
        stack.push("banana");
        stack.push("pear");
        stack.push("grape");
        
        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.peek());
    }
}
