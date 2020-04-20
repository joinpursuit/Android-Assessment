package com.example.AndroidTest;
//Asia Gibson 3/28/2020
import java.util.*;

public class DSA {

    // Do not change any of the function names or the function signatures (the number of arguments in a function)
    // or else the tests will not pass.
    // e.g. don't change multiply(x, y) to multiply(x,y,z)


    // Question 1
    // Write a function that returns two numbers multiplied
    // ex: multiply(x: 5, y: 10) should return 50

    public static int multiply (int a, int b) {
        int product = a *b;

        return product;

    }



// Question 2
    // Given an array of integers, return a new array of the same length that contains the original values squared.
    // ex: arraySquare(arr: [1,3,5,8]) should return [1,9,25,64]


    public static int[] arraySquare (int[] arr) {
        int test[] = new int [arr.length];

        for (int i =0; i < arr.length; i++){
            test [i] = (int) Math.pow(arr[i], 2);

        }

        return  test;
    }

    // Question 3
    // Given two integers (low and high), return how many numbers are in that range that
    // DO NOT contain the number 5. This includes any number that has a 5, like 15, 352, etc.
    // ex: integerRange(1, 10) should return 9
    // ex: integerRange(4, 25) should return 19


    public static int integerRange (int low, int high) {
        int count =0;
        int range = high - (low-1);
        for(int i = low; i <= high; i++){
            if(Integer.toString(i).contains("5")){
                count++;
            }
        }
        return range - count ;
    }

    // Question 4
    // Write a function that takes an integer and an unsorted array of Ints
    // and returns true if there's any pair of numbers in that array that can be
    // summed up to the input integer.
    // ex: inputSum([1,3,5,4,2], 7) should return true
    // ex: inputSum([1,3,5,4,2], 2) should return false


    public static boolean inputSum (int[] arr, int targetInt) {
        for(int i = 0; i < arr.length;i++){
            for(int j = 1; j < arr.length;j++){

                if((arr[i] + arr[j]) == targetInt){
                    return true;
                }
            }
        }
        return false;
    }

    // Question 5
    // Implement a function that accepts an array of integers as an argument.
    // This function should return the sum of all integers in the array.
    // Your solution should be **recursive**.
    // ex: recursiveSum([1,2,3,4,5]) should return 15


    public static int recursiveSum(int[] input) {
        int len = input.length;

        if(len == 1){
            return input[0];
        }
        return (recursiveSum(Arrays.copyOfRange(input,1,len))) + input[0];
    }

    // Question 6
    // Given a linked list, write a function that takes it as input,
    // traverses it, and returns an array with all the values in the linked list.
    // Assume the linked list starts with 1 as the root node and looks like: 1->9->8->5
    // ex: traverseLinkedList(firstNode) should return [1,9,8,5]

    public static int[] traverseLinkedList (LinkedList<Integer> list) {
        int test[] = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            test[i] = list.get(i);
        }

        return  test;
    }

    // Question 7
    // Given a binary tree, find its maximum depth.
    // The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
    // Note: A leaf is a node with no children.
    //
    // Example tree, depth is 3. Your function should return an integer only.
    //     3
    //    / \
    //   2   20
    //      /  \
    //     7   25
    //



    public static int maxDepth(Node binaryNode) {

        if(binaryNode == null){
            return 0;
        }else {

            int left = maxDepth(binaryNode.left);
            int right = maxDepth(binaryNode.right);

            if (right > left) {
                return (right + 1);
            }

            return (left +1); }
    }
}
