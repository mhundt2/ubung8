package p2;

public class P2_main {

    public static void main(String[] args) {
        String original = "RindfLeischetikETTierung";
        int shortenBy = 13;
        String result = shortenToLowerCase(original, shortenBy);

        System.out.println("Original String: \"" + original + "\"");
        System.out.println("Gekürzt um: " + shortenBy + " Zeichen");
        System.out.println("Ergebnis: \"" + result + "\"");

        String test2 = "Hallo";
        int shortenBy2 = 10;
        String result2 = shortenToLowerCase(test2, shortenBy2);
        System.out.println("\nOriginal String: \"" + test2 + "\"");
        System.out.println("Gekürzt um: " + shortenBy2 + " Zeichen");
        System.out.println("Ergebnis: \"" + result2 + "\"");
    }

    public static String shortenToLowerCase(String input, int shortenBy) {
        if (shortenBy >= input.length()) {
            return "";
        }

        int newLength = input.length() - shortenBy;
        String shortenedString = input.substring(0, newLength);

        return shortenedString.toLowerCase();
    }
}



