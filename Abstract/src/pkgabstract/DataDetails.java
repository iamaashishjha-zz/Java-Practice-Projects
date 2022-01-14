package pkgabstract;

import java.util.Scanner;

public class DataDetails extends Abs {
    private int cid;
    private String cname;
   public void getData(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Fill the following details please");
       
       System.out.println("Enter customer ID : ");
       cid = sc.nextInt();
       
       System.out.println("Enter customer name : ");
       cname = sc.next();
   }
   
   public void setData(){
       System.out.println("\n");
       System.out.println("Customer Id : "+cid);
       System.out.print("Customer Name : "+cname);
       System.out.println("\n");
   }
}
