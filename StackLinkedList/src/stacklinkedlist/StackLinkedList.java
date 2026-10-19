
package stacklinkedlist;


public class StackLinkedList {
    

    // Node class definition
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Top of the stack
    private Node top;

    // Constructor
    public StackLinkedList() {
        top = null;
    }

    // Push method: Add element to top of stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Pop method: Remove and return top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    // Peek method: View top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Display method: Print all stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Helper method to check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Main method
    public static void main(String[] args) {

        // Create a stack
        StackLinkedList stack = new StackLinkedList();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println();

        // Display stack
        stack.display();

        // View top element
        System.out.println("Top element: " + stack.peek());

        // Remove an element
        System.out.println("Removed: " + stack.pop());

        // View top again
        System.out.println("Top element: " + stack.peek());

        // Display stack again
        stack.display();
    }
}

    
    
    
    

