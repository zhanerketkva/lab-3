import java.util.EmptyStackException; //necessary exception
import java.util.NoSuchElementException;

public class MyArrayListStack<E> {
    private MyArrayList<E> list;

    public MyArrayListStack() {
        list = new MyArrayList<>();
    }
}