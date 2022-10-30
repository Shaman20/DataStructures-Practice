package linkedList;

public class Insert {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void pushFront(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void pushMiddle(Node prev_node, int new_data) {

        if (prev_node == null) {
            System.out.println("The given node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void pushEnd(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        Insert llist = new Insert();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;
        third.next = null;

//        llist.printList();
        llist.pushFront(10);
        llist.pushMiddle(second,20);
        llist.printList();
    }
}
