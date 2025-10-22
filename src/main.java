import bank.Payment;
import bank.Transfer;

public class main {
    public static void main(String[] args) {
        //Transfer p1 = new Transfer("25",500,"description","oussema","Amine");
        //System.out.println(p1.toString());
        Payment p2 = new Payment("25",-500,"description",0.3,0.3);
        System.out.println(p2);

        //Transfer p3 = new Transfer("25",500,"description","oussema","Amine");
        Payment p4 = new Payment("25",-500,"description",0.3,0.3);



        //System.out.println(p3.equals(p1));
        System.out.println(p4.equals(p2));











    }
}