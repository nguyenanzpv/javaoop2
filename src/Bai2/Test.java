package Bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) throws ParseException {

        TextBook tb=new TextBook(1,new SimpleDateFormat("dd/MM/yyyy").parse("15/01/2020"),10000,10,"kim đồng","new");
        tb.getBook(1);
        tb.getAllBook();
        System.out.println("Tổng thành tiền: "+tb.getToTalMoney());

        ReferenceBook rb=new ReferenceBook(1,new SimpleDateFormat("dd/MM/yyyy").parse("15/01/2020"),10000,10,"kim đồng",5);
        rb.getBook(1);
        rb.getAllBook();
        System.out.println("Tổng tiền sách tham khảo: "+rb.getToTalMoney());
        System.out.println("Trung bình cộng của các sách tham khảo: "+rb.getAverageBook());

    }
}
