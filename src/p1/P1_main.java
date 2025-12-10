package p1;

public class P1_main {

    public static void main(String[] args) {
        System.out.println("Input 50, Output: " + getNumber(50));
        System.out.println("Input 20, Output: " + getNumber(20));
        System.out.println("Input 42, Output: " + getNumber(42));
    }

    public static int getNumber(int a) {
        return (a > 42) ? 42 : 0;
    }
}
