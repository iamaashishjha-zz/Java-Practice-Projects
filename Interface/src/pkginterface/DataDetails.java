package pkginterface;

import java.util.Scanner;

public class DataDetails implements Inter{
    private int cid;
    private String cname; 
    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill the details");
        
        System.out.println("Enter Customer Id : ");
        cid = sc.nextInt();
        
        System.out.println("Enter customer name : ");
        cname = sc.next();
    }
    public void setData(){
        System.out.println("\n");
        System.out.println("Customer Id : "+cid);
        System.out.println("Customer Name : "+cname);
    }
}
