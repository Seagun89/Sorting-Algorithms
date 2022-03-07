public class SelectionSort
{
    public int currentMinIndex;
    public SelectionSort()
    {
        currentMinIndex = 0;
    }
    public void sort(int[] arr)
    {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++)
        {
            currentMinIndex = i;
            for (int j = i + 1; j < size; j++)
            {
                if (arr[j] < arr[currentMinIndex])
                {
                    currentMinIndex = j;
                }
            }
            swap(arr, i, currentMinIndex);
        }
    }
    public void swap(int[] arr, int indOne, int indTwo)
    {
        int temp = arr[indTwo];
        arr[indTwo] = arr[indOne];
        arr[indOne] = temp;
    }
}

/*
Selection Sort steps:
1. In the outer loop start from the beginning to the second to last pos : unsort array
2. Save the current index which is i 
3. In the second loop start at the first pos as k to the end 
4. Check to see if the next is less than the current and set the current to j pos
5. Then swap 
6. Swap is done witha temp val to hold the second var you want to switch 
7. Store the value in the second var 
8. Store the temp val in the first var 
*/