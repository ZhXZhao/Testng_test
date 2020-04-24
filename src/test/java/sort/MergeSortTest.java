package sort;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class MergeSortTest {
    int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] array_merge = {0, 0, 0, 0, 0, 0, 0, 0};
    int[] target_array = {-1, 10, 11, 17, 20, 42, 43, 53, 61, 80};
    int[] target_merge_array = {1, 2, 3, 4, 5, 6, 7, 8};

    @BeforeSuite
    public void setUp() {
        System.out.println("The MergeSort is started");
        int[] arrayInt = {10, 20, 80, 17, 61, 53, 42, 43, 11, -1};
        for(int i = 0; i < array.length; i++){
            array[i] = arrayInt[i];
        }
        int[] array_merge_Int = {4, 5, 7, 8, 1, 2, 3, 6};
        for(int i = 0; i < array_merge.length; i++){
            array_merge[i] = array_merge_Int[i];
        }
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("The MergeSort is done");
        array = null;
        array_merge = null;
        target_array = null;
        target_merge_array = null;
    }

    @Test(dependsOnMethods = {"testMerge"})
    public void testMergeSort() {
        int[] array_temp = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        array_temp = MergeSort.mergeSort(array, 0, array.length-1);
        Assert.assertEquals(target_array, array_temp);
    }

    @Test
    public void testMerge() {
        int[] array_temp = {0, 0, 0, 0, 0, 0, 0, 0};
        array_temp = MergeSort.merge(array_merge, 0, (0+array_merge.length-1)/2, array_merge.length-1);
        Assert.assertEquals(target_merge_array, array_temp);
    }
}