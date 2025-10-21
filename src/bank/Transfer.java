package bank;

public class Transfer extends Transaction implements CalculateBill  {  //überweisung Klasse
    private String sender;//Sender
    private String recipient;//Anfaenger



    @Override
    public void setAmount(double amount) {// setter für amount
        if (amount > 0){
            this.amount = amount;
        }else{
            System.out.println("Fehler : Betrag is Negativ");
            this.amount = 0.0;
        }
    }

    public String getSender() { // getter für Sender
        return sender;
    }
    public void setSender(String sender) { // setter für Sender
        this.sender = sender;
    }
    public String getRecipient() { // getter für Recipient
        return recipient;
    }
    public void setRecipient(String recipient) { // setter für Recipient
        this.recipient = recipient;
    }
    public Transfer(String date, double amount, String description,String sender, String recipient) {
        super(date, amount, description);
        this.sender = sender;
        this.recipient = recipient;
    }
    public Transfer(Transfer transfer) {
        super(transfer);
        this.recipient = transfer.recipient;
        this.sender = transfer.sender;
    }

    public void printObject() { // Ausgabe alle Atribute mit Values
        System.out.println("Date : " + this.getDate());
        System.out.println("Amount : " + this.getAmount());
        System.out.println("Description : " + this.getDescription());
        System.out.println("Sender : " + this.getSender());
        System.out.println("Recipient : " + this.getRecipient());
    }
    @Override
    public double calculate() {
        return this.getAmount();
    }

}

