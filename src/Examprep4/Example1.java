
package Examprep4;

import java.util.Scanner;


public class Example1 {
    public static void main(String[] args) {
        try{
            
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            if(a>=18){
                System.out.println("Yes");
            }
            else{
                throw new UserException(a);
            }   
            
        }
        catch(UserException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Welcome");
        }
        
        
    }
}
