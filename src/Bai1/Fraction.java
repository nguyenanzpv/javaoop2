package Bai1;

public class Fraction{
    private int tuSo;
    private int mauSo;

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

    public Fraction  reduce(){
        int ucln = UCLN(Math.abs(this.tuSo),Math.abs(this.mauSo));
        this.tuSo=this.tuSo/ucln;
        this.mauSo=this.mauSo/ucln;
        return this;
        //System.out.println("Phan so toi gian: "+this.toString());
    }

    public  Fraction reciprocal(){
        int temp=this.tuSo;
        this.tuSo=this.mauSo;
        this.mauSo=temp;
        return this;
        //System.out.println("Phan so nghich dao: "+this.toString());
    }

    public  Fraction add(Fraction f2){
        Fraction ft=new Fraction();
        ft.tuSo=this.tuSo*f2.mauSo+this.mauSo*f2.tuSo;
        ft.mauSo=this.mauSo*f2.mauSo;
        if(ft.tuSo!=0)
        {
            ft.reduce();
        }
        return ft;
    }

    public  Fraction subtract(Fraction f2){
        Fraction ft=new Fraction();
        ft.tuSo=this.tuSo*f2.mauSo-this.mauSo*f2.tuSo;
        ft.mauSo=this.mauSo*f2.mauSo;
        if(ft.tuSo!=0)
        {
            ft.reduce();
        }
        return ft;
    }

    public  Fraction multiply(Fraction f2){
        Fraction ft=new Fraction();
        ft.tuSo=this.tuSo*f2.tuSo;
        ft.mauSo=this.mauSo*f2.mauSo;
        if(ft.tuSo!=0)
        {
            ft.reduce();
        }
        return ft;
    }

    public  Fraction divide(Fraction f2){
        Fraction ft=new Fraction();
        ft.tuSo=this.tuSo*f2.mauSo;
        ft.mauSo=this.mauSo*f2.tuSo;
        if(ft.tuSo!=0)
        {
            ft.reduce();
        }
        return ft;
    }

    public  int tolerance(Fraction f){
        float x = f.tuSo*f.mauSo;
        float y = this.tuSo*this.mauSo;
        if(x > y) return 1 ;
        else if(x<y) return -1 ;
        else return 0;
    }

    @Override
    public  String toString(){
        return this.tuSo+"/"+this.mauSo;
    }

    public static void main(String[] args){
        Fraction f1=new Fraction();
        Fraction f2=new Fraction();
        f1.tuSo=3;
        f1.mauSo=4;
        f2.tuSo=5;
        f2.mauSo=8;

        System.out.println("reduce fraction");
        System.out.println("Phan so toi gian: " +f1.reduce().toString());

        System.out.println("reciprocal fraction");
        System.out.println("Phan so nghich dao: " +f1.reciprocal().toString());

        System.out.println("add fraction");
        System.out.println("ket qua cong phan so: "+f1.add(f2));

        System.out.println("subtract fraction");
        System.out.println("ket qua tru phan so: "+f1.subtract(f2));

        System.out.println("multiply fraction");
        System.out.println("ket qua nhan phan so: "+f1.multiply(f2));

        System.out.println("divide fraction");
        System.out.println("ket qua chia phan so: "+f1.divide(f2));

        System.out.println("tolerance fraction");
        System.out.println("ket qua so sanh phan so: "+f1.tolerance(f2));


    }


}
