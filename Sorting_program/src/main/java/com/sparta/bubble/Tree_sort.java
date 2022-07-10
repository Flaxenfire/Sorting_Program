package com.sparta.bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree_sort implements Sorter {

    public List<Integer> getArraylist() {
        return Arraylist;
    }

    public void setArraylist(List<Integer> arraylist) {
        Arraylist = arraylist;
    }

    public Tree_sort.Node getRoot() {
        return root;
    }

    public void setRoot(Tree_sort.Node root) {
        this.root = root;
    }

    private List<Integer> Arraylist = new ArrayList<Integer>();

    class Node {
        int key;
        Tree_sort.Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Tree_sort.Node root;

    Tree_sort() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Tree_sort.Node insertRec(Tree_sort.Node root, int key) {

        if (root == null) {
            root = new Tree_sort.Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    public void inorderRec(Tree_sort.Node root) {
        if (root != null) {
            inorderRec(root.left);
            Arraylist.add(root.key);
            inorderRec(root.right);
        }
    }

    void treeins(int numList[]) {
        for (int i = 0; i < numList.length; i++) {
            insert(numList[i]);
        }

    }

    private int[] numList;

    public Tree_sort (int[] numList) {
        this.numList = numList;

    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        //GFG tree = new GFG();
        this.treeins(arrayToSort);
        this.inorderRec(this.root);
        List<Integer> numAL = this.getArraylist();
        int[] ret = new int[numAL.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = numAL.get(i).intValue();
        }
        return ret;
    }
}

