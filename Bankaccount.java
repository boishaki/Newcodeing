//Bankaccount
class BankAccount {
    String Bank_NAME;
    float interest_rate;
    long account_no;
    String account_holder;
    float balance;

    void information(String BN, float ir, long A, String h, float b) {
        Bank_NAME = BN;
        interest_rate = ir;
        account_no = A;
        account_holder = h;
        balance = b;
    }
    void show() {
        System.out.println("Bank_NAME: " + Bank_NAME);
        System.out.println("Interest rate: " + interest_rate);
        System.out.println("Account number: " + account_no);
        System.out.println("Account holder: "+ account_holder);
    }
    void view_balance() {
        System.out.println("Balance: " + balance);
    }
    void deposit(float a) {
        balance += a;
        System.out.println("Deposit amount: " + a);
    }

    void withdraw(float a) {
        if (balance < a) {
            System.out.println("Insufficient balance");
        } else {
            balance -= a;
            System.out.println("Withdraw amount: " + a);
        }
    }
    void calculate_interest() {
        float interest = balance * interest_rate / 100;
        System.out.println("Calculate interest: " + interest);
    }
}

class Test {
    public static void main(String[] args) {
        BankAccount r = new BankAccount();
        System.out.println("BankAccount");
        r.information("OOPL", 0.7f, 222220005101054l, "Boishakhi singha", 1000.0f);
        r.show();
        r.view_balance();
        r.deposit(30000.0f);
        r.withdraw(40000.0f);
        r.calculate_interest();
    }
}
