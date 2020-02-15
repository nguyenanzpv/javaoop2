package bai2v2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class ReferencedBook extends Book {

    protected double tax;

    @Override
    public void subInput() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Tax:");
        this.tax=Double.parseDouble(sc.nextLine());
    }


    @Override
    public void subOutput() {
        System.out.print("Tax:"+this.tax);

    }

    @Override
    public double totalMoney() {
        return (quantity*smallPrice)+tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }



}
