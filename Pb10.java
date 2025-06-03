class Parent{
    int calculate(int a, int b){
        return (a+b)*(a+b);
    }
}
class Child extends Parent{
    int calculate(int a, int b, int c){
        return (a+b+c)*(a+b+c)*(a+b+c);
    }
}
public class Pb10{
    public static void main(String args[]){
        Parent ob1=new Parent();
        Child ob2=new Child();
        System.out.println("Parent class method: " + ob1.calculate(2, 3));
        System.out.println("Child class method: " + ob2.calculate(2, 3, 4));
        System.out.println("Child class method with Parent class parameters: " + ob2.calculate(2, 3));
    }
}