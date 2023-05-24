package dsa_java;

/*
 * Two Number Sum
Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. If any two numbers in the input array sum up to the target sum, the function should return them in an array, in any order. If no two numbers sum up to the target sum the function should return an empty array.

Note that the target sum has to be obtained by summing two different integers in the array; you can't add a single

Integer to itself in order to obtain the target sum. You can assume that there will be at most one pair of numbers summing up to the target sum.

Sample Input
array 13, 5, 4, 8, 11, 1, -1, 61
targetSum=10
 */
import java.util.ArrayList;
import java.util.Scanner;
public class two_number_sum {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> array = new ArrayList<>();
      int n =sc.nextInt();
      int targetSum;
      for (int i = 0; i <n; i++) {
        array.add(sc.nextInt());
      }
      sc.close();
    }
}