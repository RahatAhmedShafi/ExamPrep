
package examprep;

import java.util.Scanner;


public class ArrayPrac {
    public static void main(String[] args){
        int[] number=new int[3];
        int sum=0;
        int avg;
        Scanner input=new Scanner(System.in);
        for(int i=0;i<number.length;i++){
            number[i]=input.nextInt();
            sum+=number[i];
        }
        System.out.println("Ans");
       
        System.out.println("Sum:"+sum);
        avg=sum/number.length;
        System.out.println("Average:"+avg);
       
        
    }
    
}
