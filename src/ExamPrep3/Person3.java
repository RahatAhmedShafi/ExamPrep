
package ExamPrep3;


public class Person3 extends Person2 {
    public String qualification;
    public Person3(String name,int age,String qualification){
        super(name,age);
        this.qualification=qualification;
    }
    void display(){
        super.display();
        System.out.println("Qualification:"+qualification);
    }
}
