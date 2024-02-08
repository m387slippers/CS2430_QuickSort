QuickSort:
    I took my general approach to quicksort from Geeks4Geeks, and modified it slightly to count the number of "compares" taken each time an array was sorted. 

ArrayGenerator:
    I used "Heap's Algorithm for Generating Permutations" from Geeks4Geeks, and modified it to have an instance of the QuickSort class, to gain access to the 
    quicksort method functionality. Arrays are shuffled, but not randomized so all permutations of a given set of numbers is represented in an array. The 
    print method for ArrayGenerator is called for every permutation of the shuffled arrays, and the sort method is also called every time the print method is
    called. This produces output where the shuffled array, sorted array, and number of comparisons required is all printed on the same line.
