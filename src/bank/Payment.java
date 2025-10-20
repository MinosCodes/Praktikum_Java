
package bank;

public class Payment { // Ein-Auszahlung
    private String date; // Datum des Transaktion
    private double amount;//Beitrag des Transaktion
    private String description;//Beschreibung
    private double incomingInterest; // Zinsen bei einer Einzahlung
    private double outgoingInterest;// Zinsen bei einer Auszahlung


    public String getDate() {
        return date;
    }
    public void setDate(String date) { // setter für Date
        this.date = date;
    }
    public double getAmount() { // getter für Amount
        return amount;
    }
    public void setAmount(double amount) { // setter für amount
        this.amount = amount;
    }
    public String getDescription() { // getter für description
        return description;
    }
    public void setDescription(String description) { // setter für description
        this.description = description;
    }
    public double getIncomingInterest() { // getter für IncomingInterest
        return incomingInterest;
    }
    public void setIncomingInterest(double incomingInterest) { // setter für IncomingInterest
        if (incomingInterest > 0 && incomingInterest < 1) {
            this.incomingInterest = incomingInterest;

        }else{
            System.out.println("Incoming interest ist fehlerhaft!");
        }
    }
    public double getOutgoingInterest() { // getter für OutgoingInterest
        return this.outgoingInterest;
    }
    public void setOutgoingInterest(double outgoingInterest) { // setter für OutgoingInterest
        if (outgoingInterest > 0 && outgoingInterest < 1) {
            this.outgoingInterest = outgoingInterest;
        }else {
            System.out.println("Outgoing interest ist fehlerhaft!");
            this.incomingInterest = 0.0;
        }
    }
    // Konstructer für Payment (Alle Attributen)
    public Payment(String date, double amount, String description, double incomingInterest, double outgoingInterest) {
        this.date = date;
        this.amount = amount;
        this.description = description;
        this.incomingInterest=incomingInterest;
        this.outgoingInterest=outgoingInterest;

    }
    //Konstrukter für Payment (date,amount,description)
    public Payment(String date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;

    }
    //Kopy-Konstructer Payment
    public Payment(Payment payment) {
        this.date = payment.getDate();
        this.amount = payment.getAmount();
        this.description = payment.getDescription();
        this.incomingInterest = payment.getIncomingInterest();
        this.outgoingInterest = payment.getOutgoingInterest();
        setOutgoingInterest(outgoingInterest);
    }
    //Print Object Methode die Alle attributen ausgibt
    public void printObject() {
        System.out.println("Date : " + this.getDate());
        System.out.println("Amount : " + this.getAmount());
        System.out.println("Description : " + this.getDescription());
        System.out.println("Incoming Interest : " + this.getIncomingInterest());
        System.out.println("Outgoing Interest : " + this.getOutgoingInterest());
    }



}
