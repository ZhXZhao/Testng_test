package sort;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class QuickSortTest {
    int[] array = {0, 0, 0, 0, 0, 0, 0, 0};
    int[] array_partition = {0, 0, 0, 0, 0, 0, 0, 0};
    int[] target_array = {1, 2, 3, 4, 5, 6, 7, 8};
    int target_partition = 3;

    @BeforeSuite
    public void setUp() {
        System.out.println("The QuickSort is started");
        int[] arrayInt = {4, 7, 6, 5, 3, 2, 8, 1};
        for(int i = 0; i < array.length; i++){
            array[i] = arrayInt[i];
        }
        int[] array_partition_Int = {4, 7, 6, 5, 3, 2, 8, 1};
        for(int i = 0; i < array_partition.length; i++){
            array_partition[i] = array_partition_Int[i];
        }
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("The QuickSort is done");
        array = null;
        array_partition = null;
        target_array = null;
    }

    @Test(dependsOnMethods = {"testPartition"})
    public void testQuickSort() {
        int[] array_temp = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        array_temp = QuickSort.quickSort(array, 0, array.length-1);
        Assert.assertEquals(target_array, array_temp);
    }

    @Test
    public void testPartition() {
        int partition_temp = 0;
        partition_temp = QuickSort.partition(array_partition, 0, array_partition.length-1);
        Assert.assertEquals(target_partition, partition_temp);
    }
}