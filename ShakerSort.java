/**QuickSort V5: Incorporate Cocktail Sort and get comparison data. Maybe clean up quicksort and ArrayGenerator
 * 
 */
package quickSortV5;

public class ShakerSort {
	int count = 0;
	
	void cocktailSort(int a[]) {
		boolean swapped = true;
		int start = 0;
		int end = a.length;
		
		while (swapped == true) {
			swapped = false;

			for (int i = start; i < end - 1; ++i) { //not comparing against an array element, just ints.
				if (a[i] > a[i + 1]) { //+1 compares of array elements
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					swapped = true;
				}
				count++; //checks the if() block every time the for loop iterates.
			}

			if (swapped == false)
				break;

			swapped = false;

			end = end - 1;

			for (int i = end - 1; i >= start; i--) { //not accessing the array with this comparison
				if (a[i] > a[i + 1]) { //compares two elements in the array.
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					swapped = true;
				}
				count = count++;//increments each time the loop iterates because the if() block is checked each time.
			}

			start = start + 1;
		}
	}
	
	void printArray(int a[]) {
		int n = a.length;
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println(" Comparisons Made: " + count);
		count = 0; //reset count to 0 after the count has been displayed.
	}
}
