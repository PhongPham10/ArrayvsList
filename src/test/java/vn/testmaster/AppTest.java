package vn.testmaster;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        int[] arrNumber;

        arrNumber = new int[10];

        int[] arrNumber2 = new int[10];

        arrNumber[0] = 100;

        arrNumber[0] = 12;
        arrNumber[1] = 13;
        arrNumber[2] = 4;
        arrNumber[3] = 5;
        arrNumber[6] = 9;

        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println(arrNumber[i]);
        }
    }

    /* Viết method nhận vào một mảng các số nguyên dương, hãy viết giải thuật đếm các số chắn có trong mảng.
    Viêt test method.
     */
    public int CountOrderNumberInArray(int[] arrNumber)
    {
        int total=0;
        for (int i =0; i < arrNumber.length; i++){
            if(arrNumber[i]%2==0)
                total++;
        }
        return total;
    }

    @Test
    public void Test_CountOrderNumberInArray()
    {
        //Giả thiết
        int[] arrNumber = {1,2,3,4,5,6,7,8,9,90,99,100};
        int expected = 6;

        //Action
        int actual = this.CountOrderNumberInArray(arrNumber);

        //Kiểm tra
        Assert.assertEquals(actual,expected);
    }
}
