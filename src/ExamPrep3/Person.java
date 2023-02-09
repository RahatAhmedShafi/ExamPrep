
package ExamPrep3;


public class Person {
    
    public String name;
    public int age;
    
   public void add(String name,int age){
       this.name=name;
       this.age=age;  
   }
    @Override
   public String toString(){
       return "Name:"+name+"\n"+"Age:"+age;
   }
       
       
       
   
   
       
}
