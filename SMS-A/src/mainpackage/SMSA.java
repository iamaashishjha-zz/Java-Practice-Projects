
package mainpackage;

import sms.StudentDetail;

import java.util.Scanner;


public class SMSA {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDetail sd = new StudentDetail();
        
        int a;
        String nam;
        String cou;
        
        System.out.println("Enter SID : ");
        a = sc.nextInt();
        
        System.out.println("Enter your Name : ");
        nam = sc.nextLine();
        
        System.out.println("Enter your Course : ");
        cou = sc.nextLine();
        
       
      sd.setSid(a);
      sd.setName(nam);
      sd.setCourse(cou);
      
      System.out.println("\n");
      System.out.println("\t\t\t Student details");
      System.out.println("SSID : "+sd.getSid());
      System.out.println("Name : "+sd.getName());
      System.out.println("Course : "+sd.getCourse());
    }
    
}
