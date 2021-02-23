import java.util.ArrayList;
import java.util.List;

public class TransactionsLogger {
    private static TransactionsLogger INSTANCE = new TransactionsLogger();
    private List<Transaction> logs = new ArrayList<>();

    private TransactionsLogger() {}

    public static TransactionsLogger getInstance()
    {
        return INSTANCE;
    }

    public void log (Transaction transaction){
        this.logs.add(transaction);
    }

    public List<Transaction> getLogs (){
        return this.logs;
    }

    @Override
    public String toString() {
        return "TransactionsLogger{" +
                "logs=" + logs +
                '}';
    }
}
