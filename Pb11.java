class Calculator{
    void calculate(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    void calculate(int a, float b) {
        System.out.println("Subtract: " + (a - b));
    }
    void calculate(float a, int b) {
        System.out.println("Multiply: " + (a * b));
    }
    void calculate(float a, float b) {
        System.out.println("Divide: " + (a / b));
    }
}

class Pb11{
    public static void main(String args[]){
        Calculator calc = new Calculator();
        calc.calculate(10, 20);         
        calc.calculate(10, 5.5f);       
        calc.calculate(5.5f, 10);       
        calc.calculate(10.0f, 2.0f);    
    }
}