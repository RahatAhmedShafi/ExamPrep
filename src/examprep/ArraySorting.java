
package examprep;

import java.util.Arrays;


public class ArraySorting {
  public static void main(String[]args){
      int [] number={1,-3,4,6,7};
      Arrays.sort(number);
      System.out.println("Ascending order:");
      for(int i=0;i<number.length;i++){
        System.out.println(number[i]);
      }
      System.out.println("");
      System.out.println("Descending order:");
      for(int i=4;i>=0;i--){
        System.out.println(number[i]);
      }
  }  
}
