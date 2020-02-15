package bai2v2;

import java.util.ArrayList;
import java.util.List;

public class Books {
    List<Book> books = new ArrayList<>();

    public void addListBooks(Book book) {
            books.add(book);
    }

    public void getListBook(){
        for(int i=0;i<books.size();i++){
            books.get(i).output();
        }
    }
     public double getTotalMoney(Book book){
        double total=0;
        for(int i=0;i<books.size();i++){
            total += book.totalMoney();
         }
        return total;
     }

     public double getAverageSmallUnit(Book book){
         double total=0;
         for(int i=0;i<books.size();i++){
             total += book.smallPrice;
         }
         return total/books.size();
     }
}
