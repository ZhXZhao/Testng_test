package sort;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class BubbleSortTest {
    int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] target_array = {-1, 10, 11, 17, 20, 42, 43, 53, 61, 80};

    @BeforeSuite
    public void setUp() {
        System.out.println("The BubbleSort is started");
        int[] arrayInt = {10, 20, 80, 17, 61, 53, 42, 43, 11, -1};
        for(int i = 0; i < array.length; i++){
            array[i] = arrayInt[i];
        }
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("The BubbleSort is done");
        array = null;
        target_array = null;
    }

    @Test
    public void testBubbleSort() {
        int[] array_temp = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        array_temp = BubbleSort.bubbleSort(array);
        Assert.assertEquals(target_array, array_temp);
    }

    @Test
    public void testOptimizeBubbleSort() {
        int[] array_temp = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        array_temp = BubbleSort.optimizeBubbleSort(array);
        Assert.assertEquals(target_array, array_temp);
    }
}