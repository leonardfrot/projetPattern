public class BackAccount {
    private int bankAccountId;
    private String owner;
    private double money = 0;

    public BackAccount(String owner) {
        this.owner = owner;
        this.bankAccountId=(int)(Math.random()*10000);

    }

    public BackAccount(String owner, double money) {
        this(owner);
        this.money = money;

    }

    public double getBankAccoundtId() {
        return bankAccountId;
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
            this.money -= money;
            return true;
        } else {
            //montant du compte insuffisant
            return false;
        }

    }

    @Override
    public String toString() {
        return "compte " + this.owner + " somme " + this.money +" CHF";
    }
}
