import java.util.Scanner;

public class evenArray {
    public static void main(String args[]) {
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements in the array: ");
        n=sc.nextInt(); 
        int[] array = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        
        for (int i=0; i<n; i++){
        array[i]=sc.nextInt(); 
        System.out.println("Elements of the array in even position are: ");
            
        for (int j=1; j<array.length; j=j+2){
            System.out.println(array[j]);   
            }
        }
     }

}

