import java.util.ArrayList;
import java.util.List;

public class TransactionsLogger {
    //création d'une instance unique
    private static TransactionsLogger INSTANCE = new TransactionsLogger();
    private List<Transaction> logs = new ArrayList<>();
    //constructeur en private pour éviter l'instanciation par d'autres classes
    private TransactionsLogger() {}

    /**
     * Le mot-clé synchronized sur la méthode de création
     * empêche toute instanciation multiple même par
     * différents threads.
     * Retourne l'instance du singleton.
     */
    public synchronized static TransactionsLogger getInstance()
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
