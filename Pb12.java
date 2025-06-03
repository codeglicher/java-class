import java.util.*;
class Calculator{
    int a,b;
    Calculator(){
        a=0;
        b=0;
        System.out.println("The values of a and b are:"+a+" "+b);
    }
    Calculator(int p, int q){
        this.a=p;
        this.b=q;
        System.out.println("The values of a and b are:"+a+" "+b);
    }
    Calculator(int p, int q, char c){
        if(c=='+'){
            System.out.println("The sum of a and b is:"+(p+q));
        } else if(c=='-'){
            System.out.println("The difference of a and b is:"+(p-q));
        } else if(c=='*'){
            System.out.println("The product of a and b is:"+(p*q));
        } else if(c=='/'){
            System.out.println("The division of a and b is:"+(p/q));
        } else {
            System.out.println("Invalid operation");
        }
    }
}

class Pb12{
    public static void main(String args[]){
        Calculator ob=new Calculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");   
        int x=sc.nextInt();
        int y=sc.nextInt();
        Calculator ob1=new Calculator(x,y);
        System.out.println("Enter the operation to be performed (+, -, *, /):");
        char op=sc.next().charAt(0);
        Calculator ob2=new Calculator(x,y,op);
    }
}