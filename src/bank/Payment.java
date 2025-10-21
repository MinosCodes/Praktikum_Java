
package bank;

public class Payment extends Transaction { // Ein-Auszahlung
    private double incomingInterest; // Zinsen bei einer Einzahlung
    private double outgoingInterest;// Zinsen bei einer Auszahlung




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
            this.outgoingInterest = 0.0;
        }
    }
    // Konstructer für Payment (Alle Attributen)
    public Payment(String date, double amount, String description, double incomingInterest, double outgoingInterest) {
        super(date, amount, description);
        setIncomingInterest(incomingInterest);
        setOutgoingInterest(outgoingInterest);

    }

    //Kopy-Konstructer Payment
    public Payment(Payment payment) {
        super(payment);
        this.incomingInterest = payment.getIncomingInterest();
        this.outgoingInterest = payment.getOutgoingInterest();
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
