class Calci{
    public static void main(String args[]){
        Calculator c = new Calculator();
        c.add(10, 20);
        c.sub(20, 10);
        c.mul(10, 20);
        c.div(20, 10);
    }
}
class Calculator{
    int a,b;
    void add(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Sum: "+(a+b));
    }
    void sub(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Difference: "+(a-b));
    }
    void mul(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Multiplication: "+(a*b));
    }
    void div(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Difference: "+(a/b));
    }
}

