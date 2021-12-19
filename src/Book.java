import java.lang.*;
public class Book {
    private int str;
    private double price;
    public Book(int str,double price) {
        this.str=str;
        this.price=price;
    }
    public Book(int str) {
        this.str=str;
        price=0;
    }
    public Book() {
        str=0;
        price=0;
    }
    public void setStr(int str) {
        this.str=str;
    }
    public void setPrice(double price) {
        this.price=price;
    }
    public int getStr() {
        return str;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return "number of papers: "+this.str+", price: "+this.price;
    }
    public void PriceOfOnePaper() {
        System.out.println(price/str);
    }
}
