package h2;

public class H2_main {
    public static void main(String[] args) {
        SimpleList myList = new SimpleList();

        myList.append(12);
        myList.append(45);
        myList.append(66);
        myList.append(12);
        myList.append(45);
        myList.append(60);

        System.out.println("Initial List:");
        printList(myList);

        myList.insertAfter(45, 4);
        System.out.println("After insertAfter(45, 4):");
        printList(myList);

        Node foundNode = myList.findFirst(45);
        System.out.println("findFirst(45) found value: " + (foundNode != null ? foundNode.value : "null"));

        myList.delete(45);
        System.out.println("After delete(45):");
        printList(myList);

        myList.delete(12);
        System.out.println("After delete(12):");
        printList(myList);
    }

    public static void printList(SimpleList list) {
        Node current = list.getFirst();
        while (current != null) {
            System.out.print(current.value + (current.next != null ? "," : ""));
            current = current.next;
        }
        System.out.println();
    }
}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class SimpleList {
    Node head;

    public SimpleList() {
        this.head = new Node(Integer.MIN_VALUE);
    }

    public Node getFirst() {
        return this.head.next;
    }

    public Node getLast() {
        Node current = this.head;
        if (current.next == null) {
            return null;
        }
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public void append(int newValue) {
        Node newNode = new Node(newValue);
        Node last = getLast();
        if (last == null) {
            head.next = newNode;
        } else {
            last.next = newNode;
        }
    }

    public Node findFirst(int value) {
        Node current = this.head.next;
        while (current != null) {
            if (current.value == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public boolean insertAfter(int preValue, int newValue) {
        Node preNode = findFirst(preValue);

        if (preNode == null) {
            return false;
        }

        Node newNode = new Node(newValue);
        newNode.next = preNode.next;
        preNode.next = newNode;
        return true;
    }

    public boolean delete(int value) {
        Node current = this.head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
