import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("--Creation de plusieurs comptes");
        System.out.println();

        BackAccount account1 = new BackAccount("account1", 2000.00);
        BackAccount account2 = new BackAccount("account2", 4000.00);
        BackAccount account3 = new BackAccount("account3", 3000.00);
        BackAccount account4 = new BackAccount("account4", 1000.00);
        BackAccount account5 = new BackAccount("account5", 2000.00);

        List<BackAccount> accountsList = new ArrayList<>();
        accountsList.add(account1);
        accountsList.add(account2);
        accountsList.add(account3);
        accountsList.add(account4);

        accountsList.add(account5);

        for(BackAccount account : accountsList){
            System.out.println(account);
        }
        System.out.println();


        System.out.println("--Creation de plusieurs transactions et l'état du logs");
        System.out.println();

        Transaction transaction1 = new Transaction(1, account1, account2, 400);
        Transaction transaction2 = new Transaction(1, account3, account4, 10000);
        Transaction transaction3 = new Transaction(1, account4, account1, 200);
        Transaction transaction4 = new Transaction(1, account5, account2, 100);

        TransactionsLogger.getInstance().log(transaction1);
        TransactionsLogger.getInstance().log(transaction2);
        TransactionsLogger.getInstance().log(transaction3);
        TransactionsLogger.getInstance().log(transaction4);

        for(Transaction transaction : TransactionsLogger.getInstance().getLogs()){
            System.out.println(transaction);
        }





    }
}
