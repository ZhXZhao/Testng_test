package sort;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StraightSelectSortTest {
    int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] target_array = {-1, 10, 11, 17, 20, 42, 43, 53, 61, 80};

    @BeforeMethod
    public void setUp() {
        System.out.println("The StraightSelectSort is started");
        int[] arrayInt = {10, 20, 80, 17, 61, 53, 42, 43, 11, -1};
        for(int i = 0; i < array.length; i++){
            array[i] = arrayInt[i];
        }
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("The StraightSelectSort is done");
        array = null;
        target_array = null;
    }

    @Test
    public void testSelectSort() {
        int[] array_temp = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        array_temp = StraightSelectSort.selectSort(array);
        Assert.assertEquals(target_array, array_temp);
    }
}