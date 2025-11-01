package bank;

/**
 * Basisklasse für finanzielle Transaktionen wie Überweisungen oder Ein- und Auszahlungen.
 *
 * @author MinosCodes
 */
public class Transaction {

    /**
     * Datum der Transaktion.
     */
    protected String date;

    /**
     * Betrag der Transaktion.
     */
    protected double amount;

    /**
     * Beschreibung der Transaktion.
     */
    protected String description;

    /**
     * Konstruktor zur Initialisierung aller Attribute einer Transaktion.
     *
     * @param date Datum der Transaktion
     * @param amount Betrag der Transaktion
     * @param description Beschreibung der Transaktion
     */
    public Transaction(String date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    /**
     * Kopierkonstruktor.
     *
     * @param transaction zu kopierende Transaktion
     */
    public Transaction(Transaction transaction) {
        this.date = transaction.date;
        this.amount = transaction.amount;
        this.description = transaction.description;
    }

    /**
     * @return Datum der Transaktion
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @param date neues Datum für die Transaktion
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return Betrag der Transaktion
     */
    public double getAmount() {
        return this.amount;
    }

    /**
     * @param amount neuer Betrag für die Transaktion
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return Beschreibung der Transaktion
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description neue Beschreibung für die Transaktion
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\ndate: " + date + "\ndescription: " + description;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Transaction)) return false;
        if (obj == this) return true;
        Transaction other = (Transaction) obj;
        return date.equals(other.date)
                && amount == other.amount
                && description.equals(other.description);
    }
}
