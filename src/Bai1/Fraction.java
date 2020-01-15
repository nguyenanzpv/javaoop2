package Bai1;

public class Fraction{
    private int tuSo=0;
    private int mauSo=0;

    public Fraction(){

    }

    public Fraction(int tuSo, int mauSo){
        this.tuSo=tuSo;
        this.mauSo=mauSo;
    }
    public static int UCLN(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        return a;
    }

    public static Fraction reduce(Fraction f){
        Fraction ft=new Fraction();
        ft.tuSo=f.tuSo/UCLN(Math.abs(f.tuSo),Math.abs(f.mauSo));
        ft.mauSo=f.mauSo/UCLN(Math.abs(f.tuSo),Math.abs(f.mauSo));
        return ft;
    }

    public static Fraction reciprocal(Fraction f){
        Fraction ft=new Fraction();
        ft.tuSo=f.mauSo;
        ft.mauSo=f.tuSo;
        return ft;
    }

    public static Fraction add(Fraction f1, Fraction f2){
        Fraction ft=new Fraction();
        ft.tuSo=f1.tuSo*f2.mauSo+f1.mauSo*f2.tuSo;
        ft.mauSo=f1.mauSo*f2.mauSo;
        if(ft.tuSo!=0)
        {
            reduce(ft);
        }
        return ft;
    }

    public static Fraction subtract(Fraction f1, Fraction f2){
        Fraction ft=new Fraction();
        ft.tuSo=f1.tuSo*f2.mauSo-f1.mauSo*f2.tuSo;
        ft.mauSo=f1.mauSo*f2.mauSo;
        if(ft.tuSo!=0)
        {
            reduce(ft);
        }
        return ft;
    }

    public static Fraction multiply(Fraction f1, Fraction f2){
        Fraction ft=new Fraction();
        ft.tuSo=f1.tuSo*f2.tuSo;
        ft.mauSo=f1.mauSo*f2.mauSo;
        if(ft.tuSo!=0)
        {
            reduce(ft);
        }
        return ft;
    }

    public static Fraction divide(Fraction f1, Fraction f2){
        Fraction ft=new Fraction();
        ft.tuSo=f1.tuSo*f2.mauSo;
        ft.mauSo=f1.mauSo*f2.tuSo;
        if(ft.tuSo!=0)
        {
            reduce(ft);
        }
        return ft;
    }

    public static void tolerance(Fraction f1, Fraction f2){
        Fraction ft=new Fraction();
        ft=ft.divide(f1,f2);
        if(ft.tuSo/ft.mauSo<1){
            System.out.println(printFraction(f1)+"<"+printFraction(f2));
        }
        else{
            System.out.println(printFraction(f1)+">"+printFraction(f2));
        }
    }

    public static String printFraction(Fraction f){
        return f.tuSo+"/"+f.mauSo;
    }

    public static void main(String[] args){
        Fraction f1=new Fraction();
        Fraction f2=new Fraction();
        f1.tuSo=3;
        f1.mauSo=4;
        f2.tuSo=5;
        f2.mauSo=8;

        System.out.println("reduce fraction");
        System.out.println(printFraction(reduce(f1)));

        System.out.println("reciprocal fraction");
        System.out.println(printFraction(reciprocal(f1)));

        System.out.println("add fraction");
        System.out.println(printFraction(add(f1,f2)));

        System.out.println("subtract fraction");
        System.out.println(printFraction(subtract(f1,f2)));

        System.out.println("multiply fraction");
        System.out.println(printFraction(multiply(f1,f2)));

        System.out.println("divide fraction");
        System.out.println(printFraction(divide(f1,f2)));

        System.out.println("tolerance fraction");
        tolerance(f1,f2);


    }


}
