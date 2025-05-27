import java.util.*;
class Pb4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        System.out.println("Enter the character to find index: ");
        String s=sc.nextLine();
        int f=st.indexOf(s);
        int l=st.lastIndexOf(s);
        System.out.println("The first occurance of "+(s)+" in String is "+(f+1)+" and last occurance is "+(l+1));
    }
}