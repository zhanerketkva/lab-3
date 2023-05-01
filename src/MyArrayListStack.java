import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyArrayListStack<E> {
    private MyArrayList<E> list;

    public MyArrayListStack() {
        list = new MyArrayList<>();
    }
    public void push(E element) {
        list.add(element);
    }
    /**add element**/
    public E pop() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }
    /**remove the top element**/
    public E peek() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }
    /**return the front element of the queue without removing it**/

    public boolean isEmpty() {
        return list.isEmpty();
    }
    /** define whether the queue is empty**/
    public int size() {
        return list.size();
    }

}