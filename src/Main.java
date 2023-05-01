import java.util.NoSuchElementException;

public class main {
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
        System.out.println("Front element of the queue: " + queue.peek());
        System.out.println("Size of the stack: " + stack.size());
        System.out.println("Front element of the stack: " + stack.peek());
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
        try {
            queue.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        System.out.println("Stack is empty: " + stack.isEmpty());

    }
}