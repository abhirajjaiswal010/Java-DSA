package LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleList list = new SingleList();

        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertLast(10);
        list.insert(100, 3);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();
        list.displayList();



    }
}
