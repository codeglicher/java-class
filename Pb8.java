import java.util.*;
class Pb8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String str=sc.nextLine();
        String words[] = str.split(" ");
        char letters[] = new char[words.length];
        for(int i=0; i<words.length;i++){
            letters[i]=words[i].charAt(0);
        }
        for(int j=0; j<letters.length; j++){
            System.out.println(letters[j]);
        }
    }
}