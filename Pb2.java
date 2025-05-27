// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Pb2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        Count ob=new Count();
        ob.vowels(st.toLowerCase());
    }
}
class Count{
    void vowels(String a){
        int count=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int l=a.length();
        for(int i=0; i<l; i++){
            char c=a.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count+=1;
            }
            else if(c>='a' && c<='z'){
                count1+=1;
            }
            else if(Character.isDigit(c)){
                count2+=1;
            }
            else{
                count3+=1;
            }
        }
        System.out.println("Number of vowels are "+count+" number of consonents are "+count1+" number of digits are "+count2+" number of special characters are "+count3);
    }
    
}