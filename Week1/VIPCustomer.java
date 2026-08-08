import java.util.Scanner;

class VIPCustomer {

    static String checkCustomer(String id) {

        if (id.startsWith("VIP-")) {
            return "VIP Customer";
        }
        else {
            return "Regular Customer";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        String id = sc.nextLine();

        System.out.println(checkCustomer(id));

        sc.close();
    }
}
