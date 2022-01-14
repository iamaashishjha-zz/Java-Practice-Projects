
package inheritancea;

import java.util.Scanner;



public class Module extends Student{
    private int mid;
    private String mname;
    private String mteacher;
    private double creditHour;
    
    public void getData(){
        Scanner sc = new Scanner(System.in);
        
        Module m = new Module();
        
        m.getStudent();
        
        System.out.println("Enter Module Id : ");
        mid = sc.nextInt();
        
        System.out.println("Enter Module Name : ");
        mname = sc.next();
        
        System.out.println("Enter Module Teacher Name : ");
        mteacher = sc.next();
        
        System.out.println("Enter Module Credit Hours : ");
        creditHour = sc.nextDouble();
    }
    
    public void putData(){
        
        Module m = new Module();
        
        m.putStudent();
        System.out.println("\n");
        System.out.println("The Module Id is : "+mid);
        System.out.println("The Module Name is : "+mname);
        System.out.println("The Module Teacher is : "+mteacher);
        System.out.println("The Module Credit Hour is : "+creditHour);
    }
}
