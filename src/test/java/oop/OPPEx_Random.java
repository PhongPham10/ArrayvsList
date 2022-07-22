package oop;

import java.util.ArrayList;

public class OPPEx_Random {
    public static void main(String[] arg) {
        //1. Thêm sinh viên
        ArrayList<SinhVien> arrSinhVien = new ArrayList<SinhVien>();
        SinhVien sv1 = new SinhVien();
        sv1.ID = 1;
        sv1.Name = "Khanh";
        sv1.Age = 32;
        sv1.GPA = 6;
        sv1.Address = "Ha Noi";
        sv1.DiemTrungBinh = 9;

        arrSinhVien.add(sv1);

        SinhVien sv2 = new SinhVien();
        sv2.ID = 2;
        sv2.Name = "Tram";
        sv2.GPA = 5;
        sv2.Address = "Hai Phong";
        sv2.DiemTrungBinh = 7;

        arrSinhVien.add(sv2);

        ArrayList<SinhVienNuocNgoai> arrSinhVienNuocNgoai = new ArrayList<SinhVienNuocNgoai>();
        SinhVienNuocNgoai sv3 = new SinhVienNuocNgoai();
        sv3.QuocGia = "Viet Nam";
        //sv3.DiemTrungBinh = 5;
        //sv3.Name = "Tran Van A";

        arrSinhVienNuocNgoai.add(sv3);
        arrSinhVien.add(sv3);

        SinhVienNuocNgoai sv4 = new SinhVienNuocNgoai();
        sv4.QuocGia = "My";
        //sv4.DiemTrungBinh = 5;
        //sv4.Name = "Tran Van B";

        arrSinhVienNuocNgoai.add(sv4);
        arrSinhVien.add(sv4);

        SinhVienNuocNgoai sv5 = new SinhVienNuocNgoai();
        sv5.QuocGia = "Trung Quoc";
        //sv5.DiemTrungBinh = 3;
       // sv5.Name = "Tran Van C";

        arrSinhVienNuocNgoai.add(sv5);
        arrSinhVien.add(sv5);

        SinhVienNuocNgoai sv6 = new SinhVienNuocNgoai();
        sv6.QuocGia = "Viet Nam";
        //sv6.DiemTrungBinh = 5;
       // sv6.Name = "Tran Van D";

        arrSinhVienNuocNgoai.add(sv6);
        arrSinhVien.add(sv6);

        SinhVien sv7 = new SinhVien();
        arrSinhVien.add(sv7);

        SinhVien sv8 = new SinhVien();
        arrSinhVien.add(sv8);

        SinhVien sv9 = new SinhVien();
        arrSinhVien.add(sv9);

        SinhVien sv10 = new SinhVien();
        arrSinhVien.add(sv10);


//Nhập random họ tên

        for (int i = 0; i < arrSinhVien.size(); i ++)
        {
            arrSinhVien.get(i).RandomHoTen();
        }


        //In Random - Testing
        System.out.println("In ra List Sinh Viên");
        System.out.println();

        for (int i = 0; i < arrSinhVien.size(); i++) {
                arrSinhVien.get(i).ID = i+1;
                arrSinhVien.get(i).ShowInfo();

               if (arrSinhVien.get(i).getClass().toString().contains("SinhVienNuocNgoai"))
                   System.out.println("Đây là sinh viên nước ngoài");
               else
                   System.out.println("Đây là sinh viên trong nước");
                System.out.println(" ");
        }
    }
}
