import java.io.*;
import java.util.Arrays;

public class Sort1 {

  public static void main(String[] args) {
    int[] arr = {5, 1, 4, 2, 8};

    System.out.println("Before number sorted");
    for(int i = 0; i< arr.length;i++){
        System.out.println(arr[i]+" ");
    }

    Arrays.sort(arr);
    System.out.println("After Sorting \n");
    for (int i : arr) {
      System.out.print(i + " \n");
    }
  }
}