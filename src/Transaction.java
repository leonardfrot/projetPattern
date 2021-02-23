import java.io.Serializable;
import java.time.LocalDateTime;

public class Transaction implements Serializable {
    private long transactionId;
    private BackAccount sourceAccount;
    private BackAccount destinationAccount;
    private double moneyAmount;
    private LocalDateTime timestamp;
    private boolean isRefused;

    public Transaction(long transactionId, BackAccount sourceAccount, BackAccount destinationAccount, double moneyAmount) {
        this.transactionId = transactionId;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.moneyAmount = moneyAmount;
        if (this.sourceAccount.tryTakeMoney(moneyAmount)){
            isRefused = true;
        }
        else{
            isRefused = false;
        }
        this.timestamp = LocalDateTime.now();
    }

    public long getTransactionId() {
        return transactionId;
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
        String rep = this.sourceAccount.getOwner() + " à " + this.destinationAccount.getOwner() + " de " + this.moneyAmount;

        if (isRefused){
            rep = rep + " ce paiement est refusé";
        }
        else{
            rep = rep + " ce paiement est accepté";
        }
        return rep;
    }
}
