/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class Name {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String a;
        String b;
        
        System.out.println("Enter your Name : ");
        a = sc.nextLine();
        
        System.out.println("Enter your Course : ");
        b = sc.nextLine();
        
        
        System.out.println(a);
        System.out.println(b);
    }
}
