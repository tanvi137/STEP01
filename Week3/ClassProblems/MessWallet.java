package Week3.ClassProblems;
class MessWallet {
    private double balance;

    MessWallet(double b) {
        if (b < 0) {
            System.out.println("Invalid opening balance");
            balance = 0;
        } else
            balance = b;
    }

    void topUp(double amount) {
        if (amount <= 0)
            System.out.println("Invalid top-up");
        else
            balance += amount;
    }

    void deduct(double amount) {
        if (amount > balance)
            System.out.println("Deduct rejected: insufficient balance");
        else
            balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

class MessWalletMain {
    public static void main(String[] args) {
        MessWallet w = new MessWallet(500);

        w.topUp(200);
        System.out.println("Balance after top-up: " + w.getBalance());

        w.deduct(1000);
        System.out.println("Final balance: " + w.getBalance());
    }
}

