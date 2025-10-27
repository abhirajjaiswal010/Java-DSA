package AdvanceDSA;
class Node<T> {
    T data;        // data of any type
    Node<T> next;  // reference to the next node

    Node(T value) {
        data = value;
        next = null;
    }
}
class LinkedList<T> {
    Node<T> head; // first node

    // Insert a node at the end
    void insert(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Display all nodes
    void display() {
        Node<T> temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}



public class L_05_linkedList {
    public static void main(String[] args) {
        // Integer Linked List
        LinkedList<Integer> intList = new LinkedList<>();
        intList.insert(10);
        intList.insert(20);
        intList.insert(30);
        intList.display();

        // String Linked List
        LinkedList<String> strList = new LinkedList<>();
        strList.insert("Abhi");
        strList.insert("ChatGPT");
        strList.insert("Java");
        strList.display();
    }
}
