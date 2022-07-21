package oop;

public class SinhVienNuocNgoai extends SinhVien {

    public String QuocGia;

    public String XepLoai() {

        String diem = new String();

        if (QuocGia == "My"||QuocGia== "Anh"||QuocGia == "Canada"||QuocGia == "Phap")
        {
            DiemTrungBinh = DiemTrungBinh + 1;
        }
        else if (QuocGia == "Trung Quoc"||QuocGia== "Nhat Ban"||QuocGia == "Han")
        {
            DiemTrungBinh = DiemTrungBinh + 2;
        }
            else
                DiemTrungBinh = DiemTrungBinh + 3;

        if (DiemTrungBinh > 7)
            diem = "Gioi";
        else
        if (DiemTrungBinh <= 7 && DiemTrungBinh >= 6)
            diem = "Kha";
        else if (DiemTrungBinh < 6)
            diem = "Trung Binh";

        return diem;
    }


}
