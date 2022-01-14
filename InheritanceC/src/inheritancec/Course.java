package inheritancec;
    
import java.util.Scanner;

public class Course {
    private int cid;
    private String cname;
    private String ccode;
    
    public void getCourse(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Course Id : ");
        cid = sc.nextInt();
        
        System.out.println("Enter Course Name : ");
        cname = sc.next();
        
        System.out.println("Enter Course Code : ");
        ccode = sc.next();
    }
    
    public void putCourse(){
        System.out.println("\n");
        System.out.println("Course Id  : "+cid);
        System.out.println("Course name : "+cname);
        System.out.println("Course Code : "+ccode);
    }
}
