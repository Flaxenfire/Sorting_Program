package com.sparta.bubble;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    Sorter bubble = new Bubble_sort();
    Sorter merge = new Merge_sort();
    Sorter tree = new Tree_sort();
    Generator generator = new Generator();


    @Test
    // Standard int array
    void Bubble1() {
        int [] before = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        int [] after = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertArrayEquals(after, bubble.sortArray(before));
    }

    @Test
    // Empty
    void Bubble2() {
        int [] before = {};
        int [] after = {};
        Assertions.assertArrayEquals(after, bubble.sortArray(before));
    }

    @Test
    // 1 value
    void Bubble3() {
        int [] before = {1};
        int [] after = {1};
        Assertions.assertArrayEquals(after, bubble.sortArray(before));
    }

    @Test
    // Already sorted array
    void Bubble4() {
        int [] before = {1,2,3,4,5};
        int [] after = {1,2,3,4,5};
        Assertions.assertArrayEquals(after, bubble.sortArray(before));
    }
    @Test
    // Negative numbers
    void Bubble5() {
        int [] before = {-1,-2,-3,-4,-5};
        int [] after = {-5,-4,-3,-2,-1};
        Assertions.assertArrayEquals(after, bubble.sortArray(before));
    }
    @Test
    // Duplicate numbers
    void Bubble6() {
        int [] before = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,2,2,2,2,2,2,2};
        int [] after = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        Assertions.assertArrayEquals(after, bubble.sortArray(before));
    }

    @Test
        // Standard int array
    void Merge1() {
        int [] before = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        int [] after = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertArrayEquals(after, merge.sortArray(before));
    }

    @Test
        // Empty
    void Merge2() {
        int [] before = {};
        int [] after = {};
        Assertions.assertArrayEquals(after, merge.sortArray(before));
    }

    @Test
        // 1 value
    void Merge3() {
        int [] before = {1};
        int [] after = {1};
        Assertions.assertArrayEquals(after, merge.sortArray(before));
    }

    @Test
        // Already sorted array
    void Merge4() {
        int [] before = {1,2,3,4,5};
        int [] after = {1,2,3,4,5};
        Assertions.assertArrayEquals(after, merge.sortArray(before));
    }
    @Test
        // Negative numbers
    void Merge5() {
        int [] before = {-1,-2,-3,-4,-5};
        int [] after = {-5,-4,-3,-2,-1};
        Assertions.assertArrayEquals(after, merge.sortArray(before));
    }
    @Test
        // Duplicate numbers
    void Merge6() {
        int [] before = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,2,2,2,2,2,2,2};
        int [] after = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        Assertions.assertArrayEquals(after, merge.sortArray(before));
    }

    @Test
        // Standard int array
    void tree1() {
        int [] before = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        int [] after = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertArrayEquals(after, tree.sortArray(before));
    }

    @Test
        // Empty
    void Tree2() {
        int [] before = {};
        int [] after = {};
        Assertions.assertArrayEquals(after, tree.sortArray(before));
    }

    @Test
        // 1 value
    void Tree3() {
        int [] before = {1};
        int [] after = {1};
        Assertions.assertArrayEquals(after, tree.sortArray(before));
    }

    @Test
        // Already sorted array
    void Tree4() {
        int [] before = {1,2,3,4,5};
        int [] after = {1,2,3,4,5};
        Assertions.assertArrayEquals(after, tree.sortArray(before));
    }
    @Test
        // Negative numbers
    void Tree5() {
        int [] before = {-1,-2,-3,-4,-5};
        int [] after = {-5,-4,-3,-2,-1};
        Assertions.assertArrayEquals(after, tree.sortArray(before));
    }
    @Test
        // Duplicate numbers (Tree sort should erase duplicates)
    void Tree6() {
        int [] before = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,2,2,2,2,2,2,2};
        int [] after = {1,2};
        Assertions.assertArrayEquals(after, tree.sortArray(before));
    }
}