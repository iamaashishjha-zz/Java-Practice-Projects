/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancea;

import java.util.Scanner;

public class Student {

    private int sid;
    private String sname;
    
    public void getStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Roll Number : ");
        sid = sc.nextInt();
        
        System.out.println("Enter Student Name : ");
        sname = sc.next();
    }
    
    public void putStudent(){
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Student Roll number is : "+sid);
        System.out.println("Student name is : "+sname);
    }
    
}
