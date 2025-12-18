package h2;

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
