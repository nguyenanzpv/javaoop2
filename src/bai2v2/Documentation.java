package bai2v2;

import java.util.Arrays;
import java.util.Scanner;

public class Documentation extends Book {

    protected Status status;

    @Override
    public void subInput() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Status Book: ");
        this.status = findByName(sc.nextLine());
    }

    private Status findByName(String name)
    {
        for (Status value : Status.values()) {
            if(value.name().equalsIgnoreCase(name)){
                return value;
            }
        }
        throw new IllegalArgumentException("Status value is invalid");
    }

    @Override
    public void subOutput() {
        System.out.print("Status: "+this.status);
    }

    @Override
    public double totalMoney() {
        if(status.name()=="NEW")
        {
            return quantity*smallPrice;
        }
        else
        {
            return quantity*smallPrice*0.5;
        }
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
