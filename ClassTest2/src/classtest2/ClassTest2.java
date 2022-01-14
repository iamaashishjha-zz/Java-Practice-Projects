
package classtest2;


public class ClassTest2 {

    public boolean equal (Object obj){
        if(obj instanceof Test){
            Test obj1 = (Test) obj;
            return (obj1.x == this.x && obj1.b.equals(b));
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        equal();
    }
    
}
