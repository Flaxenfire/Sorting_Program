package com.sparta.bubble;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    Sorter bubble = new Bubble_sort();


    @Test
    void sortArray() {
        int [] before = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        int [] after = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertArrayEquals(after, bubble.sortArray(before));
    }
}