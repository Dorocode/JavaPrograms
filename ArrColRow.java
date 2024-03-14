import java.io.*;
public class BasicRowColumnSum {

  public static void main(String[] args) {
    int[][] arr = {{1, 2, 3}, {2, 1, 1}, {3, 3, 4}};

    System.out.println("Original array:");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("\nRow-wise sum:");
    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = 0; j < arr[i].length; j++) {
        sum += arr[i][j];
      }
      System.out.println("Sum of row " + i + " = " + sum);
    }

    System.out.println("\nColumn-wise sum:");
    for (int j = 0; j < arr[0].length; j++) {
      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
        sum += arr[i][j];
      }
      System.out.println("Sum of column " + j + " = " + sum);
    }
  }
}