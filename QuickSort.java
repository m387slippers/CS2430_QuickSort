/**The goal with quicksort v3 is to make class QuickSort non-static, so 
 * that class ArrayGenerator can HAVE a QuickSort object, and use the 
 * quicksort method.
 * 
 */
package quickSortv3;

import java.io.*; //Java io never used.

/**Second try at understanding the quicksort Algorithm, this one is based on the code from 
 * Geeks4Geeks, and this will be the code which I speed-test using the Java Stopwatch.
 * Should count and return the number of "compares" used to sort each array. 
 * 
 * @author GFG
 *
 */
class QuickSort{
	
	int count = 0; //count the number of compares. Anywhere a compare is found, count next to it.

	 // A utility function to swap two elements
	 public void swap(int[] arr, int i, int j)
	 {
	     int temp = arr[i];
	     arr[i] = arr[j];
	     arr[j] = temp;
	 }
	
	 // This function takes last element as pivot,
	 // places the pivot element at its correct position
	 // in sorted array, and places all smaller to left
	 // of pivot and all greater elements to right of pivot
	 public int partition(int[] arr, int low, int high)
	 {
	     // Choosing the pivot
	     int pivot = arr[high];
	
	     // Index of smaller element and indicates
	     // the right position of pivot found so far
	     int i = (low - 1);
	
	     for (int j = low; j <= high - 1; j++) { //this compares two elements in the array
	
	         // If current element is smaller than the pivot
	         if (arr[j] < pivot) { //compares against a counter, not against another array element
	             // Increment index of smaller element
	             i++;
	             swap(arr, i, j);
	         }
	         count = count+1; //two comparisons are made every iteration of the for loop.
	     }
	     swap(arr, i + 1, high);
	     return (i + 1); //i+1 should be the final location of the pivot.
	 }
	
	 // The main function that implements QuickSort
	 // arr[] --> Array to be sorted,
	 // low --> Starting index,
	 // high --> Ending index
	 public void quickSort(int[] arr, int low, int high)
	 {
	     if (low < high) {
	
	         // pi is partitioning index, arr[p]
	         // is now at right place
	         int pi = partition(arr, low, high);
	
	         // Separately sort elements before
	         // partition and after partition
	         quickSort(arr, low, pi - 1);
	         quickSort(arr, pi + 1, high);
	     }
	     count++; //one comparison made every time the method is called
	 }
	 
	 /**Prints the sorted array. However, printing the sorted array really isn't necessary beyond 
	  * visually checking if the array got sorted or not. The only thing that's really necessary
	  * from this method in the ArrayGenerator class is displaying (and possibly storing or 
	  * otherwise tracking) the number of comparisons made. Could it be best to simply create
	  * a different method, with an int return type that officially returns the count? This way,
	  * count can be grabbed and stored in ArrayGenerator class as it comes up.
	  * 
	  */
	 public void printArr(int[] arr)
	 {
	     for (int i = 0; i < arr.length; i++) { //not counting comparisons here because printing the array, not sorting it.
	         System.out.print(arr[i] + " ");
	     }
	     System.out.println(" Comparisons Made: " + count); 
	     count = 0;
	 }
	 
	 //Is it better to leave the curent printArr method as is? Or should I try to change it to something like the following?
//	 public int returnCount(int[] arr) {return count;}
//	 
//	 public void printCount(int[] arr)
//	 {
//		 System.out.println(" Comparisons Made: " + count);
//		 count = 0;
//	 }
	
	 // Driver Code not really necessary in this class. The driving should be done by ArrayGenerator now.
	 public static void main(String[] args)
	 {
	     int[] arr = { 10, 7, 8, 9, 1, 5 };
	     int N = arr.length;
		 
		 //3 digit arrays:
//		 ArrayGenerator ag = new ArrayGenerator(); I think it'll be easier to give ArrayGenerator a quicksort method, than to give QuickSort an 'ag'
//		 int n4[] = { 0, 1, 2, 3 }; //initialize a 4 element array to be shuffled into all possible permutations.
		 QuickSort q = new QuickSort();
	     // Function call
//	     q.quickSort(arr, 0, N - 1);
//	     System.out.println("Sorted array:");
//	     q.printArr(arr); 
	 }
}

//This code is contributed by Ayush Choudhary
//Improved by Ajay Virmoti