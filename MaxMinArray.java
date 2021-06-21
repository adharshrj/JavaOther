import java.util.Arrays;

public class MaxMinArray {
    public static void main(String[] args) {
      int arr[] = {84, 74, 7, 0, 8, 45, 55, 9, -7, 998};
      Arrays.sort(arr);
  
      System.out.println("Maximum number = " 
           + arr[arr.length - 1] + " Minimum number = " + arr[0]);		
    }
  }