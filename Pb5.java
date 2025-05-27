import java.util.*;
class Pb5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        int l=st.length();
        for(int i=l-1; i>-1; i--){
            System.out.print(st.charAt(i));
        }
    }
}