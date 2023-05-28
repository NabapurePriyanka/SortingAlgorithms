Sorting refers to the process of arranging a collection of items or elements in a particular order, typically based on some defined criteria

Sorting helps in organizing data, searching for specific elements efficiently, and enabling other algorithms to perform more effectively.There are various sorting algorithms available, each with its own characteristics and performance trade-offs. Some common sorting algorithms include bubble sort, insertion sort, selection sort, merge sort, quicksort, and heapsort, among others. These algorithms employ different techniques to rearrange the elements and achieve the desired sorted order.

**Bubble Sort**

Idea: In Bubble sort,the larger elements gradually "bubble" or move towards the end of the array.

TC: For bubble sort, in the worst-case scenario, the algorithm needs to perform comparisons and swaps for every pair of elements in the array. If we have 'n' elements in the array, the number of comparisons and swaps can be approximated as (n-1) + (n-2) + ... + 1, which is equal to (n * (n-1)) / 2.
Therefore, the worst-case time complexity of bubble sort is O(n^2) 

**Selection Sort**

Idea: The algorithm works by repeatedly selecting the smallest element from the remaining unsorted portion and swapping it with the element at the beginning of the unsorted part.

TC: In the worst-case scenario, for each of the n elements in the array, the algorithm needs to perform n-1 comparisons to find the minimum. Therefore, the total number of comparisons in the worst case can be approximated as (n-1) + (n-2) + ... + 2 + 1, which is a sum of consecutive integers from 1 to n-1, which is equal to (n * (n-1)) / 2.

**Inserion Sort**

Idea: Insertion sort is a simple and efficient sorting algorithm that works by dividing the input array into a sorted and an unsorted portion. It iterates through the unsorted portion, selecting one element at a time and inserting it into its correct position within the sorted portion

TC: Insertion sort has a time complexity of O(n^2).

**Merge Sort**

Idea: Merge sort is a popular sorting algorithm that follows the divide-and-conquer approach to sort elements in an array. It divides the array into smaller subarrays, sorts them recursively, and then merges them back together to produce a sorted array.

TC: Merge sort has a time complexity of O(n log n) in all cases.

**Quick Sort*

Idea: Quick sort is a widely used sorting algorithm that follows the divide-and-conquer strategy to sort elements in an array.

TC: Quick sort has an average-case time complexity of O(n log n) and a worst-case time complexity of O(n^2).