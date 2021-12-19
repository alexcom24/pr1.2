import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(12,48);
        Book b2 = new Book(11,59);
        Book b3 = new Book();
        b3.setStr(67);
        b3.setPrice(24);
        System.out.println(b1);
        b1.PriceOfOnePaper();
        b2.PriceOfOnePaper();
        b3.PriceOfOnePaper();
    }
}
