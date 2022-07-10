# Sorting Program

## Functionality

- Takes a user input between 10 and 100
- Creates 2 int arrays of length input
- Outputs both unsorted arrays
- Prompts user to select bubble sort, merge sort, or tree sort for the first array
- Outputs speed of algorithm selected
- Repeats above 2 steps for second array
- Outputs both sorted arrays and which one was faster

## Sorting Algorithms

### Bubble Sort

Iterates through the array and compares each value with the next value.
If the next value is smaller, it swaps their places in the array.
This is repeated until the entire array is sorted.

![Bubble](https://www.productplan.com/uploads/bubble-sort-1024x683-2.png)

### Merge Sort

Recursive algorithm that continuously splits an array in half until it can no longer be divided.
The elements are then sorted and merged back together to form a complete sorted array.

![Merge](https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Merge_sort_algorithm_diagram.svg/300px-Merge_sort_algorithm_diagram.svg.png)

## Binary Tree Sort

Creates a binary tree using nodes in a nested class.
Elements are then taken from the binary tree and copied into a seperated array to return as sorted.

![Tree](https://blog.penjee.com/wp-content/uploads/2015/11/binary-search-tree-sorted-array-animation.gif)

## Testing

Continual JUnit testing was implemented as each sorting algorithm was added.
An example test for the bubble sort can be seen below, testing its applicability with negative numbers.

`` @Test
// Negative numbers
void Bubble5() {
int [] before = {-1,-2,-3,-4,-5};
int [] after = {-5,-4,-3,-2,-1};
Assertions.assertArrayEquals(after, bubble.sortArray(before));
}
``