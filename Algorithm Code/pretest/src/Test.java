public class Test {
    public static void main(String[] args){
        MyArrayStack<Integer> myStack=new MyArrayStack<>();

        //push method
        myStack.push(2);
        myStack.push(15);

        //pop method
        System.out.print(myStack.pop());

        //peek method
        System.out.println(myStack.peek());

        //isEmpty method
        myStack.pop();
        if (myStack.isEmpty()==true)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
