package linkedlist.insertion.between;

public class LLBetween {
    private Node head;

    public static void main(String[] args) {

        LLBetween linkedList = new LLBetween();
        linkedList.insertAtFront(5);
        linkedList.insertAtFront(4);
        linkedList.insertAtFront(2);
        linkedList.insertAtFront(1);
        linkedList.printList();
        linkedList.appendAfter(linkedList.head.next, 3);
        linkedList.printList();
        linkedList.appendAfter(linkedList.head.next, 5);
        linkedList.printList();

    }

    private void appendAfter(Node previousData, Integer data) {
        if (previousData == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = previousData.next;
        previousData.next = newNode;
    }

    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    private void insertAtFront(int data) {
        Node newNode = new Node(data);  // node that needs to be insert is created.
        newNode.next = head;  // new node point to previous head
        head = newNode;// make new node as head
    }

    class Node {
        Integer value;
        Node next;

        Node(int data) {
            this.value = data;
            this.next = null;
        }
    }
}
