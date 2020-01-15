package Bai2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReferenceBook extends Book implements BookOperator,AveargeBook,TotalMoney {
    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    private int tax=0;
    List<ReferenceBook> listrb=new ArrayList<>();
    public ReferenceBook(int maSach, Date ngayNhap, int donGia, int soLuong, String nhaXuatBan, int tax){
        super();
        this.maSach=maSach;
        this.ngayNhap=ngayNhap;
        this.donGia=donGia;
        this.soLuong=soLuong;
        this.nhaXuatBan=nhaXuatBan;
        this.tax=tax;
        listrb.add(this);
    }

    @Override
    public void getBook(int maSach) {
        for(int i=0;i<listrb.size();i++){
            if(listrb.get(i).maSach==maSach){
                System.out.println("Mã sách: "+listrb.get(i).maSach);
                System.out.println("Ngày nhập: "+listrb.get(i).ngayNhap);
                System.out.println("Đơn giá: "+listrb.get(i).donGia);
                System.out.println("Số lượng: "+listrb.get(i).soLuong);
                System.out.println("Nhà xuất bản: "+listrb.get(i).nhaXuatBan);
                System.out.println("Thuế: "+listrb.get(i).tax);
            }
        }
    }

    @Override
    public void getAllBook() {
        for(int i=0;i<listrb.size();i++){
            System.out.println("Mã sách: "+listrb.get(i).maSach);
            System.out.println("Ngày nhập: "+listrb.get(i).ngayNhap);
            System.out.println("Đơn giá: "+listrb.get(i).donGia);
            System.out.println("Số lượng: "+listrb.get(i).soLuong);
            System.out.println("Nhà xuất bản: "+listrb.get(i).nhaXuatBan);
            System.out.println("Thuế: "+listrb.get(i).tax);
        }
    }

    @Override
    public int getAverageBook() {
        int a=0;
        for(int i=0;i<listrb.size();i++){
            a+= listrb.get(i).donGia;
        }
        return a/listrb.size();
    }

    @Override
    public int getToTalMoney() {
        int a=0;
        for(int i=0;i<listrb.size();i++)
        {
            a+= listrb.get(i).getDonGia()*listrb.get(i).getSoLuong()+listrb.get(i).getTax();
        }
        return a;
    }
}
