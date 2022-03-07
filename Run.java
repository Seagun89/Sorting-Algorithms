import java.util.*;
public class Run
{
    public static void main(String[] args) 
    {
        runSelSort();
        runInSort();
    }
    public static void runSelSort()
    {
        int[] data = { 2, 7, -7, 20, -5 };
        SelectionSort selSort = new SelectionSort();
        selSort.sort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
    public static void runInSort()
    {
        int[] numbers = {7, 2, 14, -7, 72};
        insertionSort inSort = new insertionSort();
        inSort.inSortNum(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}