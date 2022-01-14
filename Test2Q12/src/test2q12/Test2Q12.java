package test2q12;


public class Test2Q12 {

    private int x;
    private String b;

    public boolean equal(Object obj) {
        if (obj instanceof Test2Q12) {
            Test2Q12 obj1 = (Test2Q12) obj;
            return(obj1.x == this.x && obj1.b.equals(b));
        } else {
            return false;
        }
    }

}
