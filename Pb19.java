import java.util.*;
class Pb19{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        boolean con=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("The string is not a palindrome.");
                con=false;
                break;
            }
        }
        if(con){
            System.out.println("The string is a palindrome.");
        }
    }
}