package bai2v2;

import java.util.Calendar;
import java.util.Scanner;

public abstract class Book {

    protected int bookCode;
    protected Calendar inputDate = Calendar.getInstance();
    protected int smallPrice;
    protected int quantity;
    protected String publisher;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Book Code: ");
        this.bookCode = Integer.parseInt(sc.nextLine());
        System.out.print("Small Price: ");
        this.smallPrice = Integer.parseInt(sc.nextLine());
        System.out.print("Quantity: ");
        this.quantity = Integer.parseInt(sc.nextLine());
        System.out.print("Publisher: ");
        this.publisher = sc.nextLine();
        subInput();
    }

    public abstract void subInput();

    public  void output(){
        System.out.println("Book Code: "+this.bookCode);
        System.out.println("Small Price: "+this.smallPrice);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Publisher: "+this.publisher);

        subOutput();
    }

    public abstract void subOutput();

    public abstract double totalMoney();
    

    public Book() {

    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public Calendar getInputDate() {
        return inputDate;
    }

    public void setInputDate(Calendar inputDate) {
        this.inputDate = inputDate;
    }

    public int getSmallPrice() {
        return smallPrice;
    }

    public void setSmallPrice(int smallPrice) {
        this.smallPrice = smallPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
