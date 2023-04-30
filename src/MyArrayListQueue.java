import java.util.NoSuchElementException; //necessary exception

public class MyArrayListQueue<E> {
    private MyArrayList<E> list;

    public MyArrayListQueue() {
        list = new MyArrayList<>();
    }
    public void enqueue(E element) {
        list.add(element);
    }
    public E dequeue() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.remove(0);
    }
}