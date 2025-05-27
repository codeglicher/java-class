import java.util.*;
class Pb3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String1");
        String st=sc.nextLine();
        System.out.println("Enter the String2");
        String st1=sc.nextLine();
        boolean t=st.equalsIgnoreCase(st1);
        if(t){
            System.out.println("The strings are equal in ignorance case");
        }
        else{
            System.out.println("The strings are not equal in ignorance case");
        }
    }
}