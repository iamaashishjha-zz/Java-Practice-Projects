package inheritanceb;

import java.util.Scanner;

public class Student extends Course{
    //private int sid[];
    int[] sid = new int[5];
    //private String sname[];
    String[] sname = new String[5];
    
    public void getStudent(){
        Student sd = new Student();
        
        sd.getCourse();
        for (int i = 0; i < 2; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Student ID : ");
            sid[i]=sc.nextInt();
            System.out.println("Enter the Students name : ");
            sname[i] = sc.next();
        }
    }
    
    public void putStudent(){
        
        
        for (int i = 0; i < 5; i++) {
            
           Student sd = new Student();
        
            sd.putCourse();
            
            System.out.println("The Student Id : "+sid[i]);
            System.out.println("The Student's name : "+sname[i]);
        }
        
        
    }
        
}
