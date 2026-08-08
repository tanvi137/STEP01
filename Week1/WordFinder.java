import java.util.Scanner;

class WordFinder {

    static void findWords(String text) {

        text = text.replaceAll("[^a-zA-Z ]", "");

        String[] words = text.split(" ");

        String shortest = words[0];
        String longest = words[0];

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }

            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println("Shortest: \"" + shortest
                + "\" (" + shortest.length() + ")");

        System.out.println("Longest: \"" + longest
                + "\" (" + longest.length() + ")");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        findWords(text);

        sc.close();
    }
}