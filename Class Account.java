class Account {
    String name, type;
    int accNo;
    double bal = 0;

    Account(String n, int a, String t) {
        name = n;
        accNo = a;
        type = t;
    }

    void deposit(double amt) {
        bal += amt;
    }

    void withdraw(double amt) {
        if (amt <= bal)
            bal -= amt;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println("Balance = " + bal);
    }

    public static void main(String[] args) {
        Account a = new Account("Sameer", 101, "Savings");
        a.deposit(5000);
        a.display();
        a.withdraw(2000);
        a.display();
    }
}