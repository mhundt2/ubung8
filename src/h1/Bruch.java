package h1;

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
