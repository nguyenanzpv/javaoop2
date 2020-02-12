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
}
