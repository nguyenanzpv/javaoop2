package Bai2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TextBook extends Book implements TotalMoney,BookOperator {
    private String status;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    List<TextBook> listBook=new ArrayList<>();
    public TextBook(int maSach, Date ngayNhap,int donGia,int soLuong,String nhaXuatBan,String status) {
        super();
        this.maSach=maSach;
        this.ngayNhap=ngayNhap;
        this.donGia=donGia;
        this.soLuong=soLuong;
        this.nhaXuatBan=nhaXuatBan;
        this.status=status;
        listBook.add(this);
    }


    @Override
    public int getToTalMoney() {
        int a=0;
        for(int i=0;i<listBook.size();i++)
        {
            if(listBook.get(i).status=="new")
            {
                return a +=listBook.get(i).getDonGia()*listBook.get(i).getSoLuong();
            }
            else
            {
                return a+=(listBook.get(i).getDonGia()*listBook.get(i).getSoLuong()*50)/100;
            }
        }
        return a;
    }

    @Override
    public void getBook(int maSach) {
        for(int i=0;i<listBook.size();i++){
            if(listBook.get(i).maSach==maSach){
                System.out.println("Mã sách: "+listBook.get(i).maSach);
                System.out.println("Ngày nhập: "+listBook.get(i).ngayNhap);
                System.out.println("Đơn giá: "+listBook.get(i).donGia);
                System.out.println("Số lượng: "+listBook.get(i).soLuong);
                System.out.println("Nhà xuất bản: "+listBook.get(i).nhaXuatBan);
                System.out.println("Trạng thái: "+listBook.get(i).status);
            }
        }
    }

    @Override
    public void getAllBook() {
        for(int i=0;i<listBook.size();i++){
                System.out.println("Mã sách: "+listBook.get(i).maSach);
                System.out.println("Ngày nhập: "+listBook.get(i).ngayNhap);
                System.out.println("Đơn giá: "+listBook.get(i).donGia);
                System.out.println("Số lượng: "+listBook.get(i).soLuong);
                System.out.println("Nhà xuất bản: "+listBook.get(i).nhaXuatBan);
                System.out.println("Trạng thái: "+listBook.get(i).status);
        }
    }
}