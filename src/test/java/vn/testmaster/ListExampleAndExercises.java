package vn.testmaster;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListExampleAndExercises {
    /* Danh sách (List, ArrayLisst) giống như mảng, lưu trữ danh sách các phần tử cùng kiểu liên tiếp nhau
    trong bộ nhớ máy tính, khi cần lưu thì chỉ việc thêm vào. PHần tử mới thêm luôn ở cuối danh sách
     */
    @Test
    public void TestArrayList()
    {
        //Sử dụng danh sách phải khai báo
        List<Integer> lstNumber;

        lstNumber = new ArrayList<>();
        //để thêm phần tử vào danh sách thì sử dụng phương thức add(object value)
        lstNumber.add(10);
        lstNumber.add(20);

        for (int i = 0; i < lstNumber.size(); i++) {
            //Lấy phần tử trong dánh sách khác với mảng
            //Mảng tên mảng [index]
            //danh sách: tên danh sách
            System.out.println(lstNumber.get(i));
        }

        //Xóa phần tử khỏi danh sách, thì dùng phương thức .remove(index)
        lstNumber.clear();
        Integer[] arrNumber = lstNumber.toArray(new Integer[0]);
    }

    /* Cho một mảng các số nguyên dương, hãy viết medthod lọc ra các số chẵn có trong mảng này */
    public Integer[] LocSoChan(int[] arrNumber)
    {
        List<Integer> lstSoChan = new ArrayList<>();
        for (int i =0; i< arrNumber.length; i++){
            if(arrNumber[i]%2==0)
                lstSoChan.add(arrNumber[i]);
        }
        return lstSoChan.toArray(new Integer[0]);
    }

    @Test
    public void Test_LocSoChan()
    {
        //Giả thiết
        int[] arrNumber = {1,2,3,4,5,6,7,8,9,90,12,13};
        Integer[] expected = {2,4,6,8,98,12};

        //Thực hiện
        Integer[] actual = this.LocSoChan(arrNumber);

        //Kiểm tra
        Assert.assertArrayEquals(expected,actual);
    }

    public boolean KiemTraMangChan(int[] arrNumber)
    {

        int slchan = 0;

        for (int i =0; i < arrNumber.length; i++){
            if(arrNumber[i]%2==0)
                slchan = slchan + 1;
        }

        if (slchan>=(arrNumber.length/2))
            return true;
        else
            return false;
    }

    @Test
    public void Test_KiemTraMangChan()
    {
        //Giả thiết
        int[] arrNumber = {1,2,3,4,5,6,8,7,7,7};
        boolean expected = true;

        //Thực hiện
        boolean actual = this.KiemTraMangChan(arrNumber);

        //Kiểm tra
        Assert.assertEquals(expected, actual);
    }

    public Integer[] ThayTheKhong(int[] arrNumber)
    {

        List<Integer> lstThayTheKhong = new ArrayList<>();
        for (int i = 0; i< arrNumber.length; i++){
            if(arrNumber[i]<0) {
                arrNumber[i] = 0;
                lstThayTheKhong.add(arrNumber[i]);
            }
            else
                lstThayTheKhong.add(arrNumber[i]);
        }

        return lstThayTheKhong.toArray(new Integer[0]);
        //hoac lstThayTheKhong =  Arrays.asList(ArrayUtils.toObject(arrNumber));

    }

    @Test
    public void Test_ThayTheKhong()
    {
        //Giả thiết
        int[] arrNumber = {-1,2,-3,4,-5,6,8,7,7,7};
        Integer[] expected = {0,2,0,4,0,6,8,7,7,7};

        //Thực hiện
        Integer[] actual = this.ThayTheKhong(arrNumber);

        //Kiểm tra
        Assert.assertArrayEquals(expected,actual);
        
    }

    public Integer[] SoLuongTrung(int[] arrNumber)
    {
        List<Integer> arrTemp = new ArrayList<>();
        List<Integer> lstSoLuongTrung = new ArrayList<>();

        for (int i = 0; i < arrNumber.length; i++) {
            if (!arrTemp.contains(arrNumber[i])) {
                arrTemp.add(arrNumber[i]);
            }
            else
            {
                lstSoLuongTrung.add(arrNumber[i]);
            }
        }
        return lstSoLuongTrung.toArray(new Integer[0]);
    }

    @Test
    public void Test_SoLuongTrung()
    {
        //Giả thiết
        int[] arrNumber = {1,2,3,3,4,5,5,6,7,8,9};
        Integer[] expected = {3,5};

        //Thực hiện
        Integer[] actual = this.SoLuongTrung(arrNumber);

        //Kiểm tra
        Assert.assertArrayEquals(expected,actual);
    }

    public int[] SoSanhMang(int[] mangA, int[] mangB)
    {
        int DiemA = 0;
        int DiemB = 0;
        for (int i = 0; i < mangA.length; i++) {
            if(mangA[i]<mangB[i])
            {
                DiemB++;
            }
            if(mangA[i] == mangB[i])
            {
                continue;
            }
            if(mangA[i]>mangB[i])
            {
                DiemA++;
            }
        }

        if(DiemA>=DiemB)
            return mangA;
        else
            return mangB;
    }

    @Test
    public void Test_SoSanhMang()
    {
        //Giả thiết
        int[] mangA = {1,2,3,0};
        int[] mangB = {0,0,9,0};
        int[] expected = {1,2,3,0};

        //Thực hiện
        int[] actual = this.SoSanhMang(mangA,mangB);

        //Kiểm tra
        Assert.assertArrayEquals(expected,actual);
    }

}
