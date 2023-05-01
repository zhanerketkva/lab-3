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

    }
}