package inheritancec;

import java.util.Scanner;

public class Student extends Course{
    private int sid;
    private String sname;
    
    public void getStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID : ");
        sid = sc.nextInt();
        System.out.println("Enter the Students name : ");
        sname = sc.next();
    }
    
    public void putStudent(){
        System.out.println("The Student Id : "+sid);
        System.out.println("The Student's name : "+sname);
    }
        
}
