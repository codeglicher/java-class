import java.util.*;
class Pb15{
    public static void main(String args[]){
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        while(n!=0){
            num=num*10+(n%10);
            n=n/10;
        }
        System.out.println("The reverse of the number is: " + num);
    }
}