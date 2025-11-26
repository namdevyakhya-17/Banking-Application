class Account{
    String acc_num;
    String acc_holder;
    double balance;
    String acc_type;
    String branch;
    public Account(String acc_num, String acc_holder, double balance, String acc_type, String branch){
        this.acc_num = acc_num;
        this.acc_holder = acc_holder;
        this.balance = balance;
        this.acc_type = acc_type;
        this.branch = branch;
    }
}
public class BankingApp {
    static java.util.HashMap<String, Account> accounts = new java.util.HashMap<>();
    static {
        accounts.put("1234567890", new Account("1234567890", "John Doe", 5000.0, "Savings", "Main Branch"));
        accounts.put("0987654321", new Account("0987654321", "Jane Smith", 3000.0, "Checking", "City Branch"));
    }


    public static void transfer_amount(String senderAcc, String recieverAcc, double amount){
        if(!accounts.containsKey(senderAcc) || !accounts.containsKey(recieverAcc)){
            System.out.println("One or both account numbers are invalid.");
            return;
        }

        if(senderAcc.equals(recieverAcc)){
            System.out.println("Sender and reciever account numbers cannot be the same.");
            return;
        }

        Account sender = accounts.get(senderAcc);
        Account reciever = accounts.get(recieverAcc);
        if(sender.balance < amount){
            System.out.println("Transaction failed");
            return;
        }
        sender.balance -= amount;
        reciever.balance += amount;
        System.out.println("Transaction successful");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Banking Application!");
    }
}
