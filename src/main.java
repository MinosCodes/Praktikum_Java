import bank.Payment;
import bank.Transfer;

public class main {
    public static void main(String[] args) {
        System.out.println("===== Test: Payment (Einzahlung) =====");
        Payment p1 = new Payment("2025-01-01", 1000.0, "Lohn", 0.05, 0.1);
        System.out.println("Berechneter Betrag: " + p1.calculate());
        System.out.println(p1.toString());

        System.out.println("\n===== Test: Payment (Auszahlung) =====");
        Payment p2 = new Payment("2025-01-02", -200.0, "Einkauf", 0.05, 0.1);
        System.out.println("Berechneter Betrag: " + p2.calculate());
        System.out.println(p2.toString());

        System.out.println("\n===== Test: Copy Constructor Payment =====");
        Payment p3 = new Payment(p1);
        System.out.println(p3.toString());
        System.out.println("equals-Test p1 vs p3: " + p1.equals(p3));

        System.out.println("\n===== Test: Transfer =====");
        Transfer t1 = new Transfer("2025-01-03", 500.0, "Miete", "Alice", "Bob");
        System.out.println("Berechneter Betrag: " + t1.calculate());
        System.out.println(t1.toString());

        System.out.println("\n===== Test: Copy Constructor Transfer =====");
        Transfer t2 = new Transfer(t1);
        System.out.println(t2.toString());
        System.out.println("equals-Test t1 vs t2: " + t1.equals(t2));

        System.out.println("\n===== equals() Methoden Vergleich =====");
        System.out.println("p1 equals p2: " + p1.equals(p2)); // unterschiedliche Werte → false
        System.out.println("t1 equals p1: " + t1.equals(p1)); // unterschiedliche Klassen → false

        System.out.println("\n===== Tests abgeschlossen =====");
    }










    }
