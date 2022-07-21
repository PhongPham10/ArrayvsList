package oop;

import java.util.ArrayList;
import java.util.Random;

public class OPPEx {
    public static void main(String[] arg) {
        //1. Thêm sinh viên
        ArrayList<SinhVien> arrSinhVien = new ArrayList<SinhVien>();
        SinhVien sv1 = new SinhVien();
        sv1.ID = 5;
        sv1.Name = "Khanh";
        sv1.Age = 32;
        sv1.GPA = 6;
        sv1.Address = "Ha Noi";
        sv1.DiemTrungBinh = 9;

        arrSinhVien.add(sv1);

        SinhVien sv2 = new SinhVien();
        sv2.ID = 10;
        sv2.Name = "Tram";
        sv2.GPA = 5;
        sv2.Address = "Hai Phong";
        sv2.DiemTrungBinh = 7;

        arrSinhVien.add(sv2);

        ArrayList<SinhVienNuocNgoai> arrSinhVienNuocNgoai = new ArrayList<SinhVienNuocNgoai>();
        SinhVienNuocNgoai sv3 = new SinhVienNuocNgoai();
        sv3.QuocGia = "Viet Nam";
        sv3.DiemTrungBinh = 5;
        //sv3.Name = "Tran Van A";

        arrSinhVienNuocNgoai.add(sv3);

        SinhVienNuocNgoai sv4 = new SinhVienNuocNgoai();
        sv4.QuocGia = "My";
        sv4.DiemTrungBinh = 5;
        //sv4.Name = "Tran Van B";

        arrSinhVienNuocNgoai.add(sv4);

        SinhVienNuocNgoai sv5 = new SinhVienNuocNgoai();
        sv5.QuocGia = "Trung Quoc";
        sv5.DiemTrungBinh = 3;
       // sv5.Name = "Tran Van C";

        arrSinhVienNuocNgoai.add(sv5);


        SinhVienNuocNgoai sv6 = new SinhVienNuocNgoai();
        sv6.QuocGia = "Viet Nam";
        sv6.DiemTrungBinh = 5;
       // sv6.Name = "Tran Van D";

        arrSinhVienNuocNgoai.add(sv6);


        //5.In ra màn hình

        for (int i = 0; i < arrSinhVien.size(); i++) {
            arrSinhVien.get(i).ShowInfo();
            System.out.print("Diem Trung Binh " + arrSinhVien.get(i).DiemTrungBinh);
            System.out.println();
            System.out.print("Xep Loai " + arrSinhVien.get(i).XepLoai());
            System.out.println();
            System.out.println();
        }

        for (int i = 0; i < arrSinhVienNuocNgoai.size(); i++) {
            System.out.print("Quoc Gia: " + arrSinhVienNuocNgoai.get(i).QuocGia);
            System.out.println();
            System.out.print("Diem Trung Binh Chua Cong: " + arrSinhVienNuocNgoai.get(i).DiemTrungBinh);
            System.out.println();
            System.out.print("Xep Loai: " + arrSinhVienNuocNgoai.get(i).XepLoai());
            System.out.println();
            System.out.println();
        }

        //In ra man hinh sinh vien gioi

        for (int i = 0; i < arrSinhVienNuocNgoai.size(); i++) {
            if (arrSinhVienNuocNgoai.get(i).XepLoai() == "Gioi") {
                arrSinhVienNuocNgoai.get(i).ShowInfo();
                System.out.print("Quoc Gia: " + arrSinhVienNuocNgoai.get(i).QuocGia);
                System.out.println();
                System.out.print("Diem Trung Binh Chua Cong: " + arrSinhVienNuocNgoai.get(i).DiemTrungBinh);
                System.out.println();
                System.out.print("Xep Loai: " + arrSinhVienNuocNgoai.get(i).XepLoai());
                System.out.println();
                System.out.println();
            }
        }

        //In Random
        System.out.print("In Random Sinh Vien:");
       Random random = new Random();
       int y = arrSinhVienNuocNgoai.size();
        int x = random.nextInt(y);

        for (int i = 0; i < arrSinhVienNuocNgoai.size(); i++) {
                arrSinhVienNuocNgoai.get(x).ShowInfo();
                x = random.nextInt(y);
        }
    }
}
