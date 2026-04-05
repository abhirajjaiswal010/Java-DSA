package LinkedList;

import java.util.LinkedList;

public class SingleList {

    // =========================
    // 🔹 Node Structure Fields
    // =========================
    private Node head;   // first node of list
    private Node tail;   // last node of list
    private int size;    // total elements

    // =========================
    // 🔹 Constructor
    // =========================
    public SingleList() {
        this.size = 0;
    }

    // =========================
    // 🔹 Insert at Beginning
    // =========================
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;   // new node points to old head
        head = node;        // update head

        // if list was empty
        if(tail == null) {
            tail = head;
        }

        size++;
    }

    // =========================
    // 🔹 Delete First Node
    // =========================
    public int deleteFirst() {
        int val = head.data;
        head = head.next;   // move head forward

        // if list becomes empty
        if(head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    // =========================
    // 🔹 Delete at Index
    // =========================
    public int delete(int index) {

        if(index == 0) {
            return deleteFirst();
        }

        if(index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.data;

        prev.next = prev.next.next; // bypass node
        size--;

        return val;
    }

    // =========================
    // 🔹 Display List
    // =========================
    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // =========================
    // 🔹 Display List by recursion
    // =========================
    public void displayList(){
        displayHelper(head);


    }
    public void displayHelper(Node node){
        if(node==null){
            System.out.print("null");
            return;
        }
        System.out.print(node.data+"->");
        displayHelper(node.next);
    }

    // =========================
    // 🔹 Insert at End
    // =========================
    public void insertLast(int val) {
        //create it
        Node node = new Node(val);

        // case 1: empty list
        if(tail == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        // case 2: normal case
        //appear it
        tail.next = node;
        // add it
        tail = node;
        size++;
    }

    // =========================
    // 🔹 Delete Last Node
    // =========================
    public int deleteLast() {

        // if only one element
        if(size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.data;

        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }

    // =========================
    // 🔹 Get Node at Index
    // =========================
    public Node get(int index) {
        Node node = head;

        for(int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    // =========================
    // 🔹 Insert at Specific Index
    // =========================
    public void insert(int val, int index) {

        if(index == 0) {
            insertFirst(val);
            return;
        }

        if(index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;

        // reach node before index
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    // =========================
    // 🔹 Inner Node Class
    // =========================
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}