public class insertionSort
{
    public int size;
    public int current;
    public insertionSort()
    {
        // empty constructor 
    }
    public void inSortNum(int[] array)
    {
        size = array.length;
        for (int i = 1; i < size; i++)
        {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j])
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        
    }
    public void inSortStr(int[] array)
    {
        size = array.length;
        // pass
        // will be sorting method for strings
    } 
}

/* 
Insertion sort steps:
1. Make a for loop to loop through the unsorted array
from pos 1 to end of array
2. Have the var current number to equal to the number in the 
arrays ith position 
3. Create a j var to store the previous pos i - 1
4. Use a while loop to keep iterating when j >= 0 AND the previous value is greater
the current number : this is the sorted array
5. Store the previous value in the pos of the current number which is j + 1
6. decrement i since we are going from right to left in the sorted array
7. In the outer loop store the current number in the sorted array in the pos where the current was
Algo End~
*/
/* 
Tips for string sort:
Change your algorithm to sort String values. 
You’ll have to do a few edits here. 
First, a few variables will need to be changed from ints to Strings, including the type of the input array itself! 
Next, you’ll have to take a look at your if statement. We can’t use > or < when comparing Strings. 
Instead, look into how the compareTo() method works. By using compareTo() and seeing if the value is greater than or less than 0, 
you can determine which String is “bigger” in value.
*/