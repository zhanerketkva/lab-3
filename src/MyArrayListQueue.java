import java.util.NoSuchElementException;

public class MyArrayListQueue<E> {
    private MyArrayList<E> list;

    public MyArrayListQueue() {
        list = new MyArrayList<>();
    }
    public void enqueue(E element) {
        list.add(element);
    }
    /**add an element to the back of the queue**/
    public E dequeue() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.remove(0);
    }
    /**remove and return the front element of the queue**/
    public E peek() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.get(0);
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int size() {
        return list.size();
    }
}