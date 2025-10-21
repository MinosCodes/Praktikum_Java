package bank;

public class Transaction {
    protected String date; // Datum der Transaktion
    protected double amount;//Betrag der Transaktion .
    protected String description;

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return this.date;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return this.amount;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    Transaction(String date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description=description;


    }
    Transaction(Transaction transaction) {
        this.date = transaction.date;
        this.amount = transaction.amount;
        this.description = transaction.description;
    }
    @Override
    public String toString() {
        return "\ndate: " + date + "\ndescription: " + description;
    }
}
