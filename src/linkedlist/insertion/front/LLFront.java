package linkedlist.insertion.front;

public class LLFront {
    // this is the head
    private Node head;

    public static void main(String[] args) {
        LLFront linkedlist = new LLFront();
        linkedlist.insertAtFront(5);
        linkedlist.insertAtFront(4);
        linkedlist.insertAtFront(3);
        linkedlist.insertAtFront(2);
        linkedlist.insertAtFront(1);

        linkedlist.printList();

    }

    //creating node at front
    private void insertAtFront(int data) {
        Node newNode = new Node(data);  // node that needs to be insert is created.
        newNode.next = head;  // new node point to previous head
        head = newNode;// make new node as head
    }

    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }

    //Node class
    class Node {
        int value;
        Node next;

        Node(int data) {
            this.value = data;
            this.next = null;
        }
    }

}
