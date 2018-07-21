import java.util.ArrayList;

public class MyArrayStack<E> implements Stack<E> {
    private ArrayList<E> list=new ArrayList<>();

    public void push(E data){
        list.add(data);
    }

    public E pop(){
        return list.remove(list.size()-1);
    }

    public E peek(){
        return list.get(list.size()-1);
    }

    public boolean isEmpty(){
        return list.size()==0;
    }
}
