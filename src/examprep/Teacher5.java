
package examprep;


public class Teacher5 {
    String name;
    String gender;
    int age;
    public void add(){
        System.out.println("No information");
    }
    public void add(String name,String gender){
        this.name=name;
        this.gender=gender;
        System.out.println("Name:"+name+"\n"+"Gender:"+gender);
    }
    public void add(String name,String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
        System.out.println("Name:"+name+"\n"+"Gender:"+gender+"\n"+"Age:"+age);
    }
    
}
