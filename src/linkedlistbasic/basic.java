package linkedlistbasic;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;

    }

}

public class basic {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b =  new Node(20);
        Node c =  new Node(30);
        Node d =  new Node(40);


        a.next=b;
        b.next=c;
        c.next=d;

        System.out.println(a);
        System.out.println(b);
//        System.out.println(b);
        System.out.println(a.next);



    }
}
