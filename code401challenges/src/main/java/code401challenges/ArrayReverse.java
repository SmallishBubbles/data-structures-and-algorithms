// import arrays so that we can print them nicely
import java.util.Arrays;
package code401challenges;

public class ArrayReverse {
  public static void main(String[] args) {
    System.out.println("Hello World");

    // call method here
    int[] toBeReversed = new int[]{1,2,3,4,5};

    System.out.println(Arrays.toString(reverseArray(toBeReversed)));
  }

  public static int[] reverseArray(int[] arr) {
    int midpoint = arr.length / 2;
    for (int i = 0; i < midpoint; i++){
      int temp = arr[i];
      int mirrorIndex = arr.length - 1 - i;
      arr[i] = arr[mirrorIndex];
      arr[mirrorIndex] = temp;
    }
    return arr;
  }
}