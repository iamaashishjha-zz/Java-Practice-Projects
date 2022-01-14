
package lab4;


public class Student extends Person{
    enum Level{
        Freshman,
        Sophomore,
        Junior,
        Senior
    }
    
    public void getStatus(){ 
        Level status = Level.Junior;
    }
    
    public void putStatus(){
        System.out.println("Junior");
    }

}
