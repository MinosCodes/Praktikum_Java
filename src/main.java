import bank.Payment;
import bank.Transfer;

public class main {
    public static void main(String[] args) {
        System.out.println("\n=== Test 1: Fehler beim incoming interest ===");
        Payment p1 = new Payment("2025-10-16", 200.0, "Salary", 1.2, 0.01);
        System.out.println("\n=== Test 9: Fehler beim outgoing interest ===");
        Payment p9 = new Payment("2025-10-16", 200.0, "Salary", 0.2, 1.5);
        System.out.println("\n=== Test 2: Transfer mit alle attribute ===");
        Transfer p2 = new Transfer("2025-10-16", 200, "Rent", "Amine", "John");

        System.out.println("\n=== Test 3: Payment constructor mit 3 attribute ===");
        Payment p3  = new Payment("2025-10-16", 200.0, "Salary");

        System.out.println("\n=== Test 4: Transfer constructer mit 3 attributes ===");
        Transfer p4 = new Transfer("2025-10-16", 200, "Rent");

        System.out.println("\n=== Test 5: Payment copy constructor ===");
        Payment p5 = new Payment(p9);

        System.out.println("\n=== Test 6: Transfer copy constructor ===");
        Transfer p6 = new Transfer(p2);

        System.out.println("\n=== Test 7: Fehler Negative Amount  ===");
        Transfer p7 = new Transfer("2025-10-16", -500, "Rent", "Amine", "Ahmed");


        System.out.println("\n=== Output of all objects ===");
        System.out.println("\n=== Object 1 ===");
        p1.printObject();
        System.out.println("\n=== Object 9 ===");
        p9.printObject();
        System.out.println("\n=== Object 2 ===");
        p2.printObject();
        System.out.println("\n=== Object 3 ===");
        p3.printObject();
        System.out.println("\n=== Object 4 ===");
        p4.printObject();
        System.out.println("\n=== Object 5 ===");
        p5.printObject();
        System.out.println("\n=== Object 6 ===");
        p6.printObject();
        System.out.println("\n=== Object 7 ===");
        p7.printObject();

    }
}