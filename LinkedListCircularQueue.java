public class LinkedListCircularQueue {

    private int count;
    private Node front, rear;

    // Creates an empty queue
    public LinkedListCircularQueue() {

        /* YOUR CODE HERE */
        count = 0;
        front = rear = null;
    }

    // Adds the specified element to the rear of the queue
    public void enqueue(String element) {

        /* YOUR CODE HERE */
        Node node = new Node(element, null);

        if (isEmpty())
            front = node;
        else
            rear.setLink(node);

        rear = node;
        count++;

    }

    // Removes the element at the front of the queue and returns a reference to it
    public String dequeue() {

        /* YOUR CODE HERE */
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        String result = front.getData();
        front = front.getLink();
        count--;
        if (isEmpty()) {
            rear = null;
        }

        return result;
    }

    // Returns the element at the front of the queue without removing it
    public String first() {

        /* YOUR CODE HERE */
        if (isEmpty()) {
            System.out.println("Queue is empty, can't remove any item.");
            return null;
        }
        return front.getData();
    }

    // Returns true if the queue contains no elements, false otherwise
    public boolean isEmpty() {

        /* YOUR CODE HERE */
        return (count == 0);
    }

    // Returns the number of elements in the queue
    public int size() {

        /* YOUR CODE HERE */
        return count;

    }

    // Returns a string representation of the queue
    public String toString() {
        String result = "";
        Node current = front;
        if (!isEmpty())
            do {
                result = result + (current.getData()) + "\t";
                current = current.getLink();
            } while (current != front);
        return result;
    }
}