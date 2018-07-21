import java.util.ArrayList;

public interface Stack<E> {
    public void push(E data);
    public E pop();
    public E peek();
    public boolean isEmpty();
}
