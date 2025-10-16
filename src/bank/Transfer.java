package bank;

public class Transfer {
    String date; // Datum der Transaktion
    double amount;//etrag der Transaktion (positiv = Einzahlung, negativ = Auszahlung).
    String description;// eschreibung des Zahlungsvorgangs.
    private String sender;//Sender
    private String recipient;//Anfaenger


    public String getDate() { // getter für Date
        return date;
    }
    public void setDate(String date) { // setter für Date
        this.date = date;
    }
    public double getAmount() { // getter für Amount
        return amount;
    }
    public void setAmount(double amount) {// setter für amount
        this.amount = amount;
    }
    public String getDescription() {// getter für description
        return description;
    }
    public void setDescription(String description) {// setter für description
        this.description = description;
    }
    public String getSender() { // getter für Sender
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public String getRecipient() {
        return recipient;
    }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public Transfer(String date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }
    public Transfer(String date, double amount, String sender, String recipient) {
        this.date = date;
        this.amount = amount;
        this.sender = sender;
        this.recipient = recipient;
    }

    public Transfer(Transfer transfer) {
        this.date = transfer.date;
        this.amount = transfer.amount;
        this.sender = transfer.sender;
        this.recipient = transfer.recipient;
    }
    public void printObject() {
        System.out.println("Date : " + this.getDate());
        System.out.println("Amount : " + this.getAmount());
        System.out.println("Description : " + this.getDescription());
        System.out.println("Sender : " + this.getSender());
        System.out.println("Recipient : " + this.getRecipient());
    }

}

