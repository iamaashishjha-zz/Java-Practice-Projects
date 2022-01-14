/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

/**
 *
 * @author ethan
 */
public class StudentDetail {

    
    private int sid = 100;
    private String name;
    private String course;
    
    public int getSid(){
        return sid;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCourse() {
        return course;
    }
    
    public void setSid(int sid){
        this.sid = sid;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
}
