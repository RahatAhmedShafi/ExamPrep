
package examprep;


public class Teacher4 {
    String movieName;
    String actor;
    String actress;
    public Teacher4(){
    System.out.println("No information");
    }
    public Teacher4(String movieName,String actor){
    this.movieName=movieName;
    this.actor=actor;
    }
    public Teacher4(String movieName,String actor,String actress){
    this.movieName=movieName;
    this.actor=actor;
    this.actress=actress;
    }
    public void display(){
        System.out.println("MovieName:"+movieName);
        System.out.println("Actor:"+actor);
        System.out.println("Actress:"+actress);
    }
    
    
}
