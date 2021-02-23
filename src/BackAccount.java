public class BackAccount {
    private int bankAccoundtId = 0;
    private String owner;
    private double money = 0;

    public BackAccount(String owner) {
        this.owner = owner;
        this.bankAccoundtId++;

    }

    public BackAccount(String owner, double money) {
        this.owner = owner;
        this.money = money;
        this.bankAccoundtId++;
    }

    public int getBankAccoundtId() {
        return bankAccoundtId;
    }

    public String getOwner() {
        return owner;
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(double money){
        this.money = this.money + money;
    }

    public boolean tryTakeMoney(double money){
        if (this.money >= money){
            this.money = this.money - money;
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "compte " + this.owner + " sommme " + this.money ;
    }
}
