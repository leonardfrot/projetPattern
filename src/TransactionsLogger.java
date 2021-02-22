import java.util.List;

public class TransactionsLogger {
    private static final  TransactionsLogger INSTANCE = new TransactionsLogger();
    private List<Transaction> logs;

    private TransactionsLogger() {}

    public static TransactionsLogger getInstance()
    {
        return INSTANCE;
    }





}
