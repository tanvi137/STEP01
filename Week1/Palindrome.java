import java.util.Scanner;

class Palindrome {

    static boolean iterative(String text) {

        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    static boolean recursive(String text) {

        if (text.length() <= 1) {
            return true;
        }

        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }

        return recursive(text.substring(1, text.length() - 1));
    }

    static boolean arrayReverse(String text) {

        char[] arr = text.toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        String reverse = new String(arr);

        return text.equals(reverse);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Iterative: " +
                (iterative(text) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Recursive: " +
                (recursive(text) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Array Reversal: " +
                (arrayReverse(text) ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
