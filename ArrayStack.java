
import java.util.EmptyStackException;

public class ArrayStack <T> implements StackADT<T>{

    private T[] stack;
    private int top;

    private final int DEFAULT_CAPACITY = 3;

    // Creates an empty stack using the default capacity
    public ArrayStack() {
        top = 0;
        stack = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    // Creates an empty stack using the specified capacity
    public ArrayStack (int initialCapacity) {
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
//        for(int i = 0; i > initialCapacity; i++){
//           expandCapacity();
//        }

    }

    // Adds the given element to the top of the stack (expands capacity if necessary)
    @Override
    public void push(T element) {
        if (size() <= stack.length)
            expandCapacity();

        stack[top] = element;
        top++;
    }

    // Removes the top item from the stack and returns it
    @Override
    public T pop() throws EmptyStackException {

        /* YOUR CODE HERE */
        if (isEmpty())
            throw new EmptyStackException();
        System.out.println("Stack is empty");

        top--;
        T result = stack[top];
        stack[top] = null;

        return result;
    }

    // Returns the top item
    @Override
    public T peek() throws EmptyStackException{

        /* YOUR CODE HERE */
        if (isEmpty())
            throw new EmptyStackException();

        return stack[top-1];
    }

    // Returns true if the stack is empty and false otherwise
    @Override
    public boolean isEmpty() {

        /* YOUR CODE HERE */
        return (top == 0);
    }

    // Returns the number of elements in the stack
    @Override
    public int size() {

        /* YOUR CODE HERE */
        return top;
    }

    // Returns a string representation of this stack
    @Override
    public String toString() {
        String result = "";

        for (int scan=0; scan < top; scan++)
            result = result + stack[scan].toString() + "\n";

        return result;
    }
    private void expandCapacity()
    {
        T[] larger = (T[])(new Object[stack.length*2]);

        for (int index=0; index < stack.length; index++)
            larger[index] = stack[index];

        stack = larger;
    }
}