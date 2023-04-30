import java.util.EmptyStackException; //necessary exception
import java.util.NoSuchElementException;

public class MyArrayListStack<E> {
    private MyArrayList<E> list;

    public MyArrayListStack() {
        list = new MyArrayList<>();
    }
    public void push(E element) {
        list.add(element);
    }
    public E pop() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }
}