import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountRepository {
    private Map<String, Account> account = new HashMap<>();

    public static void getAllAccountsInfo(){
        System.out.print("Account No. " + "   " + "Account Holder" + "   " + "Account Type" + "   " + "Branch"+"   " + "Balance" + "  ");
        System.out.println();
        for (Map.Entry<String, Account> acc : account.entrySet()) {
            System.out.print(acc.getKey() + "  " + acc.getValue().get(0) + + "  " + acc.getValue().get(1) + + "  " + acc.getValue().get(2) + + "  " + acc.getValue().get(3));            
            System.out.println();
        }
    }
    
}
