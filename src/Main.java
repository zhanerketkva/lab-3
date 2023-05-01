import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        MyArrayListQueue<String> queue = new MyArrayListQueue<>();
        MyArrayListStack<Integer> stack = new MyArrayListStack<>();
        queue.enqueue("flower");
        queue.enqueue("dog");
        queue.enqueue("cat");

        stack.push(10);
        stack.push(20);
        stack.push(20);

        System.out.println("Size of the queue: " + queue.size());
        /**Print the size of the queue **/
        System.out.println("Front element of the queue: " + queue.peek());
        /** Peek into the front element of the queue**/
        System.out.println("Size of the stack: " + stack.size());
        /**Print the size of the stack**/
        System.out.println("Front element of the stack: " + stack.peek());
        /**Peek into the front element of the stack **/
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
        try {
            queue.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        System.out.println("Stack is empty: " + stack.isEmpty());
        /** Print isEmpty method**/
        System.out.println("Popped element of stack: " + stack.pop());
        /**Print pop method**/
        System.out.println("Popped element of stack: " + stack.pop());
        System.out.println("Popped element of stack: " + stack.pop());

    }
}