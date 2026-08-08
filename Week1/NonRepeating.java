import java.util.Scanner;

class NonRepeating {

    static void findCharacter(String text) {

        for (int i = 0; i < text.length(); i++) {

            int count = 0;

            for (int j = 0; j < text.length(); j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First Non-Repeating Character: '"
                        + text.charAt(i) + "'");
                return;
            }
        }

        System.out.println("No Non-Repeating Character Found");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        findCharacter(text);

        sc.close();
    }
}
