package com.example.AndroidTest;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class DSATest {

    @Test
    public void testMultiplyingInts() {
        int a = 2;
        int b = 3;
        int output;

        DSA dsaTest = new DSA();
        output = dsaTest.multiply(a,b);
        assertEquals(6,output);
    }


    @Test
    public void testMultiplyingByItself() {
        int a = 235;
        int b = 1;
        int output;

        DSA dsaTest = new DSA();
        output = dsaTest.multiply(a,b);
        assertEquals(235,output);
    }

    @Test
    public void testMultiplyingNegatives() {
        int a = -5;
        int b = 18;
        int output;

        DSA dsaTest = new DSA();
        output = dsaTest.multiply(a,b);
        assertEquals(-90,output);
    }


    @Test
    public void testSquareOfArray() {
        int[] a = {1,3,5,8};
        int [] output = {1,9,25,64};
        DSA dsaTest = new DSA();
        assertArrayEquals(output,dsaTest.arraySquare(a));

    }

    @Test
    public void testSquareOfArrayNegative() {
        int[] a = {-3,5,11,244};
        int [] output = {9,25,121,59536};
        DSA dsaTest = new DSA();
        assertArrayEquals(output,dsaTest.arraySquare(a));
    }

    @Test
    public void testRangeOfInts() {
        assertEquals(9, new DSA().integerRange(1,10));
    }

    @Test
    public void testRangeOfIntsSecond() {
        assertEquals(19, new DSA().integerRange(4,25));
    }

    @Test
    public void testRangeOfIntsNegative() {
        assertEquals(19, new DSA().integerRange(-10,10));
    }

    @Test
    public void testInputSumFalse() {
        int[] a = {1,3,5,4,2};
        assertEquals(false, new DSA().inputSum(a,2));
    }

    @Test
    public void testInputSumTrue() {
        int[] a = {1,3,5,4,2};
        assertEquals(true, new DSA().inputSum(a,7));
    }

    @Test
    public void testRecursiveSum() {
        int[] a = {1,2,3,4,5};
        assertEquals(15, new DSA().recursiveSum(a));
    }

    @Test
    public void testRecursiveSumNegative() {
        int[] a = {-5,-3,1,-243};
        assertEquals(-250, new DSA().recursiveSum(a));
    }

    @Test
    public void testLinkedList() {
        int[] output = {1,9,8,5};
        LinkedList<Integer> a = new LinkedList<Integer>();
        a.add(1);
        a.add(9);
        a.add(8);
        a.add(5);
        assertArrayEquals(output, new DSA().traverseLinkedList(a));
    }

    @Test
    public void testLinkedListLonger() {
        int[] output = {811,7822,9,113,718,45699,10000,123456789};
        LinkedList<Integer> a = new LinkedList<Integer>();
        a.add(811);
        a.add(7822);
        a.add(9);
        a.add(113);
        a.add(718);
        a.add(45699);
        a.add(10000);
        a.add(123456789);
        assertArrayEquals(output, new DSA().traverseLinkedList(a));
    }

    @Test
    public void testMaxDepthNull() {
         assertEquals(0, new DSA().maxDepth(null));
    }

    @Test
    public void testMaxDepth() {
        class BinaryTree {

            Node root;

            private Node addRecursive(Node current, int value) {
                if (current == null) {
                    return new Node(value);
                }

                if (value < current.value) {
                    current.left = addRecursive(current.left, value);
                } else if (value > current.value) {
                    current.right = addRecursive(current.right, value);
                } else {
                    // value already exists
                    return current;
                }

                return current;
            }
            public void add(int value) {
                root = addRecursive(root, value);
            }
        }

        BinaryTree a = new BinaryTree();
        a.add(3);
        a.add(2);
        a.add(20);
        a.add(25);
        a.add(7);
        assertEquals(3, new DSA().maxDepth(a.root));
    }

    @Test
    public void testMaxDepthLonger() {
        class BinaryTree {

            Node root;

            private Node addRecursive(Node current, int value) {
                if (current == null) {
                    return new Node(value);
                }

                if (value < current.value) {
                    current.left = addRecursive(current.left, value);
                } else if (value > current.value) {
                    current.right = addRecursive(current.right, value);
                } else {
                    // value already exists
                    return current;
                }

                return current;
            }
            public void add(int value) {
                root = addRecursive(root, value);
            }
        }

        BinaryTree a = new BinaryTree();
        a.add(290);
        a.add(100);
        a.add(500);
        a.add(99);
        a.add(92);
        a.add(91);
        a.add(90);
        assertEquals(6, new DSA().maxDepth(a.root));
    }

}