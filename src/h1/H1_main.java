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

class Bruch {
    int zaehler;
    int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    private int ggT(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public void shorten() {
        int commonDivisor = ggT(Math.abs(zaehler), Math.abs(nenner));
        zaehler /= commonDivisor;
        nenner /= commonDivisor;

        if (nenner < 0) {
            zaehler *= -1;
            nenner *= -1;
        }
    }

    public boolean hasSameValueAs(Bruch other) {
        Bruch thisCopy = new Bruch(this.zaehler, this.nenner);
        Bruch otherCopy = new Bruch(other.zaehler, other.nenner);

        thisCopy.shorten();
        otherCopy.shorten();

        return thisCopy.zaehler == otherCopy.zaehler && thisCopy.nenner == otherCopy.nenner;
    }
}
