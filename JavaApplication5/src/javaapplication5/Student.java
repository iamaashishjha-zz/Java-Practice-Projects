/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Phanindra
 */
public class Student {
    private String name;
    private Course myCourse;
    
    public Student(String name, int id, double fee){
        this.name=name;
        myCourse= new Course(id,fee);
    }
    
    
    
}
