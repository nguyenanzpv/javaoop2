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

    public void  reduce(){
        int ucln = UCLN(Math.abs(this.tuSo),Math.abs(this.mauSo));
        this.tuSo=this.tuSo/ucln;
        this.mauSo=this.mauSo/ucln;
        System.out.println("Phan so toi gian: "+this.toString());
    }

    public  void reciprocal(){
        int temp=0;
        temp=this.tuSo;
        this.tuSo=this.mauSo;
        this.mauSo=temp;
        System.out.println("Phan so nghich dao: "+this.toString());
    }

    public  Fraction add(Fraction f2){
        this.tuSo=this.tuSo*f2.mauSo+this.mauSo*f2.tuSo;
        this.mauSo=this.mauSo*f2.mauSo;
        if(this.tuSo!=0)
        {
            this.reduce();
        }
        return this;
    }

    public  Fraction subtract(Fraction f2){
        this.tuSo=this.tuSo*f2.mauSo-this.mauSo*f2.tuSo;
        this.mauSo=this.mauSo*f2.mauSo;
        if(this.tuSo!=0)
        {
            reduce();
        }
        return this;
    }

    public  Fraction multiply(Fraction f2){
        this.tuSo=this.tuSo*f2.tuSo;
        this.mauSo=this.mauSo*f2.mauSo;
        if(this.tuSo!=0)
        {
            reduce();
        }
        return this;
    }

    public  Fraction divide(Fraction f2){
        this.tuSo=this.tuSo*f2.mauSo;
        this.mauSo=this.mauSo*f2.tuSo;
        if(this.tuSo!=0)
        {
            reduce();
        }
        return this;
    }

    public  boolean tolerance(Fraction f2){
        Fraction ft=new Fraction();
        ft=this.divide(f2);
        if(ft.tuSo/ft.mauSo<1){
            return false;
        }
        else{
            return true;
        }
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
        f1.reduce();

        System.out.println("reciprocal fraction");
        f1.reciprocal();

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
