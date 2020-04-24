package sort;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RadixSortTest {
    int[] target_array = {179, 232, 332, 361, 405, 457, 598, 633, 664, 825};

    @BeforeMethod
    public void setUp() {
        System.out.println("The RadixSort is started");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("The RadixSort is done");
        target_array = null;
    }

    @Test(dataProvider = "provideArray")
    public void testRadixSort(int[] array) {
        int[] array_temp = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        array_temp = RadixSort.radixSort(array, 10, 3, array.length);
        Assert.assertEquals(target_array,array);
    }

    @DataProvider(name = "provideArray")
    public Object[][] provideData() {
        Object[][] arrayInt = {{ 332, 633, 598, 232, 664, 179, 457, 825, 405, 361}};
        return arrayInt;
    }
}