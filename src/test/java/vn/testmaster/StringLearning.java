package vn.testmaster;

import org.junit.Test;
import org.testng.Assert;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Arrays;
import java.util.HashMap;

public class StringLearning {

    public static void main(String args[]) throws ScriptException {
        String s = "Hello World       I am learning Automation Testing";
        //System.out.println(s.substring(5));   //I'm Java
        //System.out.println(s.substring(0, 1));//Hello
        //if (!s.contains("w"))
        //System.out.println(KyTuXuatHienNhieu(s));
        // int i = 1 + Integer.valueOf("5");
        //  System.out.println(DaoNguocChuoi("2+4+6*3"));
        //System.out.println(ChuanHoaHoTen("pham thanh phong"));
        DemKyTu2("abca");
        System.out.println(Arrays.toString(s.split(" ")));

    }


    //Bai 2. Hãy viết method nhận vào một chuỗi số. Hãy tính tổng các chữ số có trong chuỗi. Viết Testmethod cho  method này.
    public static int TongString(String arrNumber) {
        int tong = 0;

        for (int i = 0; i < arrNumber.length(); i++) {
            tong = tong + Integer.valueOf(arrNumber.substring(i, i + 1));
        }
        return tong;
    }

    @Test
    public void Test_TongString() {
        //Giả Thiết
        String arrNumber = "0123456789";
        int expected = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;

        //Thực hiện
        int actual = TongString(arrNumber);

        //Kiểm tra
        Assert.assertEquals(actual, expected);
    }

    //Bai 3. Hãy viết method nhận vào một chuỗi biểu thức (với các phép toán +,-,*,/). Hãy tính giá trị của biểu thức này. Viết Testmehod cho method vừa viết.
    public static int TongBieuThuc(String arrNumber) throws ScriptException {

        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");

        Object tong = scriptEngine.eval(arrNumber);

        int returntong = Integer.valueOf(tong.toString());
        return returntong;
    }


    @Test
    public void Test_TongBieuThuc() throws ScriptException {
        //Giả Thiết
        String arrNumber = "3+4+9*7";
        int expected = 70;

        //Thực hiện
        int actual = TongBieuThuc(arrNumber);

        //Kiểm tra
        Assert.assertEquals(actual, expected);
    }

    //Bai 3.1 Làm lại bài 3 tự tư duy.


//Bai 4. Hãy viết method nhận vào một chuỗi bất kỳ, hãy viết giải thuật đảo ngược chuỗi này. Viết Testmethod cho method này.

    public static String DaoNguocChuoi(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String reverse = new String();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse.concat(str.substring(i, i + 1));
        }

        return reverse;
    }

    @Test
    public void Test_DaoNguocChuoi() {
        //Giả Thiết
        String arrNumber = "3+4+9*7";
        String expected = "7*9+4+3";

        //Thực hiện
        String actual = DaoNguocChuoi(arrNumber);

        //Kiểm tra
        Assert.assertEquals(actual, expected);

    }


    //Bài 5 lam lai:
    //Chuyển String thành chuỗi Char
    //Dùng vòng for duyệt từng phần tử Char
    //Nếu là isDigit == True and isLetter == True thì trả về true
    //Nếu không trả về false

    public static boolean SoLanChu(String s){
        char[] temp = s.toCharArray();
        int chu = 0;
        int so = 0;
        for (int i = 0; i < temp.length; i++){
            if (Character.isDigit(temp[i])) so = so + 1;
            if (Character.isLetter(temp[i])) chu = chu + 1;
        }
        boolean a = false;
        if (chu>0&&so>0) a = true;

        return a;
    }

    @Test
    public void Test_SoLanChu() {
        //Giả Thiết
        String arrNumber = "abc123";
        boolean expected = true;

        //Thực hiện
        boolean actual = SoLanChu(arrNumber);

        //Kiểm tra
        Assert.assertEquals(actual, expected);
    }

    //Bai 1 làm lại

    public static String KyTuXuatHienNhieuNhat(String str) {

        int counter[] = new int[256];
        int max = 0;
        String result = new String();
        for (int i = 0; i < str.length(); i++) {
            counter[str.charAt(i)]++;
            if (counter[str.charAt(i)]>max) {
                max = counter[str.charAt(i)];
                result = Character.toString(str.charAt(i));
            }
        }
        return result;
    }

    @Test
    public void Test_KyTuXuatHienNhieuNhat() {
        //Giả Thiết
        String giathiet = "abccb";
        String expected = "c";

        //Thực hiện
        String actual = this.KyTuXuatHienNhieuNhat(giathiet);

        //Kiểm tra
        Assert.assertEquals(expected, actual);

    }
    //Bai 6


    // Bài 6 làm lại
    public static String ChuanHoaHoTenLamLai(String st) {
        st=st.trim().toLowerCase();

        st = st.replaceAll("\\s+", " ");

        String[] temp= st.split(" ");
        // sau khi tách xong, gán xâu st thành sâu rỗng
        st="";
        for(int i=0;i<temp.length;i++) {
            st+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1) // nếu tempt[i] không phải từ cuối cùng
                st+=" ";   // cộng thêm một khoảng trắng
        }
        return st;
    }


    @Test
    public void Test_ChuanHoaHoTenLamLai() {
        //Giả Thiết
        String giathiet = "pham thanh phong";
        String expected = "Pham Thanh Phong";

        //Thực hiện
        String actual = ChuanHoaHoTenLamLai(giathiet);

        //Kiểm tra
        Assert.assertEquals(expected, actual);

    }

    //Bai 7
    public static void DemKyTu(String str) {
        HashMap<Character, Integer> hMap = new HashMap<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (hMap.containsKey(str.charAt(i))) {
                int count = hMap.get(str.charAt(i));
                hMap.put(str.charAt(i), ++count);
            } else {
                hMap.put(str.charAt(i), 1);
            }
        }
        System.out.println(hMap);
    }

    public static void DemKyTu2(String str) {
        int counter[] = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++)
            counter[str.charAt(i)]++;

        char array[] = new char[str.length()];

        for (int i = 0; i < len; i++) {

            array[i] = str.charAt(i);
            int flag = 0;

            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1) 
                System.out.println("Số lần xuất hiện của " + str.charAt(i)
                        + " trong chuỗi:" + counter[str.charAt(i)]);
        }
    }

}


//0 tới 4
    //a, b, c, d arrayTem[3]
    //


