package oop;

import java.util.ArrayList;
import java.util.Random;

public class SinhVien {
    public int ID;
    public String Name;
    public int Age;
    public String Address;
    public int GPA;

    public int DiemTrungBinh;

    public void ShowInfo() {
        System.out.println("Id:" + ID);
        System.out.println("Ho va Ten:" + Name);
        System.out.println("Tuoi:" + Age);
        System.out.println("Dia Chi:" + Address);
        System.out.println("GPA:" + GPA);

    }

    public String XepLoai() {

    String diem = new String();

        if (DiemTrungBinh > 8)
            diem = "Gioi";
            else
                if (DiemTrungBinh <= 8 && DiemTrungBinh >= 6.5)
                diem = "Kha";
                    else if (DiemTrungBinh < 6.5)
                    diem = "Trung Binh";

                    return diem;

    }

    public void RandomHoTen() {

        ArrayList<String> Ten = new ArrayList<String>();
        Ten.add("Nhàn");
        Ten.add("Dũng");
        Ten.add("Vũ");
        Ten.add("Trí");
        Ten.add("Dương");
        Ten.add("Nhĩ");
        Ten.add("Nhất");
        Ten.add("Không");

        ArrayList<String> ChuLot = new ArrayList<String>();
        ChuLot.add("Bá");
        ChuLot.add("Thanh");
        ChuLot.add("Văn");
        ChuLot.add("Vĩnh");
        ChuLot.add("Viễn");

        ArrayList<String> Ho = new ArrayList<String>();
        Ho.add("Lý");
        Ho.add("Phạm");
        Ho.add("Lã");
        Ho.add("Hồ");
        Ho.add("Ngô");
        Ho.add("Mao");

        Random randomGenerator = new Random();

//Nhập random họ tên


        int indexTen = randomGenerator.nextInt(Ten.size());
        int indexHo = randomGenerator.nextInt(Ho.size());
        int indexChuLot = randomGenerator.nextInt(ChuLot.size());

        this.Name = Ho.get(indexHo).toString().trim() + " "
                + ChuLot.get(indexChuLot).toString().trim() + " "
                + Ten.get(indexTen).toString().trim();

    }

}
