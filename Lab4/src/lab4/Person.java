
package lab4;

import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;
    
    public void getPerson(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name : ");
        name = sc.next();
        
        System.out.println("Enter Address : ");
        address = sc.next();
        
        System.out.println("Enter Phone number : ");
        phone = sc.next();
        
        System.out.println("Enter Email : ");
        email = sc.next();
    }
    
    public void putPerson(){
        System.out.println("\n");
        System.out.println("\t\t\t\t\t Person's Details");
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Phone Number : "+phone);
        System.out.println("Email Address : "+email);
        System.out.println("\n");
    }
    
    
}
