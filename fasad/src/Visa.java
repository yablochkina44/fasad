public class Visa {
    int id;
    double balance;

    public Visa() { }

    public Visa(int id,int balance){
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) { this.id = id;}
    public int getId() {
        return id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
