import java.util.*;
class Pb16{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int f=1;
        while(n!=0){
            f=f*n;
            n--;
        }
        System.out.println("Factorial is: "+f);
    }
}