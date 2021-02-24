import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Random;

public class Transaction implements Serializable {
    private long transactionId;
    private BackAccount sourceAccount;
    private BackAccount destinationAccount;
    private double moneyAmount;
    private LocalDateTime timestamp;
    private boolean isRefused;

    public Transaction(long transactionId, BackAccount sourceAccount, BackAccount destinationAccount, double moneyAmount) {
        this.transactionId = new Random().nextLong();
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.moneyAmount = moneyAmount;
        if (this.sourceAccount.tryTakeMoney(moneyAmount)){
            isRefused = false;
        }
        else{
            isRefused = true;
        }
        this.timestamp = LocalDateTime.now();
    }

    public long getTransactionId() {
        return transactionId;
    }
    public void setTransactionId() {
        this.transactionId = new Random().nextLong();
    }

    public BackAccount getSourceAccount() {
        return sourceAccount;
    }

    public BackAccount getDestinationAccount() {
        return destinationAccount;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public boolean isRefused() {
        return isRefused;
    }

    @Override
    public String toString() {
        String rep = this.sourceAccount.getOwner() + " à " + this.destinationAccount.getOwner() + " de " + this.moneyAmount+" CHF";

        if (isRefused){
            rep += " ce paiement est refusé";
        }
        else{
            rep += " ce paiement est accepté";
        }
        return rep + (" à " + timestamp);
    }
}
