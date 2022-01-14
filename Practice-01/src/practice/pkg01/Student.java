/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import practice.pkg01.Course;

package practice.pkg01;

/**
 *
 * @author ethan
 */
public class Student {
    private String name;
    
    Course myCourse = new Course();
    
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Course ID : ");
        
    }
}
