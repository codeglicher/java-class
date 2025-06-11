package Calculator;
public class Div{
    int sol(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}