import Calculator.Add;
import Calculator.Sub;
import Calculator.Mul;  
import Calculator.Div;
class Pb18{
    public static void main(String args[]){
        Add a=new Add();
        Sub b=new Sub();
        Mul c=new Mul();
        Div d=new Div();
        System.out.println("Addition: " + a.sol(10, 20));
        System.out.println("Subtraction: " + b.sol(20, 10));        
        System.out.println("Multiplication: " + c.sol(10, 20));
        System.out.println("Division: " + d.sol(20, 10));

    }
}