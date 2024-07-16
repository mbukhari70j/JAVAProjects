package Package1;
public class ArrayListDemo {
    public static void main(String[] args){
    int x = 10;
    int y = 0;
    try{
        divide(x, y);
    }
    catch(Exception e ){
        System.out.println("Error" + e.getMessage());
    }
    finally{
        System.out.println("finally");
    }
    }
    static int divide(int x, int y) throws ArithmeticException {
        if(y == 0) {
            throw new ArithmeticException("Alert! Divide by zero");
        }
        return x / y;
    }
}