import java.util.Scanner;
class Shape{
    void display(){
        System.out.println("This is a shape(Super method)");
    }
}
class Circle extends Shape{
    int r;
    Circle(int ra){
        this.r=ra;
    }
    void display(){
        System.out.println("This is the circle of area: "+(3.14*r*r));
        super.display();
    }
    
}
class Rectangle extends Shape{
    int l,b;
    Rectangle(int len, int bre){
        this.l=len;
        this.b=bre;
    }
    void display(){
        System.out.println("This is the rectangel with area:"+(l*b));
        super.display();
    }
}
class Pb14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        int radius = sc.nextInt();
        Circle c = new Circle(radius);
        c.display(); 
        System.out.println("Enter the length and breadth of the rectangle :");
        int length = sc.nextInt();
        int breadth = sc.nextInt(); 
        Rectangle r = new Rectangle(length, breadth);
        r.display();
    }
}