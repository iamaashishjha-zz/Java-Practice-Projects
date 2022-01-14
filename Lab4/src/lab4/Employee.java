package lab4;

import java.util.Scanner;

public class Employee extends Student{
    private String office;
    private int salary;
    private int hyear;
    private int hmonth;
    private int hday;
    
    
    public void getEmployee(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name of Office : ");
        office = sc.next();
        
        System.out.println("Enter Salary : ");
        salary = sc.nextInt();
        
        System.out.println("Enter hiring year : ");
        hyear = sc.nextInt();
        
        System.out.println("Enter hiring month : ");
        hmonth = sc.nextInt();
        
        System.out.println("Enter hiring day : ");
        hday = sc.nextInt();
    
    }
    
    public void putEmployee(){
        System.out.println("\n");
        System.out.println("\t\t\t\t\t Office Details");
        System.out.println("The name of office is : "+office);
        System.out.println("The Salary is : Rs. "+salary);
        System.out.println("Hiring Date is (DD - MM - YYYY) : "+hday+" - "+hmonth+" - "+hyear+" AD");
        System.out.println("\n");
    }
}
