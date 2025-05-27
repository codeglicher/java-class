// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Pb7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String st=sc.nextLine();
        System.out.println("Enter the String to find in the Sentence: ");
        String s=sc.nextLine();
        boolean f=st.startsWith(s);
        boolean l=st.endsWith(s);
        if(f && l){
            System.out.println("The sentence starts and ends with the given string");
        }
        else if(f){
            System.out.println("The sentence only  starts with the given string");
        }
        else if(l){
            System.out.println("The sentence only ends with the given string");
        }
        else{
            System.out.println("The sentence donot starts or ends with the given string");
        }
    }
}