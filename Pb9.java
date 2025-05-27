import java.util.*;
class Operations{
    void adder(String s1, String s2){
        String s3=s1+" "+s2;
        System.out.println("Concatenated String: " + s3);
    }
    void len(String s1){
        System.out.println("Length of the string: " + s1.length());
    }
    void charAt(String s1, int index){
        if(index >= 0 && index < s1.length()){
            System.out.println("Character at index " + index + ": " + s1.charAt(index));
        } else {
            System.out.println("Index out of bounds");
        }
    }
    void compare(String s1, String s2){
        if(s1.equals(s2)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
    void ignoreCase(String s1, String s2){
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Strings are equal (ignoring case)");
        } else {
            System.out.println("Strings are not equal (ignoring case)");
        }
    }
    void startsWith(String s1, String prefix){
        if(s1.startsWith(prefix)){
            System.out.println("String starts with " + prefix);
        } else {
            System.out.println("String does not start with " + prefix);
        }
    }
    void endsWith(String s1, String suffix){
        if(s1.endsWith(suffix)){
            System.out.println("String ends with " + suffix);
        } else {
            System.out.println("String does not end with " + suffix);
        }
    }
    void search(String s1, String sub){
        int index = s1.indexOf(sub);
        if(index != -1){
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found");
        }
    }
    void convert(String s1){
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());
    }
}

class arrayoperations{
    void display(int[] arr){
        System.out.println("Array elements:");
        for(int i=0; i<arr.length; i++){
            System.out.println("arr["+i+"] = " + arr[i]);
        }
    }
    void index(int[] arr, int index){
        if(index >= 0 && index < arr.length){
            System.out.println("Element at index " + index + ": " + arr[index]);
        } else {
            System.out.println("Index out of bounds");
        }
    }   
    void search(int[] arr, int value){
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value){
                System.out.println("Value " + value + " found at index: " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Value " + value + " not found in the array");
        }
    }
    void sort(int[] arr){
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    void dowhile(int[] arr){
        int i=0;
        do { 
            System.out.println("do while loop: "+i);
            i++;
        } while (i>0 && i<arr.length);
    }
    
}

class Pb9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String st="I am proud VITian";
        String[] words = st.split(" ");
        int[] arr=new int[5];
        for(int i=0; i<5;i++){
            System.out.println("Enter the value for arr["+i+"]:");
            arr[i]=sc.nextInt();
        }
        Operations op = new Operations();
        op.adder(words[0], words[1]);
        op.len(st); 
        op.charAt(st, 5);
        op.compare(words[0], words[1]);
        op.ignoreCase(words[0], words[1]);
        op.startsWith(st, "I am");
        op.endsWith(st, "VITian");
        op.search(st, "proud");
        op.convert(st);
        arrayoperations arrOps = new arrayoperations();
        System.out.println("Array Operations:");
        arrOps.display(arr);  
        System.out.println("Enter index to access in array:");
        int index = sc.nextInt();
        arrOps.index(arr, index);   
        System.out.println("Enter value to search in array:");
        int value = sc.nextInt();
        arrOps.search(arr, value);
        arrOps.sort(arr);
        arrOps.dowhile(arr);
    }
}