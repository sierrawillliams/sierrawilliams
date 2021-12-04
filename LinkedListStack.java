public class LinkedListStack <T> implements StackADT<T> {

    private Node<T> top;  // Reference to top element of stack
    private Node<T> bottom;  // Reference to bottom element of stack
    private int count;   // Reference to number of elements in stack

    // Initializes an empty stack
    public LinkedListStack() {

        /* YOUR CODE HERE */
        this.top = null;
        this.bottom = null;
        this.count = 0;
    }

    // Adds the given element to the top of the stack (expands capacity if necessary)
    @Override
    public void push(T element) {

        /* YOUR CODE HERE */
        Node<T> newNode = new Node<>(element, top);
        top = newNode.getLink();
        top = newNode;


    }

    // Removes the top item from the stack and returns it
    @Override
    public T pop() {

        /* YOUR CODE HERE */
        top = (top).getLink();
        return (T) top; //temporary, change this later
    }

    // Returns the top item
    @Override
    public T peek() {

        /* YOUR CODE HERE */
        if (!isEmpty()) {
            return top.getData();
        }

        return null; //temporary, change this later
    }

    // Returns true if the stack is empty and false otherwise
    @Override
    public boolean isEmpty() {

        /* YOUR CODE HERE */
        return top == null;
    }

    // Returns the number of elements in the stack
    @Override
    public int size() {

        /* YOUR CODE HERE */
        return count;
    }

    // Returns a string representation of this stack
    @Override
    public String toString() {

        /* YOUR CODE HERE */
        return "top=" + top + ", bottom=" + bottom + ", count=" + count;

    }
}
