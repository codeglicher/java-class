import java.util.Scanner;
abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
    int r;
    Circle(int ra){
        this.r=ra;
    }
    void area(){
        System.out.println("Area of the circle is: "+(3.14*r*r));
    }
}
class Rectangle extends Shape{
    int l,b;
    Rectangle(int len, int bre){
        this.l=len;
        this.b=bre;
    }
    void area(){
        System.out.println("Area of the rectangle is:"+(l*b));
    }
}
class Pb13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        int radius = sc.nextInt();
        Circle c = new Circle(radius);
        c.area(); 
        System.out.println("Enter the length and breadth of the rectangle :");
        int length = sc.nextInt();
        int breadth = sc.nextInt(); 
        Rectangle r = new Rectangle(length, breadth);
        r.area();
    }
}