package specialization_programmer.intruduction_to_java.seminar.seminar_4.practice;

import java.util.LinkedList;

class myStacktask2 {
    private LinkedList<String> stack = new LinkedList<>();
    
    public void push(String element) {
        stack.addFirst(element);
    }

    public String pop() {
        return stack.removeFirst();
    }

    public String peek(){
        return stack.peekFirst();
    }

    public LinkedList<String> getElements() {
        return new LinkedList<>(stack);
    }
}
