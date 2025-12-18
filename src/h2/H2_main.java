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


