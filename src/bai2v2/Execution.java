package bai2v2;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        int selectBook;
        System.out.println("Key press to input please");
        System.out.println("Press 1 to input Document");
        System.out.println("Press 2 to input Refrenced");
        Scanner sc=new Scanner(System.in);
        selectBook=sc.nextInt();
        switch (selectBook) {
            case 0:
                System.out.println("Nhập thông tin Documentation");
                Books books=new Books();
                Book doc = new Documentation();
                doc.input();
                books.addListBooks(doc);
                System.out.println("----------------Documentation");
                books.getListBook();
            case 1:
                System.out.println("Nhập thông tin Referenced");
                Books books1=new Books();
                Book ref = new ReferencedBook();
                ref.input();
                books1.addListBooks(ref);
                System.out.println("----------------ReferencedBook");
                books1.getListBook();
        }

        /*System.out.println("----------------Documentation");
        doc.output();
        System.out.println();
        Book ref = new ReferencedBook();
        ref.input();
        System.out.println("----------------ReferencedBook");
        ref.output();
        */

    }
}
