import java.util.*;
class Pb1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        Check ob=new Check();
        ob.chec(st);
    }
}
class Check{
    void chec(String s){
        int a=s.length();
        int j=a-1;
        boolean isPalindrome = true;
        for(int i=0; i < a/2; i++){
            if(s.charAt(i) != s.charAt(j)){
                System.out.println("Not palindrome");
                isPalindrome = false;
                break;
            }
            j = j - 1;
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }
    }
}