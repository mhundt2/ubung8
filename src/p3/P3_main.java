package p3;

public class P3_main {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {-1, -2, 3};
        int[] arr4 = {-1, -2, 5};
        int[] arr5 = {1, 1, -2};
        int[] arr6 = {1, 1, 1};

        int[] resultMult = elementwiseMultiply(arr1, arr2);
        if (resultMult.length > 0) {
            System.out.print("Elementweise Multiplikation von arr1 und arr2: {");
            for (int i = 0; i < resultMult.length; i++) {
                System.out.print(resultMult[i] + (i == resultMult.length - 1 ? "" : ", "));
            }
            System.out.println("}");
        } else {
            System.out.println("Arrays haben unterschiedliche Längen, leeres Array zurückgegeben.");
        }

        System.out.println("Sind arr1 und arr3 orthogonal? " + areOrthogonal(arr1, arr3));
        System.out.println("Sind arr1 und arr4 orthogonal? " + areOrthogonal(arr1, arr4));
        System.out.println("Sind arr5 und arr6 orthogonal? " + areOrthogonal(arr5, arr6));
    }

    public static int[] elementwiseMultiply(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return new int[0];
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] * arr2[i];
        }
        return result;
    }

    public static boolean areOrthogonal(int[] arr1, int[] arr2) {
        int[] multiplied = elementwiseMultiply(arr1, arr2);

        if (multiplied.length == 0) {
            return false;
        }

        int sum = 0;
        for (int j : multiplied) {
            sum += j;
        }

        return sum == 0;
    }
}