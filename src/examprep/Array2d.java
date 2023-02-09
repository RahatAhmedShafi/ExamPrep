
package examprep;

import java.util.Scanner;


public class Array2d {
    public static void main(String[] args){
        int [][] number=new int[2][3];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                number[i][j]=input.nextInt();
            }
        }
        
        System.out.println("Answer");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print( " "+number[i][j]); 
            }
            System.out.println("");
        }
        
    }
}
