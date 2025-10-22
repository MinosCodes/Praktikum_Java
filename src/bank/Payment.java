/**
 * @author MinosCodes
 */


package bank;

public class Payment extends Transaction implements CalculateBill{ // Ein-Auszahlung

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

     @Override
    public double calculate() {
        if(this.getAmount() > 0){
            return this.getAmount() * (this.incomingInterest+1);
        }else{
            return this.getAmount() * (this.outgoingInterest+1);
        }
    }
    @Override
    public String toString() {
        return  "===== Transfer Details =====\n" +
                "Amount: " + Double.toString(this.calculate()) + "\n" +
                super.toString() + "\n" +
                "outgoingInterest: " + this.outgoingInterest + "\n" +
                "incomingInterest: " + this.incomingInterest + "\n" +
                "============================";

    }


    /**
     * this function overrides the equals() default methode
     * @param obj object to compare
     * @return boolean
     *
     * */
    @Override
    public boolean equals(Object obj) {
        if (!(super.equals(obj))) return false;
        if (!(obj instanceof Payment)) return false;
        Payment payment = (Payment) obj;
        return  Double.compare(incomingInterest,payment.incomingInterest) == 0.0 && Double.compare(outgoingInterest,payment.outgoingInterest) == 0.0;


    }



}
