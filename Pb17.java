import java.util.*;
class Pb17{
    Scanner sc=new Scanner(System.in);
    void input(int[][] arr){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                arr[i][j]=sc.nextInt(); 
            }
        }
    }
    void display(int[][] arr){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        
        int[][] arr1=new int[3][3];
        int[][] arr2=new int[3][3];
        int[][] arr3=new int[3][3];
        System.out.println("Enter elements for first matrix:");
        Pb17 obj1=new Pb17();
        obj1.input(arr1);
        System.out.println("Enter elements for second matrix:");
        Pb17 obj2=new Pb17();
        obj2.input(arr2);
        System.out.println("First Matrix:");
        obj1.display(arr1);
        System.out.println("Second Matrix:");
        obj2.display(arr2);
        System.out.println("Sum of the two matrices:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        Pb17 obj3=new Pb17();
        obj3.display(arr3);
    }
}