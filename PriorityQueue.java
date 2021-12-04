//*
//        * Notice that System.out.println() has been called in most methods
//        * We recommend that you keep these lines of code where they are,
//        * to help you follow the process of your code.
//        */

public class PriorityQueue {

    //Reference to the first node in the queue
    private PQNode first;
    int count =0;

    // Default constructor, initializes empty list
    public PriorityQueue(){

        /* YOUR CODE HERE */
        first = null;
    }

    // First add method
    public void add(String name, String problem, int priority) {
        /* DO NOT EDIT THIS METHOD */
        add(new PQNode(name, problem, priority));
    }

    // Second add method
    private void add(PQNode node) {
        System.out.println("add "+node.getName());

        /* YOUR CODE HERE */
       PQNode newNode = new PQNode(node.getName(), node.getProblem(), node.getPriority());
        peek();
       if(first == null) {
           first = newNode;
       }else {

           if(newNode.getPriority() < first.getPriority()) {
               PQNode next = node.getNext();
               next = first;
               first = newNode;
           } else {
               PQNode current = first;
               while (current.getNext() != null && newNode.getPriority() >= current.getNext().getPriority())
                   current = current.getNext();

               newNode.setNext(current.getNext());
               current.setNext(newNode);
               count++;
           }
           }
        }

    public PQNode remove() {
        System.out.println("remove");

        /* YOUR CODE HERE */
        return null; //temporary, change this later
    }

    private PQNode remove(PQNode node) {
        System.out.println("remove "+node.getName());

        /* YOUR CODE HERE */
        return null; //temporary, change this later
    }

    public PQNode peek() {
        return first;
    }

    public boolean isEmpty() {

        /* YOUR CODE HERE */
        return size() == 0;
    }

    public int size() {

        /* YOUR CODE HERE */

        return count;
    }

    public void changePriority(String name, int newPriority) {
        System.out.println("change priority of "+name+" to "+newPriority);

        /* YOUR CODE HERE */
        if(newPriority > first.getPriority()){

        } else if (newPriority <= first.getPriority()){
            name = first.getName();
            newPriority = first.getPriority();
        }

    }

    public String toString() {
        /* DO NOT EDIT THIS METHOD */
        if(isEmpty()){
            return "Empty queue";
        }
        int index = 1;
        PQNode current = first;
        String s = "----------\n";
        while(current != null) {
            s += "-  #"+index+": "+current.toString()+"\n";
            current = current.getNext();
            index++;
        }
        s += "----------";
        return s;
    }
}
