import java.util.*;
class Pb21{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        s=s.toLowerCase();
        int c=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                c++;
            }
        }
        System.out.println("Number of vowels in String is: "+c);
    }
}