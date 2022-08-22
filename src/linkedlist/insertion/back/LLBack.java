package linkedlist.insertion.back;

public class LLBack {
    private Node head;

    public static void main(String[] args) {

        LLBack linkedList = new LLBack();
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.printList();
    }

    private void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }

    class Node {
        int value;
        Node next;

        Node(int data) {
            this.value = data;
            this.next = null;

        }
    }
}
