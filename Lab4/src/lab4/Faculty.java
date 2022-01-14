package lab4;

import java.util.Scanner;

public class Faculty extends Employee{
       private int whour;
       private int level;
       
       public void getFaculty(){
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Enter number of working hours per day : ");
           whour = sc.nextInt();
           
           System.out.println("Enter the Level of Employee : ");
           level = sc.nextInt();
       }
       
       public void putFaculty(){
           System.out.println("The working hour of Employee is : "+whour);
           
           System.out.println("The Level of Employee is : "+level);
       }
}
