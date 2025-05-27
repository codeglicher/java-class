import java.util.*;
class Pb6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        String s[];
        s=st.split(" ");
        int l=s.length;
        for(int i=0; i<l; i++){
            System.out.println(s[i]);
        }
    }
}