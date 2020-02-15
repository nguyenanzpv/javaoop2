package bai2v2;

import java.util.Scanner;

public class Execution {

    public static void main(String[] args) {
        int selectBook;
        Scanner sc=new Scanner(System.in);
        String answer;
        Books books=new Books();
        Book doc = new Documentation();
        //Books books1=new Books();
        Book ref = new ReferencedBook();
        selectBook=question();
        switch (selectBook) {
            case 0:
                System.out.println("Nhập thông tin Documentation");

                doc.input();
                books.addListBooks(doc);
                System.out.println("----------------Documentation");
                books.getListBook();
                System.out.println("You want input other book? Y or N");
                answer=sc.nextLine();
                if(answer.equalsIgnoreCase("Y")){
                    question();
                }
                else
                {
                    break;
                }

            case 1:
                System.out.println("\n Nhập thông tin Referenced");

                ref.input();
                books.addListBooks(ref);
                System.out.println("----------------ReferencedBook");
                books.getListBook();
                break;
        }

        getTotalMoneyByBook(books,doc,ref);

        /*System.out.println("----------------Documentation");
        doc.output();
        System.out.println();
        Book ref = new ReferencedBook();
        ref.input();
        System.out.println("----------------ReferencedBook");
        ref.output();
        */

    }

    public static int question(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Key press to input please");
        System.out.println("Press 0 to input Document");
        System.out.println("Press 1 to input Refrenced");
        return sc.nextInt();

    }

    public static void getTotalMoneyByBook(Books books,Book doc, Book ref){
            System.out.println("\n Total Money for Documentation");
            System.out.println(books.getTotalMoney(doc));

            System.out.println("\n Total Money for ReferencedBook");
            System.out.println(books.getTotalMoney(ref));


    }
}
