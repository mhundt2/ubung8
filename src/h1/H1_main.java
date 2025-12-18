package h1;

public class H1_main {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(96, 27);
        System.out.println("Initialer Bruch b1: " + b1.zaehler + "/" + b1.nenner);
        b1.shorten();
        System.out.println("Gekürzter Bruch b1: " + b1.zaehler + "/" + b1.nenner);

        Bruch b2 = new Bruch(4, 8);
        Bruch b3 = new Bruch(1, 2);
        System.out.println("Haben b2 (4/8) und b3 (1/2) den gleichen Wert? " + b2.hasSameValueAs(b3));

        Bruch b4 = new Bruch(1, 3);
        System.out.println("Haben b2 (4/8) und b4 (1/3) den gleichen Wert? " + b2.hasSameValueAs(b4));
    }
}

