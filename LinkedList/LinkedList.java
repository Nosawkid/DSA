package LinkedList;

// Node class that initializes the node with the value
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedList {
    // head pointer to point to the first Node
    Node head;
    // tail pointer to point to the last Node
    Node tail;

    // Constructor that initializes the LinkedList with head and tail pointing to
    // the newly added Node

    LinkedList(int data) {
        // Create new node
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    // Appending a node at the end of the List
    public void appendNode(int data) {
        // Create a new Node
        Node newNode = new Node(data);
        // Check if the List is empty
        if (head == null) {
            // If list is empty both head and tail should point to the newly created node
            head = newNode;
            tail = newNode;
            return;
        }
        // If the list is not empty , use the last node to add nodes
        // Point the last node to the new node
        tail.next = newNode;
        // Move tail to the newly created node
        tail = newNode;
    }

    // Deleting a node from end of the list
    public Node pop() {
        // Returns null if the List is empty
        if (head == null)
            return null;

        Node temp = head;
        Node pre = head;
        // If there is only one element in the list then iteration won't work
        if (head.next == null) {
            head = null;
            tail = null;
            return temp;
        }
        // After this looping temp will be pointing to the last element while pre will
        // be pointing to the second last element
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        // Setting the next of second last element as null
        pre.next = null;
        // Moving tail from the last element to second last element
        tail = pre;
        // Returns the last node
        return temp;
    }
}